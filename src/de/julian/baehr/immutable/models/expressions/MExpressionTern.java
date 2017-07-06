package de.julian.baehr.immutable.models.expressions;

public class MExpressionTern extends MExpression {

private MExpression expr1, expr2, expr3;
	
	public void setExpr1(MExpression expr1) {
		this.expr1 = expr1;
	}
	
	public void setExpr2(MExpression expr2) {
		this.expr2 = expr2;
	}
	
	public void setExpr3(MExpression expr3) {
		this.expr3 = expr3;
	}
	
	@Override
	public String toString() {
		return expr1.toString() + " ? " + expr2.toString() + " : " + expr3.toString();
	}
}
