package de.julian.baehr.immutable.models.statements;

import de.julian.baehr.immutable.models.ModelUtil;

public class MStatementBreak extends MStatement {

	private String identifier;
	
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	
	@Override
	public String toString() {
		return " break " + ModelUtil.ifNotNull(identifier, () -> identifier) + ";";
	}
}
