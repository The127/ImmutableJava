package de.julian.baehr.immutable.listeners;

import de.julian.baehr.immutable.generated.JavaParser.CatchClauseContext;
import de.julian.baehr.immutable.generated.JavaParser.CatchTypeContext;
import de.julian.baehr.immutable.generated.JavaParser.QualifiedNameContext;
import de.julian.baehr.immutable.models.MCatchClause;
import de.julian.baehr.immutable.models.MConstructor;

public class CatchClauseListener extends ImmutableBaseListener<MCatchClause>{

	private final boolean arraysAllowed;
	private final MConstructor autoCpy;
	
	public CatchClauseListener(boolean arraysAllowed, MConstructor autoCpy) {
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterCatchClause(CatchClauseContext ctx) {
		setResult(new MCatchClause());
		enterThere(ctx.variableModifierList(), new ModifierListener(getResult()));
		enterHere(ctx.catchType());
		getResult().setId(ctx.Identifier().getText());
		enterThere(ctx.block(), new BlockListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setBlock);
	}
	
	@Override
	public void enterCatchType(CatchTypeContext ctx) {
		enterHere(ctx.qualifiedName());
	}
	
	@Override
	public void enterQualifiedName(QualifiedNameContext ctx) {
		getResult().addCatchType(ctx.toString());
	}
}
