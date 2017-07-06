package de.julian.baehr.immutable.listeners;

import de.julian.baehr.immutable.generated.JavaParser.BlockStatementContext;
import de.julian.baehr.immutable.listeners.statements.StatementListener;
import de.julian.baehr.immutable.models.MBlockStatement;
import de.julian.baehr.immutable.models.MConstructor;

public class BlockStatementListener extends ImmutableBaseListener<MBlockStatement> {

	private final boolean arraysAllowed;
	private final MConstructor autoCpy;
	
	public BlockStatementListener(boolean arraysAllowed, MConstructor autoCpy) {
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterBlockStatement(BlockStatementContext ctx) {
		setResult(new MBlockStatement());
		enterThere(ctx.localVariableDeclarationStatement(), new LocalVariableDeclarationStatementListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setDeclarationStatement);
		enterThere(ctx.statement(), new StatementListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setStatement);
		enterThere(ctx.typeDeclaration(), new TypeDeclarationListener())
			.ifResult(getResult()::setTypeDeclaration);
	}
}
