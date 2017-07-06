package de.julian.baehr.immutable.models.statements;

import de.julian.baehr.immutable.models.ModelUtil;

public class MStatementContinue extends MStatement {

	private String identifier;
	
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	
	@Override
	public String toString() {
		return " continue " + ModelUtil.ifNotNull(identifier, () -> identifier) + ";";
	}
}
