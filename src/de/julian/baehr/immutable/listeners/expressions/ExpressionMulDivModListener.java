package de.julian.baehr.immutable.listeners.expressions;

import de.julian.baehr.immutable.generated.JavaParser.ExpressionMulDivModContext;
import de.julian.baehr.immutable.listeners.ImmutableBaseListener;
import de.julian.baehr.immutable.models.MConstructor;
import de.julian.baehr.immutable.models.expressions.MExpressionMulDivMod;

public class ExpressionMulDivModListener extends ImmutableBaseListener<MExpressionMulDivMod> {

	private final boolean arraysAllowed;
	private final MConstructor autoCpy;
	
	public ExpressionMulDivModListener(boolean arraysAllowed, MConstructor autoCpy){
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterExpressionMulDivMod(ExpressionMulDivModContext ctx) {
		setResult(new MExpressionMulDivMod());
		enterThere(ctx.exp1, new ExpressionListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setExpr1);
		getResult().setOp(ctx.op.getText());
		enterThere(ctx.exp2, new ExpressionListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setExpr2);
	}
}
