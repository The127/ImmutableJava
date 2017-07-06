package de.julian.baehr.immutable.models.statements;

import de.julian.baehr.immutable.models.MParExpression;

public class MStatementDo extends MStatement {

	private MStatement statement;
	private MParExpression parExpression;
	
	public void setStatement(MStatement statement) {
		this.statement = statement;
	}
	
	public void setParExpression(MParExpression parExpression) {
		this.parExpression = parExpression;
	}
	
	@Override
	public String toString() {
		return "do " + statement.toString() + " while " + parExpression.toString();
	}
}
