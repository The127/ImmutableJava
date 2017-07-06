package de.julian.baehr.immutable.listeners;

import de.julian.baehr.immutable.generated.JavaParser.ExplicitGenericInvocationSuffixContext;
import de.julian.baehr.immutable.models.MConstructor;
import de.julian.baehr.immutable.models.MExplicitGenericInvocationSuffix;

public class ExplicitGenericInvocationSuffixListener extends ImmutableBaseListener<MExplicitGenericInvocationSuffix>{

	private final boolean arraysAllowed;
	private final MConstructor autoCpy;
	
	public ExplicitGenericInvocationSuffixListener(boolean arraysAllowed, MConstructor autoCpy) {
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterExplicitGenericInvocationSuffix(ExplicitGenericInvocationSuffixContext ctx) {
		setResult(new MExplicitGenericInvocationSuffix());
		
		enterThere(ctx.superSuffix(), new SuperSuffixListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setSuperSuffix);
		
		if(ctx.Identifier() != null)
			getResult().setId(ctx.Identifier().getText());
		enterThere(ctx.arguments(), new ArgumentsListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setArguments);
	}
}
