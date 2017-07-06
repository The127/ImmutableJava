package de.julian.baehr.immutable.listeners.statements;

import org.antlr.v4.runtime.ParserRuleContext;

import de.julian.baehr.immutable.generated.JavaParser.StatementAssertContext;
import de.julian.baehr.immutable.generated.JavaParser.StatementBlockContext;
import de.julian.baehr.immutable.generated.JavaParser.StatementBreakContext;
import de.julian.baehr.immutable.generated.JavaParser.StatementContinueContext;
import de.julian.baehr.immutable.generated.JavaParser.StatementDoContext;
import de.julian.baehr.immutable.generated.JavaParser.StatementForContext;
import de.julian.baehr.immutable.generated.JavaParser.StatementIdentifierStatementContext;
import de.julian.baehr.immutable.generated.JavaParser.StatementIfContext;
import de.julian.baehr.immutable.generated.JavaParser.StatementReturnContext;
import de.julian.baehr.immutable.generated.JavaParser.StatementSemicolonContext;
import de.julian.baehr.immutable.generated.JavaParser.StatementStatemenExpressionContext;
import de.julian.baehr.immutable.generated.JavaParser.StatementSwitchContext;
import de.julian.baehr.immutable.generated.JavaParser.StatementSynchronizedContext;
import de.julian.baehr.immutable.generated.JavaParser.StatementThrowContext;
import de.julian.baehr.immutable.generated.JavaParser.StatementTryContext;
import de.julian.baehr.immutable.generated.JavaParser.StatementTryResourcesContext;
import de.julian.baehr.immutable.generated.JavaParser.StatementWhileContext;
import de.julian.baehr.immutable.listeners.ImmutableBaseListener;
import de.julian.baehr.immutable.models.MConstructor;
import de.julian.baehr.immutable.models.statements.MStatement;

public class StatementListener extends ImmutableBaseListener<MStatement> {
	
	private final boolean arraysAllowed;
	private final MConstructor autoCpy;
	
	public StatementListener(boolean arraysAllowed, MConstructor autoCpy) {
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	private void enter(ParserRuleContext ctx, ImmutableBaseListener<? extends MStatement> listener){
		enterThere(ctx, listener)
			.ifResult(this::setResult);
	}
	
	@Override
	public void enterStatementBlock(StatementBlockContext ctx) {
		enter(ctx, new StatementBlockListener(arraysAllowed, autoCpy));
	}
	
	@Override
	public void enterStatementAssert(StatementAssertContext ctx) {
		enter(ctx, new StatementAssertListener(arraysAllowed, autoCpy));
	}
	
	@Override
	public void enterStatementIf(StatementIfContext ctx) {
		enter(ctx, new StatementIfListener(arraysAllowed, autoCpy));
	}
	
	@Override
	public void enterStatementFor(StatementForContext ctx) {
		enter(ctx, new StatementForListener(arraysAllowed, autoCpy));
	}
	
	@Override
	public void enterStatementWhile(StatementWhileContext ctx) {
		enter(ctx, new StatementWhileListener(arraysAllowed, autoCpy));
	}
	
	@Override
	public void enterStatementDo(StatementDoContext ctx) {
		enter(ctx, new StatementDoListener(arraysAllowed, autoCpy));
	}
	
	@Override
	public void enterStatementTry(StatementTryContext ctx) {
		enter(ctx, new StatementTryListener(arraysAllowed, autoCpy));
	}
	
	@Override
	public void enterStatementTryResources(StatementTryResourcesContext ctx) {
		enter(ctx, new StatementTryResourcesListener(arraysAllowed, autoCpy));
	}
	
	@Override
	public void enterStatementSwitch(StatementSwitchContext ctx) {
		enter(ctx, new StatementSwitchListener(arraysAllowed, autoCpy));
	}
	
	@Override
	public void enterStatementSynchronized(StatementSynchronizedContext ctx) {
		enter(ctx, new StatementSynchronizedListener(arraysAllowed, autoCpy));
	}
	
	@Override
	public void enterStatementReturn(StatementReturnContext ctx) {
		enter(ctx, new StatementReturnListener(arraysAllowed, autoCpy));
	}
	
	@Override
	public void enterStatementThrow(StatementThrowContext ctx) {
		enter(ctx, new StatementThrowListener(arraysAllowed, autoCpy));
	}
	
	@Override
	public void enterStatementBreak(StatementBreakContext ctx) {
		enter(ctx, new StatementBreakListener());
	}
	
	@Override
	public void enterStatementContinue(StatementContinueContext ctx) {
		enter(ctx, new StatementContinueListener());
	}
	
	@Override
	public void enterStatementSemicolon(StatementSemicolonContext ctx) {
		// ignore
	}
	
	@Override
	public void enterStatementStatemenExpression(StatementStatemenExpressionContext ctx) {
		enter(ctx, new StatementStatementExpressionListener(arraysAllowed, autoCpy));
	}
	
	@Override
	public void enterStatementIdentifierStatement(StatementIdentifierStatementContext ctx) {
		enter(ctx, new StatementIdentifierStatementListener(arraysAllowed, autoCpy));
	}
}
