package de.julian.baehr.immutable.listeners.expressions;

import de.julian.baehr.immutable.generated.JavaParser.ExpressionMethodCallContext;
import de.julian.baehr.immutable.listeners.ExpressionListListener;
import de.julian.baehr.immutable.listeners.ImmutableBaseListener;
import de.julian.baehr.immutable.models.MConstructor;
import de.julian.baehr.immutable.models.expressions.MExpressionMethodCall;

public class ExpressionMethodCallListener extends ImmutableBaseListener<MExpressionMethodCall> {

	private final boolean arraysAllowed;
	private final MConstructor autoCpy;
	
	public ExpressionMethodCallListener(boolean arraysAllowed, MConstructor autoCpy){
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterExpressionMethodCall(ExpressionMethodCallContext ctx) {
		setResult(new MExpressionMethodCall());
		enterThere(ctx.expression(), new ExpressionListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setExpression);
		enterThere(ctx.expressionList(), new ExpressionListListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setExpressionList);
	}
}
