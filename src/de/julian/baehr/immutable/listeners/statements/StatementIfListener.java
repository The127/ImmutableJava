package de.julian.baehr.immutable.listeners.statements;

import de.julian.baehr.immutable.generated.JavaParser.StatementIfContext;
import de.julian.baehr.immutable.listeners.ImmutableBaseListener;
import de.julian.baehr.immutable.listeners.ParExpressionListener;
import de.julian.baehr.immutable.models.MConstructor;
import de.julian.baehr.immutable.models.statements.MStatementIf;

public class StatementIfListener extends ImmutableBaseListener<MStatementIf>{

	private final boolean arraysAllowed;
	private final MConstructor autoCpy;
	
	public StatementIfListener(boolean arraysAllowed, MConstructor autoCpy) {
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterStatementIf(StatementIfContext ctx) {
		setResult(new MStatementIf());
		enterThere(ctx.parExpression(), new ParExpressionListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setParExpression);
		enterThere(ctx.ifStmt, new StatementListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setIfStatement);
		enterThere(ctx.elseStmt, new StatementListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setElseStatement);
	}
}
