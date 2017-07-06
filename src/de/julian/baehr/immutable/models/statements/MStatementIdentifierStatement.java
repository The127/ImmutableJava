package de.julian.baehr.immutable.models.statements;

public class MStatementIdentifierStatement extends MStatement {

	private String identifier;
	private MStatement statement;
	
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	
	public void setStatement(MStatement statement) {
		this.statement = statement;
	}
	
	@Override
	public String toString() {
		return identifier + " : " + statement.toString();
	}
}
