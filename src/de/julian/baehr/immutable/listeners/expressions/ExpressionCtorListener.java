package de.julian.baehr.immutable.listeners.expressions;

import de.julian.baehr.immutable.generated.JavaParser.ExpressionCtorContext;
import de.julian.baehr.immutable.listeners.CreatorListener;
import de.julian.baehr.immutable.listeners.ImmutableBaseListener;
import de.julian.baehr.immutable.models.MConstructor;
import de.julian.baehr.immutable.models.expressions.MExpressionCtor;

public class ExpressionCtorListener extends ImmutableBaseListener<MExpressionCtor> {

	private final boolean arraysAllowed;
	private final MConstructor autoCpy;
	
	public ExpressionCtorListener(boolean arraysAllowed, MConstructor autoCpy) {
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterExpressionCtor(ExpressionCtorContext ctx) {
		setResult(new MExpressionCtor());
		enterThere(ctx.creator(), new CreatorListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setCreator);
	}
}
