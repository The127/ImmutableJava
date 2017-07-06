package de.julian.baehr.immutable.listeners.expressions;

import de.julian.baehr.immutable.generated.JavaParser.ExpressionNotContext;
import de.julian.baehr.immutable.listeners.ImmutableBaseListener;
import de.julian.baehr.immutable.models.MConstructor;
import de.julian.baehr.immutable.models.expressions.MExpressionNot;

public class ExpressionNotListener extends ImmutableBaseListener<MExpressionNot> {

	private final boolean arraysAllowed;
	private final MConstructor autoCpy;
	
	public ExpressionNotListener(boolean arraysAllowed, MConstructor autoCpy){
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterExpressionNot(ExpressionNotContext ctx) {
		setResult(new MExpressionNot());
		getResult().setOp(ctx.op.getText());
		enterThere(ctx.expression(), new ExpressionListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setExpression);
	}
}
