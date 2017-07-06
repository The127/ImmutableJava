package de.julian.baehr.immutable.listeners.expressions.primaries;

import de.julian.baehr.immutable.generated.JavaParser.PrimIdContext;
import de.julian.baehr.immutable.listeners.ImmutableBaseListener;
import de.julian.baehr.immutable.models.expressions.primaries.MPrimId;

public class PrimIdListener extends ImmutableBaseListener<MPrimId>{

	@Override
	public void enterPrimId(PrimIdContext ctx) {
		setResult(new MPrimId());
		getResult().setId(ctx.Identifier().getText());
	}
}
