package de.julian.baehr.immutable.models;

import org.antlr.v4.runtime.ParserRuleContext;

import de.julian.baehr.immutable.allow.IReadableImportValidator;

public class MImportSingle extends MImport{

	public MImportSingle(IReadableImportValidator validator, String fullyQualifiedClassName, ParserRuleContext ctx) {
		super(validator, fullyQualifiedClassName, ctx);
	}

	@Override
	public String toString() {
		return "import " + getFullyQualifiedClassName() + ";";
	}
}
