package de.julian.baehr.immutable.models.expressions;

import de.julian.baehr.immutable.models.MSuperSuffix;

public class MExpressionDotSuperSuffix extends MExpression {

	private MExpression expression;
	private MSuperSuffix superSuffix;
	
	public void setSuperSuffix(MSuperSuffix superSuffix) {
		this.superSuffix = superSuffix;
	}
	
	public void setExpression(MExpression expression) {
		this.expression = expression;
	}
	
	@Override
	public String toString() {
		return expression.toString() + ".super " + superSuffix.toString();
	}
}
