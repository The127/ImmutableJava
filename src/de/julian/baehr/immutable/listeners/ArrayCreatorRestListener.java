package de.julian.baehr.immutable.listeners;

import de.julian.baehr.immutable.generated.JavaParser.ArrayCreatorRestContext;
import de.julian.baehr.immutable.generated.JavaParser.BracketExpressionContext;
import de.julian.baehr.immutable.generated.JavaParser.BracketsContext;
import de.julian.baehr.immutable.listeners.expressions.ExpressionListener;
import de.julian.baehr.immutable.models.MArrayCreatorRest;
import de.julian.baehr.immutable.models.MConstructor;

public class ArrayCreatorRestListener extends ImmutableBaseListener<MArrayCreatorRest>{

	private final boolean arraysAllowed;
	private final MConstructor autoCpy;
	
	public ArrayCreatorRestListener(boolean arraysAllowed, MConstructor autoCpy){
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterArrayCreatorRest(ArrayCreatorRestContext ctx) {
		setResult(new MArrayCreatorRest());
		enterHere(ctx.brackets());
		enterThere(ctx.expression(), new ExpressionListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setFirstExpression);
		enterHere(ctx.bracketExpression());
		enterThere(ctx.arrayInitializer(), new ArrayInitializerListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setArrayInitializer);
	}
	
	@Override
	public void enterBrackets(BracketsContext ctx) {
		getResult().setArrays(ctx.getText());
	}
	
	@Override
	public void enterBracketExpression(BracketExpressionContext ctx) {
		enterThere(ctx, new BracketExpressionListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::addBracketExpression);
	}
}
