package de.julian.baehr.immutable.models;

import org.antlr.v4.runtime.ParserRuleContext;

public class MEnumConstant implements IModifiable {

	private MModifiers modifiers = new MModifiers(0);//no modifiers allowed
	private String identifier;
	private MArguments arguments;
	private MClassBody classBody;
	
	public void setClassBody(MClassBody classBody) {
		this.classBody = classBody;
	}
	
	public void setArguments(MArguments arguments) {
		this.arguments = arguments;
	}
	
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
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
				.append(identifier).append(" ")
				.append(ModelUtil.ifNotNull(arguments, () -> arguments.toString()))
				.append(ModelUtil.ifNotNull(classBody, () -> classBody.toString()))
				.toString();
	}
}
