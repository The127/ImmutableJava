package de.julian.baehr.immutable.listeners.expressions;

import de.julian.baehr.immutable.generated.JavaParser.ExpressionXorContext;
import de.julian.baehr.immutable.listeners.ImmutableBaseListener;
import de.julian.baehr.immutable.models.MConstructor;
import de.julian.baehr.immutable.models.expressions.MExpressionXor;

public class ExpressionXorListener extends ImmutableBaseListener<MExpressionXor> {

	private final boolean arraysAllowed;
	private final MConstructor autoCpy;
	
	public ExpressionXorListener(boolean arraysAllowed, MConstructor autoCpy){
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterExpressionXor(ExpressionXorContext ctx) {
		setResult(new MExpressionXor());
		enterThere(ctx.exp1, new ExpressionListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setExpr1);
		enterThere(ctx.exp2, new ExpressionListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setExpr2);
	}
}
