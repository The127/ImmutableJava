package de.julian.baehr.immutable.listeners.statements;

import de.julian.baehr.immutable.generated.JavaParser.StatementContinueContext;
import de.julian.baehr.immutable.listeners.ImmutableBaseListener;
import de.julian.baehr.immutable.models.statements.MStatementContinue;

public class StatementContinueListener extends ImmutableBaseListener<MStatementContinue>{

	@Override
	public void enterStatementContinue(StatementContinueContext ctx) {
		setResult(new MStatementContinue());
		if(ctx.Identifier() != null)
			getResult().setIdentifier(ctx.Identifier().getText());
	}
}
