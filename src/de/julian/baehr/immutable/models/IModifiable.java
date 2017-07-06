package de.julian.baehr.immutable.models;

import org.antlr.v4.runtime.ParserRuleContext;

public interface IModifiable {

	public void simpleModifier(String simpleModifier, ParserRuleContext ctx);
	public void annotation(MAnnotation annotation, ParserRuleContext ctx);
}
