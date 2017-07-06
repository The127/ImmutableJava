package de.julian.baehr.immutable.models;

import org.antlr.v4.runtime.ParserRuleContext;

public class MGenericInterfaceMethod implements IModifiable{

	private MModifiers modifiers = new MModifiers(MInterfaceMethod.INTERFACE_METHOD_MODIFIERS);
	private MTypeParameters typeParameters;
	private MInterfaceMethod method;
	
	public void setMethod(MInterfaceMethod method) {
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
	
	@Override
	public String toString() {
		return new StringBuilder()
				.append(modifiers.toString()).append(" ")
				.append(typeParameters.toString()).append(" ")
				.append(method)
				.toString();
	}
}
