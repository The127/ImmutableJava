package de.julian.baehr.immutable.models;

import java.lang.reflect.Modifier;

import org.antlr.v4.runtime.ParserRuleContext;

public class MAnnotationMethod implements IModifiable {

	public static final int ANNOTATION_METHOD_MODIFIERS = 
			Modifier.PUBLIC | Modifier.ABSTRACT;
	
	private final MModifiers modifiers = new MModifiers(ANNOTATION_METHOD_MODIFIERS);
	private MTypeType typeType;
	
	private final String name;
	private MElementValue defaultvalue;
	public MAnnotationMethod(String name) {
		this.name = name;
	}
	
	public void setTypeType(MTypeType typeType) {
		this.typeType = typeType;
	}
	
	@Override
	public void simpleModifier(String simpleModifier, ParserRuleContext ctx) {
		modifiers.simpleModifier(simpleModifier, ctx);
	}

	@Override
	public void annotation(MAnnotation annotation, ParserRuleContext ctx) {
		modifiers.annotation(annotation, ctx);
	}
	
	public void setDefaultValue(MElementValue defaultValue){
		this.defaultvalue = defaultValue;
	}
	
	@Override
	public String toString() {
		return modifiers.toString() + " " + typeType.toString() + " " + name + "()" 
				+ ModelUtil.ifNotNull(defaultvalue, () -> " default " + defaultvalue.toString())
				+ ";";
	}
}
