package de.julian.baehr.immutable.listeners;

import java.util.LinkedList;
import java.util.List;

import de.julian.baehr.immutable.generated.JavaParser.ClassBodyContext;
import de.julian.baehr.immutable.generated.JavaParser.ClassBodyDeclarationContext;
import de.julian.baehr.immutable.generated.JavaParser.ClassBodyDeclarationMemberContext;
import de.julian.baehr.immutable.generated.JavaParser.ClassBodyDeclarationSemicolonContext;
import de.julian.baehr.immutable.generated.JavaParser.ClassBodyDeclarationStaticBlockContext;
import de.julian.baehr.immutable.generated.JavaParser.EnumBodyDeclarationsContext;
import de.julian.baehr.immutable.generated.JavaParser.MemberDeclarationMemberContext;
import de.julian.baehr.immutable.generated.JavaParser.MemberDeclarationSubTypeContext;
import de.julian.baehr.immutable.listeners.exceptions.ListenerException;
import de.julian.baehr.immutable.models.MBlock;
import de.julian.baehr.immutable.models.MBlockStatement;
import de.julian.baehr.immutable.models.MClassBody;
import de.julian.baehr.immutable.models.MConstructor;
import de.julian.baehr.immutable.models.MField;
import de.julian.baehr.immutable.models.MFormalParameters;
import de.julian.baehr.immutable.models.MFormalParameters.MFormalParameter;
import de.julian.baehr.immutable.models.MTypeType;
import de.julian.baehr.immutable.models.MVariableDeclaratorId;
import de.julian.baehr.immutable.models.MVariableDeclarators;
import de.julian.baehr.immutable.models.MVariableDeclarators.MVaraibleDeclarator;
import de.julian.baehr.immutable.models.expressions.MExpressionDotId;
import de.julian.baehr.immutable.models.expressions.MExpressionMath;
import de.julian.baehr.immutable.models.expressions.MExpressionPrimary;
import de.julian.baehr.immutable.models.expressions.primaries.MPrimId;
import de.julian.baehr.immutable.models.expressions.primaries.MPrimThis;
import de.julian.baehr.immutable.models.statements.MStatement;
import de.julian.baehr.immutable.models.statements.MStatementStatementExpression;

public class ClassBodyListener extends ImmutableBaseListener<MClassBody> {

	private class Param {
		private MTypeType type;
		private MVariableDeclaratorId name;
		public Param(MTypeType type, MVariableDeclaratorId name) {
			this.type = type;
			this.name = name;
		}
	}
	
	private final boolean arraysAllowed;
	private boolean firstMemberPass = true;
	private final String className;
	
	public ClassBodyListener(boolean arraysAllowed, String className) {
		this.arraysAllowed = arraysAllowed;
		this.className = className;
	}
	
	@Override
	public void enterEnumBodyDeclarations(EnumBodyDeclarationsContext ctx) {
		setResult(new MClassBody());
		firstPass(ctx.classBodyDeclaration());
		secondPass(ctx.classBodyDeclaration());
	}
	
	@Override
	public void enterClassBody(ClassBodyContext ctx) {
		setResult(new MClassBody());
		getResult().useBrackets();
		firstPass(ctx.classBodyDeclaration());
		secondPass(ctx.classBodyDeclaration());
	}
	
	private void firstPass(List<ClassBodyDeclarationContext> list){
		//first pass through the member declarations (only fields)
		enterHere(list);
		if(className != null)//only if class name is set
			generateAutoCopyCtor();
	}
	
