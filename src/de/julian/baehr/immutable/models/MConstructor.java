package de.julian.baehr.immutable.models;

import java.lang.reflect.Modifier;

import org.antlr.v4.runtime.ParserRuleContext;

import de.julian.baehr.immutable.listeners.exceptions.ListenerException;

public class MConstructor implements IModifiable {

	private final boolean modifiersAllowed;

	private MModifiers modifiers = new MModifiers(Modifier.constructorModifiers());
	private String className;
	private MFormalParameters formalParameters;
	private MQualifiedNameList exceptions;
	private MBlock constructorBody;
	
	public MConstructor(boolean modifiersAllowed){
		this.modifiersAllowed = modifiersAllowed;
	}
	
	public void setClassName(String className) {
		this.className = className;
	}
	
	public void setFormalParameters(MFormalParameters formalParameters) {
		this.formalParameters = formalParameters;
	}
	
	public MFormalParameters getFormalParameters() {
		return formalParameters;
	}
	
	public void setExceptions(MQualifiedNameList exceptions) {
		this.exceptions = exceptions;
	}
	
	public void setConstructorBody(MBlock constructorBody) {
		this.constructorBody = constructorBody;
	}

	@Override
	public void simpleModifier(String simpleModifier, ParserRuleContext ctx) {
		if(!modifiersAllowed)
			throw new ListenerException("Modifiers not allowed here.", ctx);
		else
			modifiers.simpleModifier(simpleModifier, ctx);
	}

	@Override
	public void annotation(MAnnotation annotation, ParserRuleContext ctx) {
		if(!modifiersAllowed)
			throw new ListenerException("Modifiers not allowed here.", ctx);
		else
			modifiers.annotation(annotation, ctx);
	}
	
	@Override
	public String toString() {
		return new StringBuilder()
				.append(modifiers.toString()).append(" ")
				.append(className).append(" ")
				.append(formalParameters.toString()).append(" ")
				.append(ModelUtil.ifNotNull(exceptions, () -> "throws " + exceptions.toString()))
				.append(constructorBody.toString())
				.toString();
	}
}
