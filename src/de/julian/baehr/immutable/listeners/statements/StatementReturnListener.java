package de.julian.baehr.immutable.listeners.statements;

import de.julian.baehr.immutable.generated.JavaParser.StatementReturnContext;
import de.julian.baehr.immutable.listeners.ImmutableBaseListener;
import de.julian.baehr.immutable.listeners.expressions.ExpressionListener;
import de.julian.baehr.immutable.models.MConstructor;
import de.julian.baehr.immutable.models.statements.MStatementReturn;

public class StatementReturnListener extends ImmutableBaseListener<MStatementReturn>{

	private final boolean arraysAllowed;
	private final MConstructor autoCpy;
	
	public StatementReturnListener(boolean arraysAllowed, MConstructor autoCpy) {
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterStatementReturn(StatementReturnContext ctx) {
		setResult(new MStatementReturn());
		enterThere(ctx.expression(), new ExpressionListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setExpression);
	}
}
