package de.julian.baehr.immutable.listeners.statements;

import de.julian.baehr.immutable.generated.JavaParser.CatchClauseContext;
import de.julian.baehr.immutable.generated.JavaParser.StatementTryContext;
import de.julian.baehr.immutable.listeners.CatchClauseListener;
import de.julian.baehr.immutable.listeners.FinallyBlockListener;
import de.julian.baehr.immutable.listeners.ImmutableBaseListener;
import de.julian.baehr.immutable.models.MConstructor;
import de.julian.baehr.immutable.models.statements.MStatementTry;

public class StatementTryListener extends ImmutableBaseListener<MStatementTry> {

	private final boolean arraysAllowed;
	private final MConstructor autoCpy;
	
	public StatementTryListener(boolean arraysAllowed, MConstructor autoCpy) {
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterStatementTry(StatementTryContext ctx) {
		setResult(new MStatementTry());
		enterHere(ctx.catchClause());
		enterThere(ctx.finallyBlock(), new FinallyBlockListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setFinallyBlock);
	}
	
	@Override
	public void enterCatchClause(CatchClauseContext ctx) {
		enterThere(ctx, new CatchClauseListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::addCatchClause);
	}
}
