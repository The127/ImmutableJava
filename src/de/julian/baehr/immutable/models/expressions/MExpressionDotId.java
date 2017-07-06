package de.julian.baehr.immutable.models.expressions;

public class MExpressionDotId extends MExpression {

	private MExpression expression;
	private String id;
	
	public void setExpression(MExpression expression) {
		this.expression = expression;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return expression.toString() + " . " + id;
	}
}
