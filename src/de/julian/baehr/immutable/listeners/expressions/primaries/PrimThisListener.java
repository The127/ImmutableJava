package de.julian.baehr.immutable.listeners.expressions.primaries;

import de.julian.baehr.immutable.generated.JavaParser.PrimThisContext;
import de.julian.baehr.immutable.listeners.ImmutableBaseListener;
import de.julian.baehr.immutable.models.expressions.primaries.MPrimThis;

public class PrimThisListener extends ImmutableBaseListener<MPrimThis>{

	@Override
	public void enterPrimThis(PrimThisContext ctx) {
		setResult(new MPrimThis());
	}
}
