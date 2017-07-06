package de.julian.baehr.immutable.listeners.expressions.primaries;

import de.julian.baehr.immutable.generated.JavaParser.PrimLiteralContext;
import de.julian.baehr.immutable.listeners.ImmutableBaseListener;
import de.julian.baehr.immutable.models.expressions.primaries.MPrimLiteral;

public class PrimLiteralListener extends ImmutableBaseListener<MPrimLiteral>{

	@Override
	public void enterPrimLiteral(PrimLiteralContext ctx) {
		setResult(new MPrimLiteral());
		getResult().setLiteral(ctx.literal().getText());
	}
}
