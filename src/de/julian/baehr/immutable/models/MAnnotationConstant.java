package de.julian.baehr.immutable.models;

import java.lang.reflect.Modifier;

import org.antlr.v4.runtime.ParserRuleContext;

public class MAnnotationConstant implements IModifiable {
	
	public static final int ANNOTATION_CONSTANT_MODIFIERS = 
			Modifier.PUBLIC | Modifier.STATIC | Modifier.FINAL;
	
	private final MModifiers modifiers = new MModifiers(ANNOTATION_CONSTANT_MODIFIERS);
	private MTypeType typeType;
	private MVariableDeclarators variableDeclaration;
	
	public void setTypeType(MTypeType typeType){
		this.typeType = typeType;
	}
	
	public void setVariableDeclaration(MVariableDeclarators declaration){
		this.variableDeclaration = declaration;
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
		return modifiers.toString() + " " + typeType.toString()
			+ " " + variableDeclaration.toString() + ";";
	}
}
