package de.julian.baehr.immutable.models.statements;

import de.julian.baehr.immutable.models.MParExpression;

public class MStatementWhile extends MStatement {

	private MParExpression parExpression;
	private MStatement statement;
	
	public void setParExpression(MParExpression parExpression) {
		this.parExpression = parExpression;
	}
	
	public void setStatement(MStatement statement) {
		this.statement = statement;
	}
	
	@Override
	public String toString() {
		return "while" + parExpression.toString() + statement.toString();
	}
}
