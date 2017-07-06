package de.julian.baehr.immutable.listeners;

import de.julian.baehr.immutable.generated.JavaParser.GenericInterfaceMethodDeclarationContext;
import de.julian.baehr.immutable.models.MGenericInterfaceMethod;

public class GenericInterfaceMethodListener extends ImmutableBaseListener<MGenericInterfaceMethod>{

	private final boolean arraysAllowed;
	
	public GenericInterfaceMethodListener(boolean arraysAllowed){
		this.arraysAllowed = arraysAllowed;
	}
	
	@Override
	public void enterGenericInterfaceMethodDeclaration(GenericInterfaceMethodDeclarationContext ctx) {
		setResult(new MGenericInterfaceMethod());
		enterThere(ctx.modifierList(), new ModifierListener(getResult()));
		enterThere(ctx.typeParameters(), new TypeParametersListener(arraysAllowed))
			.ifResult(getResult()::setTypeParameters);
		enterThere(ctx.interfaceMethodDeclaration(), new InterfaceMethodListener(arraysAllowed, false))
			.ifResult(getResult()::setMethod);
	}
}
