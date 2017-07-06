package de.julian.baehr.immutable.listeners.statements;

import de.julian.baehr.immutable.generated.JavaParser.StatementBreakContext;
import de.julian.baehr.immutable.listeners.ImmutableBaseListener;
import de.julian.baehr.immutable.models.statements.MStatementBreak;

public class StatementBreakListener extends ImmutableBaseListener<MStatementBreak>{

	@Override
	public void enterStatementBreak(StatementBreakContext ctx) {
		setResult(new MStatementBreak());
		if(ctx.Identifier() != null)
			getResult().setIdentifier(ctx.Identifier().getText());
	}
}
