package de.julian.baehr.immutable.listeners;

import de.julian.baehr.immutable.generated.JavaParser.LocalVariableDeclarationStatementContext;
import de.julian.baehr.immutable.models.MConstructor;
import de.julian.baehr.immutable.models.MLocalVariableDeclarationStatement;

public class LocalVariableDeclarationStatementListener extends ImmutableBaseListener<MLocalVariableDeclarationStatement>{

	private final boolean arraysAllowed;
	private final MConstructor autoCpy;
	
	public LocalVariableDeclarationStatementListener(boolean arraysAllowed, MConstructor autoCpy) {
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterLocalVariableDeclarationStatement(LocalVariableDeclarationStatementContext ctx) {
		setResult(new MLocalVariableDeclarationStatement());
		enterThere(ctx.localVariableDeclaration(), new LocalVariableDeclarationListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setDeclaration);
	}
}
