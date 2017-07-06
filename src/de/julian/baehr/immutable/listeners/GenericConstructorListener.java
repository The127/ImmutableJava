package de.julian.baehr.immutable.listeners;

import de.julian.baehr.immutable.generated.JavaParser.GenericConstructorDeclarationContext;
import de.julian.baehr.immutable.models.MConstructor;
import de.julian.baehr.immutable.models.MGenericConstructor;

public class GenericConstructorListener extends ImmutableBaseListener<MGenericConstructor>{
	
	private final boolean arraysAllowed;
	private final MConstructor autoCpy;

	public GenericConstructorListener(boolean arraysAllowed, MConstructor autoCpy){
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterGenericConstructorDeclaration(GenericConstructorDeclarationContext ctx) {
		setResult(new MGenericConstructor());
		enterThere(ctx.modifierList(), new ModifierListener(getResult()));
		enterThere(ctx.typeParameters(), new TypeParametersListener(arraysAllowed))
			.ifResult(getResult()::setTypeParameters);
		enterThere(ctx.constructorDeclaration(), new ConstructorListener(false, arraysAllowed, autoCpy))
			.ifResult(getResult()::setConstructor);
	}
}
