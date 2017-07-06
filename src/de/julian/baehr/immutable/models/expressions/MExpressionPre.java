package de.julian.baehr.immutable.models.expressions;

public class MExpressionPre extends MExpression {

	private String op;
	private MExpression expression;
	
	public void setExpression(MExpression expression) {
		this.expression = expression;
	}
	
	public void setOp(String op) {
		this.op = op;
	}
	
	@Override
	public String toString() {
		return op + expression.toString();
	}
}
