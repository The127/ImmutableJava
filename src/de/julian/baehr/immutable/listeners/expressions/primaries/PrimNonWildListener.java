package de.julian.baehr.immutable.listeners.expressions.primaries;

import de.julian.baehr.immutable.generated.JavaParser.PrimNonWildContext;
import de.julian.baehr.immutable.listeners.ArgumentsListener;
import de.julian.baehr.immutable.listeners.ExplicitGenericInvocationSuffixListener;
import de.julian.baehr.immutable.listeners.ImmutableBaseListener;
import de.julian.baehr.immutable.listeners.NonWildcardTypeArgumentsListener;
import de.julian.baehr.immutable.models.MConstructor;
import de.julian.baehr.immutable.models.expressions.primaries.MPrimNonWild;

public class PrimNonWildListener extends ImmutableBaseListener<MPrimNonWild>{

	private final boolean arraysAllowed;
	private final MConstructor autoCpy;
	
	public PrimNonWildListener(boolean arraysAllowed, MConstructor autoCpy) {
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterPrimNonWild(PrimNonWildContext ctx) {
		setResult(new MPrimNonWild());
		enterThere(ctx.arguments(), new ArgumentsListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setArguments);
		enterThere(ctx.nonWildcardTypeArguments(), new NonWildcardTypeArgumentsListener(arraysAllowed))
			.ifResult(getResult()::setNonWildcardTypeArguments);
		enterThere(ctx.explicitGenericInvocationSuffix(), new ExplicitGenericInvocationSuffixListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setExplicitGenericInvocationSuffix);
	}
}
