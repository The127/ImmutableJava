package de.julian.baehr.immutable.listeners;

import de.julian.baehr.immutable.generated.JavaParser.NonWildcardTypeArgumentsContext;
import de.julian.baehr.immutable.models.MNonWildcardTypeArguments;

public class NonWildcardTypeArgumentsListener extends ImmutableBaseListener<MNonWildcardTypeArguments>{

	private final boolean arraysAllowed;
	
	public NonWildcardTypeArgumentsListener(boolean arraysAllowed) {
		this.arraysAllowed = arraysAllowed;
	}
	
	@Override
	public void enterNonWildcardTypeArguments(NonWildcardTypeArgumentsContext ctx) {
		setResult(new MNonWildcardTypeArguments());
		enterThere(ctx.typeList(), new TypeListListener(arraysAllowed))
			.ifResult(getResult()::setList);
	}
}
