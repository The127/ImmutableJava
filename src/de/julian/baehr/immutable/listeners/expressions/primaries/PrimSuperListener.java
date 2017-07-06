package de.julian.baehr.immutable.listeners.expressions.primaries;

import de.julian.baehr.immutable.generated.JavaParser.PrimSuperContext;
import de.julian.baehr.immutable.listeners.ImmutableBaseListener;
import de.julian.baehr.immutable.models.expressions.primaries.MPrimSuper;

public class PrimSuperListener extends ImmutableBaseListener<MPrimSuper>{

	@Override
	public void enterPrimSuper(PrimSuperContext ctx) {
		setResult(new MPrimSuper());
	}
}
