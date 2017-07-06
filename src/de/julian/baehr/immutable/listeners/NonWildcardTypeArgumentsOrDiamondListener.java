package de.julian.baehr.immutable.listeners;

import de.julian.baehr.immutable.generated.JavaParser.NonWildcardTypeArgumentsOrDiamondContext;
import de.julian.baehr.immutable.models.MNonWildcardTypeArgumentsOrDiamond;

public class NonWildcardTypeArgumentsOrDiamondListener extends ImmutableBaseListener<MNonWildcardTypeArgumentsOrDiamond>{

	private final boolean arraysAllowed;
	
	public NonWildcardTypeArgumentsOrDiamondListener(boolean arraysAllowed) {
		this.arraysAllowed = arraysAllowed;
	}
	
	@Override
	public void enterNonWildcardTypeArgumentsOrDiamond(NonWildcardTypeArgumentsOrDiamondContext ctx) {
		setResult(new MNonWildcardTypeArgumentsOrDiamond());
		enterThere(ctx.nonWildcardTypeArguments(), new NonWildcardTypeArgumentsListener(arraysAllowed))
			.ifResult(getResult()::setArguments);
	}
}
