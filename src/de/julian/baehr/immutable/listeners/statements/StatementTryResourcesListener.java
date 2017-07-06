package de.julian.baehr.immutable.listeners.statements;

import de.julian.baehr.immutable.generated.JavaParser.CatchClauseContext;
import de.julian.baehr.immutable.generated.JavaParser.StatementTryResourcesContext;
import de.julian.baehr.immutable.listeners.BlockListener;
import de.julian.baehr.immutable.listeners.CatchClauseListener;
import de.julian.baehr.immutable.listeners.FinallyBlockListener;
import de.julian.baehr.immutable.listeners.ImmutableBaseListener;
import de.julian.baehr.immutable.listeners.ResourceSpecificationListener;
import de.julian.baehr.immutable.models.MConstructor;
import de.julian.baehr.immutable.models.statements.MStatementTryResources;

public class StatementTryResourcesListener extends ImmutableBaseListener<MStatementTryResources>{

	private final boolean arraysAllowed;
	private final MConstructor autoCpy;
	
	public StatementTryResourcesListener(boolean arraysAllowed, MConstructor autoCpy) {
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterStatementTryResources(StatementTryResourcesContext ctx) {
		setResult(new MStatementTryResources());
		enterThere(ctx.resourceSpecification(), new ResourceSpecificationListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setResourceSpecification);
		enterThere(ctx.block(), new BlockListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setBlock);
		enterHere(ctx.catchClause());
		enterThere(ctx.finallyBlock(), new FinallyBlockListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setFinallyBlock);
	}
	
	@Override
	public void enterCatchClause(CatchClauseContext ctx) {
		enterThere(ctx, new CatchClauseListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::addCatchClause);
	}
}
