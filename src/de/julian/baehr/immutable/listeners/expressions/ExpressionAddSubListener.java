package de.julian.baehr.immutable.listeners.expressions;

import de.julian.baehr.immutable.generated.JavaParser.ExpressionAddSubContext;
import de.julian.baehr.immutable.listeners.ImmutableBaseListener;
import de.julian.baehr.immutable.models.MConstructor;
import de.julian.baehr.immutable.models.expressions.MExpressionAddSub;

public class ExpressionAddSubListener extends ImmutableBaseListener<MExpressionAddSub> {

	private final boolean arraysAllowed;
	private final MConstructor autoCpy;
	
	public ExpressionAddSubListener(boolean arraysAllowed, MConstructor autoCpy){
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterExpressionAddSub(ExpressionAddSubContext ctx) {
		setResult(new MExpressionAddSub());
		enterThere(ctx.exp1, new ExpressionListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setExpr1);
		getResult().setOp(ctx.op.getText());
		enterThere(ctx.exp2, new ExpressionListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setExpr2);
	}
}
