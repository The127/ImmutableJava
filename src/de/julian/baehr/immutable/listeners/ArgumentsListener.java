package de.julian.baehr.immutable.listeners;

import de.julian.baehr.immutable.generated.JavaParser.ArgumentsContext;
import de.julian.baehr.immutable.models.MArguments;
import de.julian.baehr.immutable.models.MConstructor;

public class ArgumentsListener extends ImmutableBaseListener<MArguments>{

	private final boolean arraysAllowed;
	private final MConstructor autoCpy;
	
	public ArgumentsListener(boolean arraysAllowed, MConstructor autoCpy){
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterArguments(ArgumentsContext ctx) {
		setResult(new MArguments());
		enterThere(ctx.expressionList(), new ExpressionListListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setExpressionList);
	}
}
