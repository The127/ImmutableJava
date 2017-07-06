package de.julian.baehr.immutable.models;

import de.julian.baehr.immutable.models.statements.MStatement;

public class MBlockStatement {

	private MLocalVariableDeclarationStatement declarationStatement;
	private MStatement statement;
	private MType typeDeclaration;
	
	public void setDeclarationStatement(MLocalVariableDeclarationStatement declarationStatement) {
		this.declarationStatement = declarationStatement;
	}
	
	public void setTypeDeclaration(MType typeDeclaration) {
		this.typeDeclaration = typeDeclaration;
	}
	
	public void setStatement(MStatement statement) {
		this.statement = statement;
	}
	
	@Override
	public String toString() {
		if(statement != null)
			return statement.toString();
		else if(typeDeclaration != null)
			return typeDeclaration.toString();
		else 
			return declarationStatement.toString();
	}
}
