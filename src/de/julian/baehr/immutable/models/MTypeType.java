package de.julian.baehr.immutable.models;

import org.antlr.v4.runtime.ParserRuleContext;

import de.julian.baehr.immutable.listeners.exceptions.ListenerException;

public class MTypeType {

	private String className = null;
	private boolean isPrimitive = false;
	private final int arrayDimensions;
	
	public MTypeType(int arrayDimensions){
		this.arrayDimensions = arrayDimensions;
	}
	
	public boolean isPrimitive() {
		return isPrimitive;
	}
	
	public void addClassOrInterfaceType(String classOrInterfaceType){
		if(className != null)
			className += "." + classOrInterfaceType;
		else
			className = classOrInterfaceType;
	}
	
	public void addTypeParameters(String typeParameters){
		className += typeParameters;
	}
	
	public void setPrimitive(String primitiveName, ParserRuleContext ctx){
		switch(primitiveName){
		case "boolean":
		case "char":
		case "byte":
		case "short":
		case "int":
		case "long":
		case "float":
		case "double":
			break;
		default:
			throw new ListenerException("Unkown primitive type", ctx);
		}
		isPrimitive = true;
		className = primitiveName;
	}
	
	@Override
	public String toString() {
		String brackets = "";
		for(int i = 0; i < arrayDimensions; i++)
			brackets += "[]";
		return className + brackets;
	}
}
