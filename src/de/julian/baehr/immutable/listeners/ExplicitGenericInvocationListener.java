package de.julian.baehr.immutable.listeners;

import de.julian.baehr.immutable.generated.JavaParser.ExplicitGenericInvocationContext;
import de.julian.baehr.immutable.models.MConstructor;
import de.julian.baehr.immutable.models.MExplicitGenericInvocation;

public class ExplicitGenericInvocationListener extends ImmutableBaseListener<MExplicitGenericInvocation> {

	private final boolean arraysAllowed;
	private final MConstructor autoCpy;
	
	public ExplicitGenericInvocationListener(boolean arraysAllowed, MConstructor autoCpy) {
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterExplicitGenericInvocation(ExplicitGenericInvocationContext ctx) {
		setResult(new MExplicitGenericInvocation());
		enterThere(ctx.nonWildcardTypeArguments(), new NonWildcardTypeArgumentsListener(arraysAllowed))
			.ifResult(getResult()::setArguments);
		enterThere(ctx.explicitGenericInvocationSuffix(), new ExplicitGenericInvocationSuffixListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setExplicitGenericInvocationSuffix);
	}
}
