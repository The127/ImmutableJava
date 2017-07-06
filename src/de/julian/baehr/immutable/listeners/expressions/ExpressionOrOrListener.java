package de.julian.baehr.immutable.listeners.expressions;

import de.julian.baehr.immutable.generated.JavaParser.ExpressionOrOrContext;
import de.julian.baehr.immutable.listeners.ImmutableBaseListener;
import de.julian.baehr.immutable.models.MConstructor;
import de.julian.baehr.immutable.models.expressions.MExpressionOrOr;

public class ExpressionOrOrListener extends ImmutableBaseListener<MExpressionOrOr> {

	private final boolean arraysAllowed;
	private final MConstructor autoCpy;
	
	public ExpressionOrOrListener(boolean arraysAllowed, MConstructor autoCpy){
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterExpressionOrOr(ExpressionOrOrContext ctx) {
		setResult(new MExpressionOrOr());
		enterThere(ctx.exp1, new ExpressionListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setExpr1);
		enterThere(ctx.exp2, new ExpressionListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setExpr2);
	}
}
