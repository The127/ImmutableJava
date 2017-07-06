package de.julian.baehr.immutable.models.statements;

import de.julian.baehr.immutable.models.MParExpression;
import de.julian.baehr.immutable.models.ModelUtil;

public class MStatementIf extends MStatement {

	private MParExpression parExpression;
	private MStatement ifStatement;
	private MStatement elseStatement;
	
	public void setIfStatement(MStatement ifStatement) {
		this.ifStatement = ifStatement;
	}
	
	public void setElseStatement(MStatement elseStatement) {
		this.elseStatement = elseStatement;
	}
	
	public void setParExpression(MParExpression parExpression) {
		this.parExpression = parExpression;
	}
	
	@Override
	public String toString() {
		return new StringBuilder()
				.append("if ").append(parExpression).append(" ")
				.append(ifStatement.toString()).append(" ")
				.append(ModelUtil.ifNotNull(elseStatement, () -> "else " + elseStatement.toString()))
				.toString();
	}
}
