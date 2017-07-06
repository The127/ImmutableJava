package de.julian.baehr.immutable.listeners.expressions;

import org.antlr.v4.runtime.ParserRuleContext;

import de.julian.baehr.immutable.generated.JavaParser.ConstantExpressionContext;
import de.julian.baehr.immutable.generated.JavaParser.ExpressionAddSubContext;
import de.julian.baehr.immutable.generated.JavaParser.ExpressionAndAndContext;
import de.julian.baehr.immutable.generated.JavaParser.ExpressionAndContext;
import de.julian.baehr.immutable.generated.JavaParser.ExpressionArrayContext;
import de.julian.baehr.immutable.generated.JavaParser.ExpressionAutoCpyContext;
import de.julian.baehr.immutable.generated.JavaParser.ExpressionCastContext;
import de.julian.baehr.immutable.generated.JavaParser.ExpressionCtorContext;
import de.julian.baehr.immutable.generated.JavaParser.ExpressionDotExplGenInvocContext;
import de.julian.baehr.immutable.generated.JavaParser.ExpressionDotIdContext;
import de.julian.baehr.immutable.generated.JavaParser.ExpressionDotNewWildInnerContext;
import de.julian.baehr.immutable.generated.JavaParser.ExpressionDotSuperSuffixContext;
import de.julian.baehr.immutable.generated.JavaParser.ExpressionDotThisContext;
import de.julian.baehr.immutable.generated.JavaParser.ExpressionEqualsContext;
import de.julian.baehr.immutable.generated.JavaParser.ExpressionInstanceofContext;
import de.julian.baehr.immutable.generated.JavaParser.ExpressionLessGreaterContext;
import de.julian.baehr.immutable.generated.JavaParser.ExpressionLessGreaterEqualContext;
import de.julian.baehr.immutable.generated.JavaParser.ExpressionMathContext;
import de.julian.baehr.immutable.generated.JavaParser.ExpressionMethodCallContext;
import de.julian.baehr.immutable.generated.JavaParser.ExpressionMulDivModContext;
import de.julian.baehr.immutable.generated.JavaParser.ExpressionNotContext;
import de.julian.baehr.immutable.generated.JavaParser.ExpressionOrContext;
import de.julian.baehr.immutable.generated.JavaParser.ExpressionOrOrContext;
import de.julian.baehr.immutable.generated.JavaParser.ExpressionPostContext;
import de.julian.baehr.immutable.generated.JavaParser.ExpressionPreContext;
import de.julian.baehr.immutable.generated.JavaParser.ExpressionPrimaryContext;
import de.julian.baehr.immutable.generated.JavaParser.ExpressionTernContext;
import de.julian.baehr.immutable.generated.JavaParser.ExpressionXorContext;
import de.julian.baehr.immutable.generated.JavaParser.StatementExpressionContext;
import de.julian.baehr.immutable.listeners.ImmutableBaseListener;
import de.julian.baehr.immutable.models.MConstructor;
import de.julian.baehr.immutable.models.expressions.MExpression;

public class ExpressionListener extends ImmutableBaseListener<MExpression>{

	private final MConstructor autoCpy;
	private final boolean arraysAllowed;
	
