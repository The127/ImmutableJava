package de.julian.baehr.immutable.models.expressions;

import de.julian.baehr.immutable.models.expressions.primaries.MPrimary;

public class MExpressionPrimary extends MExpression {

	private MPrimary primary;
	
	public void setPrimary(MPrimary primary) {
		this.primary = primary;
	}
	
	@Override
	public String toString() {
		return primary.toString();
	}
}
