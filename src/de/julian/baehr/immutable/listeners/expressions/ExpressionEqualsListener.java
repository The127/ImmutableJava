package de.julian.baehr.immutable.listeners.expressions;

import de.julian.baehr.immutable.generated.JavaParser.ExpressionEqualsContext;
import de.julian.baehr.immutable.listeners.ImmutableBaseListener;
import de.julian.baehr.immutable.models.MConstructor;
import de.julian.baehr.immutable.models.expressions.MExpressionEquals;

public class ExpressionEqualsListener extends ImmutableBaseListener<MExpressionEquals> {

	private final boolean arraysAllowed;
	private final MConstructor autoCpy;
	
	public ExpressionEqualsListener(boolean arraysAllowed, MConstructor autoCpy){
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterExpressionEquals(ExpressionEqualsContext ctx) {
		setResult(new MExpressionEquals());
		enterThere(ctx.exp1, new ExpressionListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setExpr1);
		getResult().setOp(ctx.op.getText());
		enterThere(ctx.exp2, new ExpressionListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setExpr2);
	}
}
