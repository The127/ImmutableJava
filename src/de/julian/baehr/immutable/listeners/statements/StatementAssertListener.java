package de.julian.baehr.immutable.listeners.statements;

import de.julian.baehr.immutable.generated.JavaParser.StatementAssertContext;
import de.julian.baehr.immutable.listeners.ImmutableBaseListener;
import de.julian.baehr.immutable.listeners.expressions.ExpressionListener;
import de.julian.baehr.immutable.models.MConstructor;
import de.julian.baehr.immutable.models.statements.MStatementAssert;

public class StatementAssertListener extends ImmutableBaseListener<MStatementAssert> {

	private final boolean arraysAllowed;
	private final MConstructor autoCpy;
	
	public StatementAssertListener(boolean arraysAllowed, MConstructor autoCpy) {
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterStatementAssert(StatementAssertContext ctx) {
		setResult(new MStatementAssert());
		enterThere(ctx.exp1, new ExpressionListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setExp1);
		enterThere(ctx.exp2, new ExpressionListener(arraysAllowed, autoCpy))
		.ifResult(getResult()::setExp2);
	}
}
