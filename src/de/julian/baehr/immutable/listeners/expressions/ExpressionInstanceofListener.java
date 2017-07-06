package de.julian.baehr.immutable.listeners.expressions;

import de.julian.baehr.immutable.generated.JavaParser.ExpressionInstanceofContext;
import de.julian.baehr.immutable.listeners.ImmutableBaseListener;
import de.julian.baehr.immutable.listeners.TypeTypeListener;
import de.julian.baehr.immutable.models.MConstructor;
import de.julian.baehr.immutable.models.expressions.MExpressionInstanceof;

public class ExpressionInstanceofListener extends ImmutableBaseListener<MExpressionInstanceof> {

	private final boolean arraysAllowed;
	private final MConstructor autoCpy;
	
	public ExpressionInstanceofListener(boolean arraysAllowed, MConstructor autoCpy){
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterExpressionInstanceof(ExpressionInstanceofContext ctx) {
		setResult(new MExpressionInstanceof());
		enterThere(ctx.expression(), new ExpressionListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setExpr1);
		enterThere(ctx.typeType(), new TypeTypeListener(arraysAllowed))
			.ifResult(getResult()::setType);
	}
}
