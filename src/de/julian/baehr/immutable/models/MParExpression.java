package de.julian.baehr.immutable.models;

import de.julian.baehr.immutable.models.expressions.MExpression;

public class MParExpression {

	private MExpression expression;
	
	public void setExpression(MExpression expression) {
		this.expression = expression;
	}
	
	@Override
	public String toString() {
		return "(" + expression.toString() + ")";
	}
}
