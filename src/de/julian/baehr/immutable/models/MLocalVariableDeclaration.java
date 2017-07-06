package de.julian.baehr.immutable.models;

import java.lang.reflect.Modifier;

import org.antlr.v4.runtime.ParserRuleContext;

public class MLocalVariableDeclaration implements IModifiable{

	private MModifiers modifiers = new MModifiers(Modifier.FINAL);
	private MTypeType type;
	private MVariableDeclarators declarators;
	
	public void setType(MTypeType type) {
		this.type = type;
	}
	
	public void setDeclarators(MVariableDeclarators declarators) {
		this.declarators = declarators;
	}

	@Override
	public void simpleModifier(String simpleModifier, ParserRuleContext ctx) {
		modifiers.simpleModifier(simpleModifier, ctx);
	}

	@Override
	public void annotation(MAnnotation annotation, ParserRuleContext ctx) {
		modifiers.annotation(annotation, ctx);
	}
	
	@Override
	public String toString() {
		return new StringBuilder()
				.append(modifiers.toString()).append(" ")
				.append(type.toString()).append(" ")
				.append(declarators.toString())
				.toString();
	}
}
