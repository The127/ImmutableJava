package de.julian.baehr.immutable.models;

import java.lang.reflect.Modifier;

import org.antlr.v4.runtime.ParserRuleContext;

public class MGenericMethod implements IModifiable {

	private MModifiers modifiers = new MModifiers(Modifier.methodModifiers());
	private MTypeParameters typeParameters;
	private MMethod method;
	
	public void setMethod(MMethod method) {
		this.method = method;
	}
	
	public void setTypeParameters(MTypeParameters typeParameters) {
		this.typeParameters = typeParameters;
	}
	
	@Override
	public void simpleModifier(String simpleModifier, ParserRuleContext ctx) {
		modifiers.simpleModifier(simpleModifier, ctx);
	}

	@Override
	public void annotation(MAnnotation annotation, ParserRuleContext ctx) {
		modifiers.annotation(annotation, ctx);
	}
	
	public String toString() {
		return new StringBuilder()
				.append(modifiers.toString()).append(" ")
				.append(typeParameters.toString()).append(" ")
				.append(method.toString())
				.toString();
	}

}
