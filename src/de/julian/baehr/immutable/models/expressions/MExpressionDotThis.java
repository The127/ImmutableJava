package de.julian.baehr.immutable.models.expressions;

public class MExpressionDotThis  extends MExpression {

	private MExpression expression;
	
	public void setExpression(MExpression expression) {
		this.expression = expression;
	}
	
	@Override
	public String toString() {
		return expression.toString() + ".this";
	}
}
