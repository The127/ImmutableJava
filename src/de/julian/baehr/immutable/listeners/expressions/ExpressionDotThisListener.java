package de.julian.baehr.immutable.listeners.expressions;

import de.julian.baehr.immutable.generated.JavaParser.ExpressionDotThisContext;
import de.julian.baehr.immutable.listeners.ImmutableBaseListener;
import de.julian.baehr.immutable.models.MConstructor;
import de.julian.baehr.immutable.models.expressions.MExpressionDotThis;

public class ExpressionDotThisListener extends ImmutableBaseListener<MExpressionDotThis> {

	private final boolean arraysAllowed;
	private final MConstructor autoCpy;
	
	public ExpressionDotThisListener(boolean arraysAllowed, MConstructor autoCpy){
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterExpressionDotThis(ExpressionDotThisContext ctx) {
		setResult(new MExpressionDotThis());
		enterThere(ctx.expression(), new ExpressionListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setExpression);
	}
}
