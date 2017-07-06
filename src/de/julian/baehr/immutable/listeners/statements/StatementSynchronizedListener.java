package de.julian.baehr.immutable.listeners.statements;

import de.julian.baehr.immutable.generated.JavaParser.StatementSynchronizedContext;
import de.julian.baehr.immutable.listeners.BlockListener;
import de.julian.baehr.immutable.listeners.ImmutableBaseListener;
import de.julian.baehr.immutable.listeners.ParExpressionListener;
import de.julian.baehr.immutable.models.MConstructor;
import de.julian.baehr.immutable.models.statements.MStatementSynchronized;

public class StatementSynchronizedListener extends ImmutableBaseListener<MStatementSynchronized>{

	private final boolean arraysAllowed;
	private final MConstructor autoCpy;
	
	public StatementSynchronizedListener(boolean arraysAllowed, MConstructor autoCpy) {
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterStatementSynchronized(StatementSynchronizedContext ctx) {
		setResult(new MStatementSynchronized());
		enterThere(ctx.parExpression(), new ParExpressionListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setParExpression);
		enterThere(ctx.block(), new BlockListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setBlock);
	}
}
