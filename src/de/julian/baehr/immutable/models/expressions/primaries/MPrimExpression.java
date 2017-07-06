package de.julian.baehr.immutable.models.expressions.primaries;

import de.julian.baehr.immutable.models.expressions.MExpression;

public class MPrimExpression extends MPrimary {

	private MExpression expression;
	
	public void setExpression(MExpression expression) {
		this.expression = expression;
	}
	
	@Override
	public String toString() {
		return "(" + expression.toString() + ")";
	}
}
