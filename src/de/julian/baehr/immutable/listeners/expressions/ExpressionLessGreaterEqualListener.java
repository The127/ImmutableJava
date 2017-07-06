package de.julian.baehr.immutable.listeners.expressions;

import de.julian.baehr.immutable.generated.JavaParser.ExpressionLessGreaterEqualContext;
import de.julian.baehr.immutable.listeners.ImmutableBaseListener;
import de.julian.baehr.immutable.models.MConstructor;
import de.julian.baehr.immutable.models.expressions.MExpressionLessGreaterEqual;

public class ExpressionLessGreaterEqualListener extends ImmutableBaseListener<MExpressionLessGreaterEqual> {

	private final boolean arraysAllowed;
	private final MConstructor autoCpy;
	
	public ExpressionLessGreaterEqualListener(boolean arraysAllowed, MConstructor autoCpy){
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterExpressionLessGreaterEqual(ExpressionLessGreaterEqualContext ctx) {
		setResult(new MExpressionLessGreaterEqual());
		enterThere(ctx.exp1, new ExpressionListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setExpr1);
		getResult().setOp(ctx.op.getText());
		enterThere(ctx.exp2, new ExpressionListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setExpr2);
	}
}
