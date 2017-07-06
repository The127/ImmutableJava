package de.julian.baehr.immutable.listeners.expressions;

import de.julian.baehr.immutable.generated.JavaParser.ExpressionPostContext;
import de.julian.baehr.immutable.listeners.ImmutableBaseListener;
import de.julian.baehr.immutable.models.MConstructor;
import de.julian.baehr.immutable.models.expressions.MExpressionPost;

public class ExpressionPostListener extends ImmutableBaseListener<MExpressionPost> {

	private final boolean arraysAllowed;
	private final MConstructor autoCpy;
	
	public ExpressionPostListener(boolean arraysAllowed, MConstructor autoCpy){
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterExpressionPost(ExpressionPostContext ctx) {
		setResult(new MExpressionPost());
		enterThere(ctx.expression(), new ExpressionListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setExpression);
		getResult().setOp(ctx.op.getText());
	}
}
