package de.julian.baehr.immutable.listeners;

import de.julian.baehr.immutable.generated.JavaParser.VariableDeclaratorContext;
import de.julian.baehr.immutable.generated.JavaParser.VariableDeclaratorIdContext;
import de.julian.baehr.immutable.generated.JavaParser.VariableDeclaratorsContext;
import de.julian.baehr.immutable.generated.JavaParser.VariableInitializerContext;
import de.julian.baehr.immutable.models.MConstructor;
import de.julian.baehr.immutable.models.MVariableDeclarators;

public class VariableDeclaratorsListener extends ImmutableBaseListener<MVariableDeclarators> {
	
	private class VariableDeclaratorListener extends ImmutableBaseListener<MVariableDeclarators.MVaraibleDeclarator>{
		
		private final boolean arraysAllowed;
		private final MConstructor autoCpy;
		
		public VariableDeclaratorListener(boolean arraysAllowed, MConstructor autoCpy){
			this.arraysAllowed = arraysAllowed;
			this.autoCpy = autoCpy;
		}
		
		@Override
		public void enterVariableDeclarator(VariableDeclaratorContext ctx) {
			setResult(VariableDeclaratorsListener.this.getResult().new MVaraibleDeclarator());
			enterHere(ctx.variableDeclaratorId());
			enterHere(ctx.variableInitializer());
		}
		
		@Override
		public void enterVariableDeclaratorId(VariableDeclaratorIdContext ctx) {
			enterThere(ctx, new VariableDeclaratorIdListener(arraysAllowed))
				.ifResult(getResult()::setId);
		}
		
		@Override
		public void enterVariableInitializer(VariableInitializerContext ctx) {
			enterThere(ctx, new VariableInitializerListener(arraysAllowed, autoCpy))
				.ifResult(getResult()::setInitializer);
		}
	}
	
	private final boolean arraysAllowed;
	private final MConstructor autoCpy;
	
	public VariableDeclaratorsListener(boolean arraysAllowed, MConstructor autoCpy){
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterVariableDeclarators(VariableDeclaratorsContext ctx) {
		setResult(new MVariableDeclarators());
		enterHere(ctx.variableDeclarator());
	}
	
	@Override
	public void enterVariableDeclarator(VariableDeclaratorContext ctx) {
		enterThere(ctx, new VariableDeclaratorsListener.VariableDeclaratorListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::add);
	}
}
