package de.julian.baehr.immutable.models;

import java.lang.reflect.Modifier;

import org.antlr.v4.runtime.ParserRuleContext;

public class MGenericConstructor implements IModifiable {

	private MModifiers modifiers = new MModifiers(Modifier.constructorModifiers());
	private MTypeParameters typeParameters;
	private MConstructor constructor;
	
	public void setConstructor(MConstructor constructor) {
		this.constructor = constructor;
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
	
	@Override
	public String toString() {
		return new StringBuilder()
				.append(modifiers.toString()).append(" ")
				.append(typeParameters.toString()).append(" ")
				.append(constructor.toString())
				.toString();
	}
}
