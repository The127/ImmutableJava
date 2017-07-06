package de.julian.baehr.immutable.listeners.statements;

import de.julian.baehr.immutable.generated.JavaParser.StatementWhileContext;
import de.julian.baehr.immutable.listeners.ImmutableBaseListener;
import de.julian.baehr.immutable.listeners.ParExpressionListener;
import de.julian.baehr.immutable.models.MConstructor;
import de.julian.baehr.immutable.models.statements.MStatementWhile;

public class StatementWhileListener extends ImmutableBaseListener<MStatementWhile>{

	private final boolean arraysAllowed;
	private final MConstructor autoCpy;
	
	public StatementWhileListener(boolean arraysAllowed, MConstructor autoCpy) {
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterStatementWhile(StatementWhileContext ctx) {
		setResult(new MStatementWhile());
		enterThere(ctx.parExpression(), new ParExpressionListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setParExpression);
		enterThere(ctx.statement(), new StatementListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setStatement);
	}
}
