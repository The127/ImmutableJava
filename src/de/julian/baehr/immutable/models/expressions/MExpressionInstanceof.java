package de.julian.baehr.immutable.models.expressions;

import de.julian.baehr.immutable.models.MTypeType;

public class MExpressionInstanceof extends MExpression {

	private MExpression expr1;
	private MTypeType type;
	
	public void setExpr1(MExpression expr1) {
		this.expr1 = expr1;
	}
	
	public void setType(MTypeType type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return expr1.toString() + " instanceof " + type.toString();
	}
}
