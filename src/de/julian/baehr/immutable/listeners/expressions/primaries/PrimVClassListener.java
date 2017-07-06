package de.julian.baehr.immutable.listeners.expressions.primaries;

import de.julian.baehr.immutable.generated.JavaParser.PrimVClassContext;
import de.julian.baehr.immutable.listeners.ImmutableBaseListener;
import de.julian.baehr.immutable.models.expressions.primaries.MPrimVClass;

public class PrimVClassListener extends ImmutableBaseListener<MPrimVClass>{

	@Override
	public void enterPrimVClass(PrimVClassContext ctx) {
		setResult(new MPrimVClass());
	}
}
