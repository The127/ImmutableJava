package de.julian.baehr.immutable.listeners.statements;

import de.julian.baehr.immutable.generated.JavaParser.StatementIdentifierStatementContext;
import de.julian.baehr.immutable.listeners.ImmutableBaseListener;
import de.julian.baehr.immutable.models.MConstructor;
import de.julian.baehr.immutable.models.statements.MStatementIdentifierStatement;

public class StatementIdentifierStatementListener extends ImmutableBaseListener<MStatementIdentifierStatement>{

	private final boolean arraysAllowed;
	private final MConstructor autoCpy;
	
	public StatementIdentifierStatementListener(boolean arraysAllowed, MConstructor autoCpy) {
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterStatementIdentifierStatement(StatementIdentifierStatementContext ctx) {
		setResult(new MStatementIdentifierStatement());
		getResult().setIdentifier(ctx.Identifier().getText());
		enterThere(ctx.statement(), new StatementListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setStatement);
	}
}
