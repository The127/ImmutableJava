package de.julian.baehr.immutable.listeners.expressions;

import de.julian.baehr.immutable.generated.JavaParser.ExpressionCastContext;
import de.julian.baehr.immutable.listeners.ImmutableBaseListener;
import de.julian.baehr.immutable.listeners.TypeTypeListener;
import de.julian.baehr.immutable.models.MConstructor;
import de.julian.baehr.immutable.models.expressions.MExpressionCast;

public class ExpressionCastListener extends ImmutableBaseListener<MExpressionCast> {

	private final boolean arraysAllowed;
	private final MConstructor autoCpy;
	
	public ExpressionCastListener(boolean arraysAllowed, MConstructor autoCpy){
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterExpressionCast(ExpressionCastContext ctx) {
		setResult(new MExpressionCast());
		enterThere(ctx.typeType(), new TypeTypeListener(arraysAllowed))
			.ifResult(getResult()::setType);
		enterThere(ctx.expression(), new ExpressionListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setExpression);
	}
}
