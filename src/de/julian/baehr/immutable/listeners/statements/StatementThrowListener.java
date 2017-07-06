package de.julian.baehr.immutable.listeners.statements;

import de.julian.baehr.immutable.generated.JavaParser.StatementThrowContext;
import de.julian.baehr.immutable.listeners.ImmutableBaseListener;
import de.julian.baehr.immutable.listeners.expressions.ExpressionListener;
import de.julian.baehr.immutable.models.MConstructor;
import de.julian.baehr.immutable.models.statements.MStatementThrow;

public class StatementThrowListener extends ImmutableBaseListener<MStatementThrow>{

	private final boolean arraysAllowed;
	private final MConstructor autoCpy;
	
	public StatementThrowListener(boolean arraysAllowed, MConstructor autoCpy) {
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterStatementThrow(StatementThrowContext ctx) {
		setResult(new MStatementThrow());
		enterThere(ctx.expression(), new ExpressionListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setExpression);
	}
}
