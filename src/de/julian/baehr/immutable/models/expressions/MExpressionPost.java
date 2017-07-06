package de.julian.baehr.immutable.models.expressions;

public class MExpressionPost extends MExpression {

	private MExpression expression;
	private String op;
	
	public void setOp(String op) {
		this.op = op;
	}
	
	public void setExpression(MExpression expression) {
		this.expression = expression;
	}
	
	@Override
	public String toString() {
		return expression.toString() + op;
	}
}
