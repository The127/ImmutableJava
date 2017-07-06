package de.julian.baehr.immutable.models;

import org.antlr.v4.runtime.ParserRuleContext;

import de.julian.baehr.immutable.allow.IReadableImportValidator;

public class MImportStatic extends MImport {
	
	private final String methodName;
	
	public MImportStatic(IReadableImportValidator validator, String fullyQualifiedMethodName, String methodName, ParserRuleContext ctx) {
		super(validator, fullyQualifiedMethodName, ctx);
		this.methodName = methodName;
	}

	public String getMethodName() {
		return methodName;
	}
	
	@Override
	public String toString() {
		return "import static " + getFullyQualifiedClassName() + "." + methodName + ";";
	}
}
