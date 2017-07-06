package de.julian.baehr.immutable.listeners.expressions;

import de.julian.baehr.immutable.generated.JavaParser.ExpressionDotIdContext;
import de.julian.baehr.immutable.listeners.ImmutableBaseListener;
import de.julian.baehr.immutable.models.MConstructor;
import de.julian.baehr.immutable.models.expressions.MExpressionDotId;

public class ExpressionDotIdListener extends ImmutableBaseListener<MExpressionDotId> {

	private final boolean arraysAllowed;
	private final MConstructor autoCpy;
	
	public ExpressionDotIdListener(boolean arraysAllowed, MConstructor autoCpy){
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterExpressionDotId(ExpressionDotIdContext ctx) {
		setResult(new MExpressionDotId());
		enterThere(ctx.expression(), new ExpressionListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setExpression);
		getResult().setId(ctx.Identifier().getText());
	}
}
