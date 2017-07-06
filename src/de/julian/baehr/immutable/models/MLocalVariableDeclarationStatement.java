package de.julian.baehr.immutable.models;

public class MLocalVariableDeclarationStatement {

	private MLocalVariableDeclaration declaration;
	
	public void setDeclaration(MLocalVariableDeclaration declaration) {
		this.declaration = declaration;
	};
	
	@Override
	public String toString() {
		return declaration.toString() + ";";
	}
}
