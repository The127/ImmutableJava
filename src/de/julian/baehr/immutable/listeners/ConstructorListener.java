package de.julian.baehr.immutable.listeners;

import de.julian.baehr.immutable.generated.JavaParser.ConstructorBodyContext;
import de.julian.baehr.immutable.generated.JavaParser.ConstructorDeclarationContext;
import de.julian.baehr.immutable.models.MConstructor;

public class ConstructorListener extends ImmutableBaseListener<MConstructor>{

	private final boolean modifiersAllowed, arraysAllowed;
	private final MConstructor autoCpy;

	public ConstructorListener(boolean modifiersAllowed, boolean arraysAllowed, MConstructor autoCpy){
		this.modifiersAllowed = modifiersAllowed;
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterConstructorDeclaration(ConstructorDeclarationContext ctx) {
		setResult(new MConstructor(modifiersAllowed));
		enterThere(ctx.modifierList(), new ModifierListener(getResult()));
		getResult().setClassName(ctx.Identifier().getText());
		enterThere(ctx.formalParameters(), new FormalParametersListener(arraysAllowed))
			.ifResult(getResult()::setFormalParameters);
		enterThere(ctx.qualifiedNameList(), new QualifiedNameListListener())
			.ifResult(getResult()::setExceptions);
		enterHere(ctx.constructorBody());
	}
	
	@Override
	public void enterConstructorBody(ConstructorBodyContext ctx) {
		enterThere(ctx.block(), new BlockListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setConstructorBody);
	}
}
