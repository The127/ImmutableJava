package de.julian.baehr.immutable.models.statements;

import de.julian.baehr.immutable.models.ModelUtil;
import de.julian.baehr.immutable.models.expressions.MExpression;

public class MStatementReturn extends MStatement {

	private MExpression expression;
	
	public void setExpression(MExpression expression) {
		this.expression = expression;
	}
	
	@Override
	public String toString() {
		return new StringBuilder()
				.append("return ")
				.append(ModelUtil.ifNotNull(expression, () -> expression.toString()))
				.append(";")
				.toString();
	}
}
