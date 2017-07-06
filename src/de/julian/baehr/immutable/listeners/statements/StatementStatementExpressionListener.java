package de.julian.baehr.immutable.listeners.statements;

import de.julian.baehr.immutable.generated.JavaParser.StatementStatemenExpressionContext;
import de.julian.baehr.immutable.listeners.ImmutableBaseListener;
import de.julian.baehr.immutable.listeners.expressions.ExpressionListener;
import de.julian.baehr.immutable.models.MConstructor;
import de.julian.baehr.immutable.models.statements.MStatementStatementExpression;

public class StatementStatementExpressionListener extends ImmutableBaseListener<MStatementStatementExpression>{

	private final boolean arraysAllowed;
	private final MConstructor autoCpy;
	
	public StatementStatementExpressionListener(boolean arraysAllowed, MConstructor autoCpy) {
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterStatementStatemenExpression(StatementStatemenExpressionContext ctx) {
		enterThere(ctx.statementExpression(), new ExpressionListener(arraysAllowed, autoCpy))
			.ifResult(res -> setResult(new MStatementStatementExpression(res)));
	}
}
