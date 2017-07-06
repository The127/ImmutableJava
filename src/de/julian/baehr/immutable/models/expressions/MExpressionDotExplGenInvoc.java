package de.julian.baehr.immutable.models.expressions;

import de.julian.baehr.immutable.models.MExplicitGenericInvocation;

public class MExpressionDotExplGenInvoc extends MExpression {

	private MExpression expression;
	private MExplicitGenericInvocation explicitGenericInvocation;
	
	public void setExplicitGenericInvocation(MExplicitGenericInvocation explicitGenericInvocation) {
		this.explicitGenericInvocation = explicitGenericInvocation;
	}
	
	public void setExpression(MExpression expression) {
		this.expression = expression;
	}
	
	@Override
	public String toString() {
		return expression.toString() + " . " + explicitGenericInvocation.toString();
	}
}
