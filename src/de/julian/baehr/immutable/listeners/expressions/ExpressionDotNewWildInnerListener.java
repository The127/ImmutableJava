package de.julian.baehr.immutable.listeners.expressions;

import de.julian.baehr.immutable.generated.JavaParser.ExpressionDotNewWildInnerContext;
import de.julian.baehr.immutable.listeners.ImmutableBaseListener;
import de.julian.baehr.immutable.listeners.InnerCreatorListener;
import de.julian.baehr.immutable.listeners.NonWildcardTypeArgumentsListener;
import de.julian.baehr.immutable.models.MConstructor;
import de.julian.baehr.immutable.models.expressions.MExpressionDotNewWildInner;

public class ExpressionDotNewWildInnerListener extends ImmutableBaseListener<MExpressionDotNewWildInner> {

	private final boolean arraysAllowed;
	private final MConstructor autoCpy;
	
	public ExpressionDotNewWildInnerListener(boolean arraysAllowed, MConstructor autoCpy){
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterExpressionDotNewWildInner(ExpressionDotNewWildInnerContext ctx) {
		setResult(new MExpressionDotNewWildInner());
		enterThere(ctx.expression(), new ExpressionListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setExpression);
		enterThere(ctx.nonWildcardTypeArguments(), new NonWildcardTypeArgumentsListener(arraysAllowed))
			.ifResult(getResult()::setArguments);
		enterThere(ctx.innerCreator(), new InnerCreatorListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setCreator);
	}
}
