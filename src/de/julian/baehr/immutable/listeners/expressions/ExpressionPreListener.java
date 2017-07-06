package de.julian.baehr.immutable.listeners.expressions;

import de.julian.baehr.immutable.generated.JavaParser.ExpressionPreContext;
import de.julian.baehr.immutable.listeners.ImmutableBaseListener;
import de.julian.baehr.immutable.models.MConstructor;
import de.julian.baehr.immutable.models.expressions.MExpressionPre;

public class ExpressionPreListener extends ImmutableBaseListener<MExpressionPre> {

	private final boolean arraysAllowed;
	private final MConstructor autoCpy;
	
	public ExpressionPreListener(boolean arraysAllowed, MConstructor autoCpy){
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterExpressionPre(ExpressionPreContext ctx) {
		setResult(new MExpressionPre());
		getResult().setOp(ctx.op.getText());
		enterThere(ctx.expression(), new ExpressionListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setExpression);
	}
}
