package de.julian.baehr.immutable.models.statements;

import java.lang.reflect.Modifier;

import de.julian.baehr.immutable.models.MExpressionList;
import de.julian.baehr.immutable.models.MLocalVariableDeclaration;
import de.julian.baehr.immutable.models.MModifiers;
import de.julian.baehr.immutable.models.MTypeType;
import de.julian.baehr.immutable.models.MVariableDeclaratorId;
import de.julian.baehr.immutable.models.ModelUtil;
import de.julian.baehr.immutable.models.expressions.MExpression;

public class MStatementFor extends MStatement {

	private MStatement statement;
	
	private MModifiers modifiers = new MModifiers(Modifier.FINAL);
	private MTypeType advancedType;
	private MExpression advancedExpression;
	private MVariableDeclaratorId advancedVarId;
	
	private MLocalVariableDeclaration localVariableDeclaration;
	private MExpressionList expressionList;
	private MExpression forControlExpression;
	private MExpressionList forUpdateExpressionList;
	private boolean advanced = false;

	public void setAdvancedVarId(MVariableDeclaratorId advancedVarId) {
		this.advancedVarId = advancedVarId;
	}
	
	public void setAdvancedExpression(MExpression advancedExpression) {
		this.advancedExpression = advancedExpression;
	}
	
	public void setAdvancedType(MTypeType advancedType) {
		this.advancedType = advancedType;
	}
	
	public MModifiers getModifiers() {
		return modifiers;
	}
	
	public void setLocalVariableDeclaration(MLocalVariableDeclaration localVariableDeclaration) {
		this.localVariableDeclaration = localVariableDeclaration;
	}
	
	public void setExpressionList(MExpressionList expressionList) {
		this.expressionList = expressionList;
	}
	
	public void setForUpdateExpressionList(MExpressionList forUpdateExpressionList) {
		this.forUpdateExpressionList = forUpdateExpressionList;
	}
	
	public void setForControlExpression(MExpression forControlExpression) {
		this.forControlExpression = forControlExpression;
	}
	
	public void setAdvanced(){
		advanced = true;
	}
	
	public void setStatement(MStatement statement) {
		this.statement = statement;
	}
	
	private String forLoopControl(){
		if(advanced){
			return modifiers.toString() + " " + advancedType.toString() + " " + advancedVarId.toString() + " : " + advancedExpression.toString();
		}else{
			String front = "";
			if(localVariableDeclaration != null)
				front = localVariableDeclaration.toString();
			else if(expressionList != null)
				front = expressionList.toString();
			return front + " ; " 
						+ ModelUtil.ifNotNull(forControlExpression, () -> forControlExpression.toString()) + " ; " 
						+ ModelUtil.ifNotNull(forUpdateExpressionList, () -> forUpdateExpressionList.toString());
		}
	}
	
	public String toString() {
		return new StringBuilder()
				.append("for (")
				.append(forLoopControl())
				.append(")")
				.append(statement.toString())
				.toString();
	};
}
