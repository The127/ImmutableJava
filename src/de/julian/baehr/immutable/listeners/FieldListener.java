package de.julian.baehr.immutable.listeners;

import de.julian.baehr.immutable.generated.JavaParser.FieldDeclarationContext;
import de.julian.baehr.immutable.models.MField;

public class FieldListener extends ImmutableBaseListener<MField>{

	private final boolean arraysAllowed;
	private final boolean makeFinal;
	
	public FieldListener(boolean arraysAllowed, boolean makeFinal){
		this.arraysAllowed = arraysAllowed;
		this.makeFinal = makeFinal;
	}
	
	@Override
	public void enterFieldDeclaration(FieldDeclarationContext ctx) {
		setResult(new MField());
		enterThere(ctx.modifierList(), new ModifierListener(getResult()));
		enterThere(ctx.typeType(), new TypeTypeListener(arraysAllowed))
			.ifResult(getResult()::setType);
		//no auto at this point
		enterThere(ctx.variableDeclarators(), new VariableDeclaratorsListener(arraysAllowed, null))
			.ifResult(getResult()::setDeclarators);
		
		//feature: auto final fields!
		if(makeFinal)
			getResult().makeFinal();
	}
}
