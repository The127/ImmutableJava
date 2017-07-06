package de.julian.baehr.immutable.listeners.statements;

import de.julian.baehr.immutable.generated.JavaParser.StatementDoContext;
import de.julian.baehr.immutable.listeners.ImmutableBaseListener;
import de.julian.baehr.immutable.listeners.ParExpressionListener;
import de.julian.baehr.immutable.models.MConstructor;
import de.julian.baehr.immutable.models.statements.MStatementDo;

public class StatementDoListener extends ImmutableBaseListener<MStatementDo>{

	private final boolean arraysAllowed;
	private final MConstructor autoCpy;
	
	public StatementDoListener(boolean arraysAllowed, MConstructor autoCpy) {
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterStatementDo(StatementDoContext ctx) {
		setResult(new MStatementDo());
		enterThere(ctx.statement(), new StatementListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setStatement);
		enterThere(ctx.parExpression(), new ParExpressionListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setParExpression);
	}
}
