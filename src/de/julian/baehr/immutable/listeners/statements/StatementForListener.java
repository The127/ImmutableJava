package de.julian.baehr.immutable.listeners.statements;

import de.julian.baehr.immutable.generated.JavaParser.EnhancedForControlContext;
import de.julian.baehr.immutable.generated.JavaParser.ForControlContext;
import de.julian.baehr.immutable.generated.JavaParser.ForInitContext;
import de.julian.baehr.immutable.generated.JavaParser.ForUpdateContext;
import de.julian.baehr.immutable.generated.JavaParser.StatementForContext;
import de.julian.baehr.immutable.generated.JavaParser.VariableDeclaratorIdContext;
import de.julian.baehr.immutable.listeners.ExpressionListListener;
import de.julian.baehr.immutable.listeners.ImmutableBaseListener;
import de.julian.baehr.immutable.listeners.LocalVariableDeclarationListener;
import de.julian.baehr.immutable.listeners.ModifierListener;
import de.julian.baehr.immutable.listeners.TypeTypeListener;
import de.julian.baehr.immutable.listeners.VariableDeclaratorIdListener;
import de.julian.baehr.immutable.listeners.expressions.ExpressionListener;
import de.julian.baehr.immutable.models.MConstructor;
import de.julian.baehr.immutable.models.statements.MStatementFor;

public class StatementForListener extends ImmutableBaseListener<MStatementFor>{

	private final boolean arraysAllowed;
	private final MConstructor autoCpy;
	
	public StatementForListener(boolean arraysAllowed, MConstructor autoCpy){
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterStatementFor(StatementForContext ctx) {
		setResult(new MStatementFor());
		enterHere(ctx.forControl());
		enterThere(ctx.statement(), new StatementListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setStatement);
	}
	
	@Override
	public void enterForControl(ForControlContext ctx) {
		enterHere(ctx.enhancedForControl());
		enterHere(ctx.forInit());
		enterThere(ctx.expression(), new ExpressionListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setForControlExpression);
		enterHere(ctx.forUpdate());
	}
	
	@Override
	public void enterEnhancedForControl(EnhancedForControlContext ctx) {
		getResult().setAdvanced();
		enterThere(ctx.variableModifierList(), new ModifierListener(getResult().getModifiers()));
		enterThere(ctx.typeType(), new TypeTypeListener(arraysAllowed))
			.ifResult(getResult()::setAdvancedType);
		enterHere(ctx.variableDeclaratorId());
		enterThere(ctx.expression(), new ExpressionListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setAdvancedExpression);
	}
	
	@Override
	public void enterVariableDeclaratorId(VariableDeclaratorIdContext ctx) {
		enterThere(ctx, new VariableDeclaratorIdListener(arraysAllowed))
			.ifResult(getResult()::setAdvancedVarId);
	}
	
	@Override
	public void enterForInit(ForInitContext ctx) {
		enterThere(ctx.localVariableDeclaration(), new LocalVariableDeclarationListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setLocalVariableDeclaration);
		enterThere(ctx.expressionList(), new ExpressionListListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setExpressionList);
	}
	
	@Override
	public void enterForUpdate(ForUpdateContext ctx) {
		enterThere(ctx.expressionList(), new ExpressionListListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setForUpdateExpressionList);
	}
}
