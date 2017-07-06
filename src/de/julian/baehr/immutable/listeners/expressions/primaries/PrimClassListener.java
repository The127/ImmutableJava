package de.julian.baehr.immutable.listeners.expressions.primaries;

import de.julian.baehr.immutable.generated.JavaParser.PrimClassContext;
import de.julian.baehr.immutable.listeners.ImmutableBaseListener;
import de.julian.baehr.immutable.listeners.TypeTypeListener;
import de.julian.baehr.immutable.models.expressions.primaries.MPrimClass;

public class PrimClassListener extends ImmutableBaseListener<MPrimClass>{

	private final boolean arraysAllowed;
	
	public PrimClassListener(boolean arraysAllowed){
		this.arraysAllowed = arraysAllowed;
	}
	
	@Override
	public void enterPrimClass(PrimClassContext ctx) {
		setResult(new MPrimClass());
		enterThere(ctx.typeType(), new TypeTypeListener(arraysAllowed))
			.ifResult(getResult()::setTypeType);
	}
}
