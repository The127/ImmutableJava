package de.julian.baehr.immutable.listeners;

import de.julian.baehr.immutable.generated.JavaParser.FormalParameterContext;
import de.julian.baehr.immutable.generated.JavaParser.FormalParameterListContext;
import de.julian.baehr.immutable.generated.JavaParser.FormalParametersContext;
import de.julian.baehr.immutable.generated.JavaParser.LastFormalParameterContext;
import de.julian.baehr.immutable.generated.JavaParser.VariableDeclaratorIdContext;
import de.julian.baehr.immutable.generated.JavaParser.VariableModifierListContext;
import de.julian.baehr.immutable.models.MFormalParameters;

public class FormalParametersListener extends ImmutableBaseListener<MFormalParameters>{

	private class FormalParameterListener extends ImmutableBaseListener<MFormalParameters.MFormalParameter> {

		private final boolean arraysAllowed;
		
		public FormalParameterListener(boolean arraysAllowed){
			this.arraysAllowed = arraysAllowed;
			setResult(FormalParametersListener.this.getResult().new MFormalParameter());
		}
		
		@Override
		public void enterFormalParameter(FormalParameterContext ctx) {
			enterHere(ctx.variableModifierList());
			enterThere(ctx.typeType(), new TypeTypeListener(arraysAllowed))
				.ifResult(getResult()::setType);
			enterHere(ctx.variableDeclaratorId());
		}
		
		@Override
		public void enterLastFormalParameter(LastFormalParameterContext ctx) {
			enterHere(ctx.variableModifierList());
			enterThere(ctx.typeType(), new TypeTypeListener(arraysAllowed))
				.ifResult(getResult()::setType);
			getResult().setVarargs();
			enterHere(ctx.variableDeclaratorId());
		}
		
		@Override
		public void enterVariableModifierList(VariableModifierListContext ctx) {
			enterThere(ctx.variableModifierList(), new ModifierListener(getResult()));
		}
		
		@Override
		public void enterVariableDeclaratorId(VariableDeclaratorIdContext ctx) {
			enterThere(ctx, new VariableDeclaratorIdListener(arraysAllowed))
				.ifResult(getResult()::setVariableDeclaratorId);
		}
	}
	
	private final boolean arraysAllowed;
	
	public FormalParametersListener(boolean arraysAllowed){
		this.arraysAllowed = arraysAllowed;
	}
	
	@Override
	public void enterFormalParameters(FormalParametersContext ctx) {
		setResult(new MFormalParameters());
		enterHere(ctx.formalParameterList());
	}
	
	@Override
	public void enterFormalParameterList(FormalParameterListContext ctx) {
		enterHere(ctx.formalParameter());
		enterHere(ctx.lastFormalParameter());
	}
	
	@Override
	public void enterFormalParameter(FormalParameterContext ctx) {
		enterThere(ctx, new FormalParameterListener(arraysAllowed))
			.ifResult(getResult()::add);
	}
	
	@Override
	public void enterLastFormalParameter(LastFormalParameterContext ctx) {
		enterThere(ctx, new FormalParameterListener(arraysAllowed))
		.ifResult(getResult()::add);
	}
}
