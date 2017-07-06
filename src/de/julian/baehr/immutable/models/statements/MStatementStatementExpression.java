package de.julian.baehr.immutable.models.statements;

import de.julian.baehr.immutable.models.expressions.MExpression;

public class MStatementStatementExpression extends MStatement {

	private MExpression expression;
	
	public MStatementStatementExpression(MExpression expression){
		this.expression = expression;
	}
	
	@Override
	public String toString() {
		return expression.toString() + ";";
	}
}