	public ExpressionListener(boolean arraysAllowed, MConstructor autoCpy){
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterStatementExpression(StatementExpressionContext ctx) {
		enterHere(ctx.expression());
	}
	
	@Override
	public void enterConstantExpression(ConstantExpressionContext ctx) {
		enterHere(ctx.expression());
	}
	
	private void enter(ParserRuleContext ctx, ImmutableBaseListener<? extends MExpression> listener){
		enterThere(ctx, listener)
			.ifResult(this::setResult);
	}
	
	@Override
	public void enterExpressionPrimary(ExpressionPrimaryContext ctx) {
		enter(ctx, new ExpressionPrimaryListener(arraysAllowed, autoCpy));
	}
	
	@Override
	public void enterExpressionDotId(ExpressionDotIdContext ctx) {
		enter(ctx, new ExpressionDotIdListener(arraysAllowed, autoCpy));
	}
	
	@Override
	public void enterExpressionDotThis(ExpressionDotThisContext ctx) {
		enter(ctx, new ExpressionDotThisListener(arraysAllowed, autoCpy));
	}
	
	@Override
	public void enterExpressionDotNewWildInner(ExpressionDotNewWildInnerContext ctx) {
		enter(ctx, new ExpressionDotNewWildInnerListener(arraysAllowed, autoCpy));
	}
	
	@Override
	public void enterExpressionDotSuperSuffix(ExpressionDotSuperSuffixContext ctx) {
		enter(ctx, new ExpressionDotSuperSuffixListener(arraysAllowed, autoCpy));
	}
	
	@Override
	public void enterExpressionDotExplGenInvoc(ExpressionDotExplGenInvocContext ctx) {
		enter(ctx, new ExpressionDorExplGenInvocListener(arraysAllowed, autoCpy));
	}
	
	@Override
	public void enterExpressionArray(ExpressionArrayContext ctx) {
		enter(ctx, new ExpressionArrayListener(arraysAllowed, autoCpy));
	}
	
	@Override
	public void enterExpressionMethodCall(ExpressionMethodCallContext ctx) {
		enter(ctx, new ExpressionMethodCallListener(arraysAllowed, autoCpy));
	}
	
	@Override
	public void enterExpressionCtor(ExpressionCtorContext ctx) {
		enter(ctx, new ExpressionCtorListener(arraysAllowed, autoCpy));
	}
	
	@Override
	public void enterExpressionCast(ExpressionCastContext ctx) {
		enter(ctx, new ExpressionCastListener(arraysAllowed, autoCpy));
	}
	
	@Override
	public void enterExpressionPost(ExpressionPostContext ctx) {
		enter(ctx, new ExpressionPostListener(arraysAllowed, autoCpy));
	}
	
	@Override
	public void enterExpressionPre(ExpressionPreContext ctx) {
		enter(ctx, new ExpressionPreListener(arraysAllowed, autoCpy));
	}
	
	@Override
	public void enterExpressionNot(ExpressionNotContext ctx) {
		enter(ctx, new ExpressionNotListener(arraysAllowed, autoCpy));
	}
	
	@Override
	public void enterExpressionMulDivMod(ExpressionMulDivModContext ctx) {
		enter(ctx, new ExpressionMulDivModListener(arraysAllowed, autoCpy));
	}
	
	@Override
	public void enterExpressionAddSub(ExpressionAddSubContext ctx) {
		enter(ctx, new ExpressionAddSubListener(arraysAllowed, autoCpy));
	}
	
	@Override
	public void enterExpressionLessGreater(ExpressionLessGreaterContext ctx) {
		enter(ctx, new ExpressionLessGreaterListener(arraysAllowed, autoCpy));
	}
	
	@Override
	public void enterExpressionLessGreaterEqual(ExpressionLessGreaterEqualContext ctx) {
		enter(ctx, new ExpressionLessGreaterEqualListener(arraysAllowed, autoCpy));
	}
	
	@Override
	public void enterExpressionInstanceof(ExpressionInstanceofContext ctx) {
		enter(ctx, new ExpressionInstanceofListener(arraysAllowed, autoCpy));
	}
	
	@Override
	public void enterExpressionEquals(ExpressionEqualsContext ctx) {
		enter(ctx, new ExpressionEqualsListener(arraysAllowed, autoCpy));
	}
	
	@Override
	public void enterExpressionAnd(ExpressionAndContext ctx) {
		enter(ctx, new ExpressionAndListener(arraysAllowed, autoCpy));
	}
	
	@Override
	public void enterExpressionXor(ExpressionXorContext ctx) {
		enter(ctx, new ExpressionXorListener(arraysAllowed, autoCpy));
	}
	
	@Override
	public void enterExpressionOr(ExpressionOrContext ctx) {
		enter(ctx, new ExpressionOrListener(arraysAllowed, autoCpy));
	}
	
	@Override
	public void enterExpressionAndAnd(ExpressionAndAndContext ctx) {
		enter(ctx, new ExpressionAndAndListener(arraysAllowed, autoCpy));
	}
	
	@Override
	public void enterExpressionOrOr(ExpressionOrOrContext ctx) {
		enter(ctx, new ExpressionOrOrListener(arraysAllowed, autoCpy));
	}
	
	@Override
	public void enterExpressionTern(ExpressionTernContext ctx) {
		enter(ctx, new ExpressionTernListener(arraysAllowed, autoCpy));
	}
	
	@Override
	public void enterExpressionMath(ExpressionMathContext ctx) {
		enter(ctx, new ExpressionMathListener(arraysAllowed, autoCpy));
	}
	
	@Override
	public void enterExpressionAutoCpy(ExpressionAutoCpyContext ctx) {
		enter(ctx, new ExpressionAutoCpyListener(arraysAllowed, autoCpy));
	}
}
