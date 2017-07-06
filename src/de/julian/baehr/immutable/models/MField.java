package de.julian.baehr.immutable.models;

import java.lang.reflect.Modifier;

import org.antlr.v4.runtime.ParserRuleContext;

public class MField implements IModifiable {

	private MModifiers modifiers = new MModifiers(Modifier.fieldModifiers());
	private MTypeType type;
	private MVariableDeclarators declarators;
	
	public MVariableDeclarators getDeclarators() {
		return declarators;
	}
	
	@Override
	public void simpleModifier(String simpleModifier, ParserRuleContext ctx) {
		modifiers.simpleModifier(simpleModifier, ctx);
	}

	@Override
	public void annotation(MAnnotation annotation, ParserRuleContext ctx) {
		modifiers.annotation(annotation, ctx);
	}
	
	public void setType(MTypeType type) {
		this.type = type;
	}
	
	public void setDeclarators(MVariableDeclarators declarators) {
		this.declarators = declarators;
	}
	
	public boolean isStatic(){
		return modifiers.alreadyContains(Modifier.STATIC);
	}
	
	public void makeFinal(){
		if(!modifiers.alreadyContains(Modifier.FINAL))
			modifiers.simpleModifier("final", null);
	}
	
	public MTypeType getType(){
		return type;
	}

	@Override
	public String toString() {
		return new StringBuilder()
				.append(modifiers.toString()).append(" ")
				.append(type.toString()).append(" ")
				.append(declarators.toString())
				.append(";")
				.toString();
	}
}
