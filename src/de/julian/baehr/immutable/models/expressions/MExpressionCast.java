package de.julian.baehr.immutable.models.expressions;

import de.julian.baehr.immutable.models.MTypeType;

public class MExpressionCast extends MExpression {

	private MExpression expression;
	private MTypeType type;
	
	public void setType(MTypeType type) {
		this.type = type;
	}
	
	public void setExpression(MExpression expression) {
		this.expression = expression;
	}
	
	public String toString() {
		return " ( " + type.toString() + " ) " + expression.toString();
	}
}
