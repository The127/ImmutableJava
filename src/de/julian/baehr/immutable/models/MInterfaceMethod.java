package de.julian.baehr.immutable.models;

import java.lang.reflect.Modifier;

import org.antlr.v4.runtime.ParserRuleContext;

import de.julian.baehr.immutable.listeners.exceptions.ListenerException;

public class MInterfaceMethod implements IModifiable {

	public static final int INTERFACE_METHOD_MODIFIERS = Modifier.ABSTRACT | Modifier.PUBLIC | Modifier.STRICT;
	private MModifiers modifiers = new MModifiers(INTERFACE_METHOD_MODIFIERS);
	
	private final boolean areModifiersAllowed;
	private MTypeType resultType;
	private String name;
	private MFormalParameters formalParameters;
	private MQualifiedNameList exceptions;
	
	public MInterfaceMethod(boolean areModifiersAllowed){
		this.areModifiersAllowed = areModifiersAllowed;
		resultType = new MTypeType(0);
		resultType.addClassOrInterfaceType("void");
	}
	
	@Override
	public void simpleModifier(String simpleModifier, ParserRuleContext ctx) {
		if(!areModifiersAllowed)
			throw new ListenerException("Modifiers not allowed here.", ctx);
		else
			modifiers.simpleModifier(simpleModifier, ctx);
	}

	@Override
	public void annotation(MAnnotation annotation, ParserRuleContext ctx) {
		if(!areModifiersAllowed)
			throw new ListenerException("Modifiers not allowed here.", ctx);
		else
			modifiers.annotation(annotation, ctx);
	}
	
	public void setResultType(MTypeType resultType) {
		this.resultType = resultType;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setFormalParameters(MFormalParameters formalParameters) {
		this.formalParameters = formalParameters;
	}
	
	public void setExceptions(MQualifiedNameList exceptions) {
		this.exceptions = exceptions;
	}

	@Override
	public String toString() {
		return new StringBuilder()
				.append(modifiers.toString()).append(" ")
				.append(resultType.toString()).append(" ")
				.append(name).append(" ")
				.append(formalParameters.toString()).append(" ")
				.append(ModelUtil.ifNotNull(exceptions, () -> "throws " + exceptions.toString()))
				.append(";")
				.toString();
	}
}
