package de.julian.baehr.immutable.listeners;

import de.julian.baehr.immutable.generated.JavaParser.VariableDeclaratorIdContext;
import de.julian.baehr.immutable.listeners.exceptions.ListenerException;
import de.julian.baehr.immutable.models.MVariableDeclaratorId;

public class VariableDeclaratorIdListener extends ImmutableBaseListener<MVariableDeclaratorId>{
	
	private final boolean arraysAllowed;
	
	public VariableDeclaratorIdListener(boolean arraysAllowed){
		this.arraysAllowed = arraysAllowed;
	}
	
	@Override
	public void enterVariableDeclaratorId(VariableDeclaratorIdContext ctx) {
		String id = ctx.Identifier().getText();
		if(ctx.arrayBrackets != null){
			if(!arraysAllowed){
				throw new ListenerException("Arrays not allowed here.", ctx);
			}else{
				id += ctx.arrayBrackets.getText();
			}
		}
		setResult(new MVariableDeclaratorId());
		getResult().setId(id);
	}
}
