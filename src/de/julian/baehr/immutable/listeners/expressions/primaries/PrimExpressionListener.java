package de.julian.baehr.immutable.listeners.expressions.primaries;

import de.julian.baehr.immutable.generated.JavaParser.PrimExpressionContext;
import de.julian.baehr.immutable.listeners.ImmutableBaseListener;
import de.julian.baehr.immutable.listeners.expressions.ExpressionListener;
import de.julian.baehr.immutable.models.MConstructor;
import de.julian.baehr.immutable.models.expressions.primaries.MPrimExpression;

public class PrimExpressionListener extends ImmutableBaseListener<MPrimExpression>{

	private final boolean arraysAllowed;
	private final MConstructor autoCpy;
	
	public PrimExpressionListener(boolean arraysAllowed, MConstructor autoCpy) {
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterPrimExpression(PrimExpressionContext ctx) {
		setResult(new MPrimExpression());
		enterThere(ctx.expression(), new ExpressionListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setExpression);
	}
}
