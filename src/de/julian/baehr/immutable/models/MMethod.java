package de.julian.baehr.immutable.models;

import java.lang.reflect.Modifier;

import org.antlr.v4.runtime.ParserRuleContext;

import de.julian.baehr.immutable.listeners.exceptions.ListenerException;

public class MMethod implements IModifiable {

	private MModifiers modifiers = new MModifiers(Modifier.methodModifiers());
	private final boolean modifiersAllowed;
	
	private String name;
	private MTypeType resultType;
	private MFormalParameters formalParameters;
	private MQualifiedNameList exceptions;
	private MBlock methodBody;
	
	public MMethod(boolean modifiersAllowed){
		this.modifiersAllowed = modifiersAllowed;
		resultType = new MTypeType(0);
		resultType.addClassOrInterfaceType("void");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setResultType(MTypeType resultType) {
		this.resultType = resultType;
	}
	
	public void setFormalParameters(MFormalParameters formalParameters) {
		this.formalParameters = formalParameters;
	}
	
	public void setExceptions(MQualifiedNameList exceptions) {
		this.exceptions = exceptions;
	}
	
	public void setMethodBody(MBlock methodBody) {
		this.methodBody = methodBody;
	}
	
	@Override
	public void simpleModifier(String simpleModifier, ParserRuleContext ctx) {
		if(modifiersAllowed)
			modifiers.simpleModifier(simpleModifier, ctx);
		else
			throw new ListenerException("Modifiers after type parameters is not allowed.", ctx);
	}
	
	@Override
	public void annotation(MAnnotation annotation, ParserRuleContext ctx) {
		if(modifiersAllowed)
			modifiers.annotation(annotation, ctx);
		else
			throw new ListenerException("Annotations after type parameters is not allowed.", ctx);
	}

	private String getMethodBodyString(){
		if(methodBody != null)
			return methodBody.toString();
		else
			return ";";//abstract method
	}
	
	@Override
	public String toString() {
		return new StringBuilder()
				.append(modifiers.toString()).append(" ")
				.append(resultType.toString()).append(" ")
				.append(name).append(" ")
				.append(formalParameters.toString()).append(" ")
				.append(ModelUtil.ifNotNull(exceptions, () -> "throws " + exceptions.toString()))
				.append(getMethodBodyString())
				.toString();
	}
}