	private void generateAutoCopyCtor(){
		List<MField> fields = getResult().getFields();
		List<Param> params = new LinkedList<>();
		//find all non static fields
		for(MField field : fields){
			if(!field.isStatic()){
				MVariableDeclarators declarators = field.getDeclarators();
				List<MVaraibleDeclarator> variableInitializers = declarators.getVariableInitializers();
				for(MVaraibleDeclarator declarator : variableInitializers){
					//that do not have an initializer
					if(!declarator.hasInitializer()){
						params.add(new Param(field.getType(), declarator.getId()));
					}
				}
			}
		}
		MConstructor autoCpyCtor = new MConstructor(true);
		autoCpyCtor.simpleModifier("public", null);
		autoCpyCtor.setClassName(className);
		//create formal parameters based on fields
		MFormalParameters formalParameters = new MFormalParameters();
		for(Param param : params){
			MFormalParameter formalParameter = formalParameters.new MFormalParameter();
			formalParameter.setType(param.type);
			formalParameter.setVariableDeclaratorId(param.name);
			formalParameters.add(formalParameter);
		}
		autoCpyCtor.setFormalParameters(formalParameters);
		//create body
		MBlock autoCpyCtorBody = new MBlock();
		for(Param param : params){
			MBlockStatement blockStatement = new MBlockStatement();//expr;
			//used {...} for readability
			MExpressionMath setExpr = new MExpressionMath();//this.fieldName = value
			{
				MExpressionDotId expr1 = new MExpressionDotId();//this.fieldName
				{
					MExpressionPrimary primary = new MExpressionPrimary();//thisExpr
					{
						MPrimThis primThis = new MPrimThis();//this
						primary.setPrimary(primThis);
					}
					expr1.setExpression(primary);
					expr1.setId(param.name.toString());
				}
				setExpr.setExpr1(expr1);
				
				//set operator to '='
				setExpr.setOp("=");
				
				MExpressionPrimary expr2 = new MExpressionPrimary();//valueExpr
				{
					MPrimId id = new MPrimId();//value
					{
						id.setId(param.name.toString());
					}
					expr2.setPrimary(id);
				}
				setExpr.setExpr2(expr2);
			}
			MStatement statement = new MStatementStatementExpression(setExpr);
			blockStatement.setStatement(statement);
			autoCpyCtorBody.addStatemetn(blockStatement);
		}
		autoCpyCtor.setConstructorBody(autoCpyCtorBody);
		getResult().addCtor(autoCpyCtor);
		getResult().setAutoCpy(autoCpyCtor);
	}
	
	private void secondPass(List<ClassBodyDeclarationContext> list){
		//second pass through the member declarations (methods, ctors,...)
		firstMemberPass = false;
		enterHere(list);
	}
	
	@Override
	public void enterClassBodyDeclarationSemicolon(ClassBodyDeclarationSemicolonContext ctx) {
		//ignore
	}
	
	@Override
	public void enterClassBodyDeclarationStaticBlock(ClassBodyDeclarationStaticBlockContext ctx) {
		enterThere(ctx.block(), new BlockListener(arraysAllowed, null))//no autoCpy here
		.ifResult(res -> {
			if(ctx.isStatic != null){
				throw new ListenerException("Static initialisers are not allowed.", ctx);
				//getResult().setStaticBlock(res, ctx);
			}else{
				throw new ListenerException("Non static initialisers are not allowed. Use a static method instead.", ctx);
				//getResult().addInitializer(res);
			}
		});
	}
	
	@Override
	public void enterClassBodyDeclarationMember(ClassBodyDeclarationMemberContext ctx) {
		enterHere(ctx.memberDeclaration());
	}

	@Override
	public void enterMemberDeclarationMember(MemberDeclarationMemberContext ctx) {
		if(firstMemberPass){
			enterThere(ctx.fieldDeclaration(), new FieldListener(false, true))
				.ifResult(getResult()::addField);
		}else{
			enterThere(ctx.methodDeclaration(), new MethodListener(true, false, getResult().getAutoCpy()))
				.ifResult(getResult()::addMethod);
			enterThere(ctx.genericMethodDeclaration(), new GenericMethodListener(false, getResult().getAutoCpy()))
				.ifResult(getResult()::addGenericMethod);
			enterThere(ctx.constructorDeclaration(), new ConstructorListener(true, false, getResult().getAutoCpy()))
				.ifResult(getResult()::addCtor);
			enterThere(ctx.genericConstructorDeclaration(), new GenericConstructorListener(false, getResult().getAutoCpy()))
				.ifResult(getResult()::addGenericCtor);
		}
	}
	
	@Override
	public void enterMemberDeclarationSubType(MemberDeclarationSubTypeContext ctx) {
		enterThere(ctx, new TypeDeclarationListener()).ifResult(getResult()::addSubType);
	}
}
