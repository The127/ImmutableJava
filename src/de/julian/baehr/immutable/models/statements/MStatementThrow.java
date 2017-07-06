package de.julian.baehr.immutable.models.statements;

import de.julian.baehr.immutable.models.expressions.MExpression;

public class MStatementThrow extends MStatement {

	private MExpression expression;
	
	public void setExpression(MExpression expression) {
		this.expression = expression;
	}
	
	@Override
	public String toString() {
		return new StringBuilder()
				.append(" throw ")
				.append(expression.toString())
				.append(";")
				.toString();
	}
}
