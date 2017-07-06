package de.julian.baehr.immutable.listeners;

import de.julian.baehr.immutable.generated.JavaParser.LocalVariableDeclarationContext;
import de.julian.baehr.immutable.models.MConstructor;
import de.julian.baehr.immutable.models.MLocalVariableDeclaration;

public class LocalVariableDeclarationListener extends ImmutableBaseListener<MLocalVariableDeclaration>{

	private final boolean arraysAllowed;
	private final MConstructor autoCpy;
	
	public LocalVariableDeclarationListener(boolean arraysAllowed, MConstructor autoCpy){
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterLocalVariableDeclaration(LocalVariableDeclarationContext ctx) {
		setResult(new MLocalVariableDeclaration());
		enterThere(ctx.variableModifierList(), new ModifierListener(getResult()));
		enterThere(ctx.typeType(), new TypeTypeListener(arraysAllowed))
			.ifResult(getResult()::setType);
		enterThere(ctx.variableDeclarators(), new VariableDeclaratorsListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setDeclarators);
	}
}
