package de.julian.baehr.immutable.models.expressions;

import de.julian.baehr.immutable.models.MSpecialParameters;

public class MExpressionAutoCpy extends MExpression {

	private final String className;
	
	private MSpecialParameters specialParameters;
	
	public MExpressionAutoCpy(String className) {
		this.className = className;
	}
	
	public void setSpecialParameters(MSpecialParameters specialParameters) {
		this.specialParameters = specialParameters;
	}
	
	@Override
	public String toString() {
		return new StringBuilder()
				.append("new ")
				.append(className)
				.append(" ")
				.append(specialParameters.toString())
				.toString();
	}
}
