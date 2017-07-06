package de.julian.baehr.immutable.models.expressions;

public class MExpressionEquals extends MExpression {

	private MExpression expr1, expr2;
	private String op;
	
	public void setOp(String op) {
		this.op = op;
	}
	
	public void setExpr1(MExpression expr1) {
		this.expr1 = expr1;
	}
	
	public void setExpr2(MExpression expr2) {
		this.expr2 = expr2;
	}
	
	@Override
	public String toString() {
		return expr1.toString() + " " + op + " " + expr2.toString();
	}
}
