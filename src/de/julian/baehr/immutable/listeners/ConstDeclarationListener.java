package de.julian.baehr.immutable.listeners;

import de.julian.baehr.immutable.generated.JavaParser.ConstDeclarationContext;
import de.julian.baehr.immutable.generated.JavaParser.ConstantDeclaratorContext;
import de.julian.baehr.immutable.listeners.exceptions.ListenerException;
import de.julian.baehr.immutable.models.MConstDeclaration;

public class ConstDeclarationListener extends ImmutableBaseListener<MConstDeclaration>{
	
	private class ConstDeclaratorListener extends ImmutableBaseListener<MConstDeclaration.MConstDeclarator>{
		
		private final boolean arraysAllowed;
		
		public ConstDeclaratorListener(boolean arraysAllowed) {
			this.arraysAllowed = arraysAllowed;
		}
		
		@Override
		public void enterConstantDeclarator(ConstantDeclaratorContext ctx) {
			setResult(ConstDeclarationListener.this.getResult().new MConstDeclarator());
			getResult().setId(ctx.Identifier().getText());
			if(ctx.brackets() != null && !ctx.brackets().getText().equals("")){
				if(!arraysAllowed)
					throw new ListenerException("Arrays are not allowed here.", ctx.brackets());
				else
					getResult().setArray(ctx.brackets().getText());
			}
			enterThere(ctx.variableInitializer(), new VariableInitializerListener(arraysAllowed, null))//no autoCpy in interfaces
				.ifResult(getResult()::setInitializer);
		}
	}
	
	private final boolean arraysAllowed;
	
	public ConstDeclarationListener(boolean arraysAllowed) {
		this.arraysAllowed = arraysAllowed;
	}
	
	@Override
	public void enterConstDeclaration(ConstDeclarationContext ctx) {
		setResult(new MConstDeclaration());
		enterThere(ctx.modifierList(), new ModifierListener(getResult()));
		enterThere(ctx.typeType(), new TypeTypeListener(arraysAllowed))
			.ifResult(getResult()::setTypeType);
		enterHere(ctx.constantDeclarator());
	}
	
	@Override
	public void enterConstantDeclarator(ConstantDeclaratorContext ctx) {
		enterThere(ctx, new ConstDeclaratorListener(arraysAllowed))
			.ifResult(getResult()::addConstDeclarator);
	}
}
