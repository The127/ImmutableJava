package de.julian.baehr.immutable.listeners.expressions;

import de.julian.baehr.immutable.generated.JavaParser.ExpressionOrContext;
import de.julian.baehr.immutable.listeners.ImmutableBaseListener;
import de.julian.baehr.immutable.models.MConstructor;
import de.julian.baehr.immutable.models.expressions.MExpressionOr;

public class ExpressionOrListener extends ImmutableBaseListener<MExpressionOr> {

	private final boolean arraysAllowed;
	private final MConstructor autoCpy;
	
	public ExpressionOrListener(boolean arraysAllowed, MConstructor autoCpy){
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterExpressionOr(ExpressionOrContext ctx) {
		setResult(new MExpressionOr());
		enterThere(ctx.exp1, new ExpressionListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setExpr1);
		enterThere(ctx.exp2, new ExpressionListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setExpr2);
	}
}
