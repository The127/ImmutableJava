package de.julian.baehr.immutable.models;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;

import de.julian.baehr.immutable.listeners.exceptions.ListenerException;

public class MClassBody {
	
	private boolean useBrackets = false;
	private MBlock staticBlock;
	private List<MBlock> initializers = new LinkedList<>();
	private List<MType> subTypes = new LinkedList<>();
	private List<MField> fields = new LinkedList<>();
	private List<MConstructor> ctors = new LinkedList<>();
	private List<MGenericConstructor> genericCtors = new LinkedList<>();
	private List<MMethod> methods = new LinkedList<>();
	private List<MGenericMethod> genericMethods = new LinkedList<>();
	private MConstructor autoCpy;
	
	public void setAutoCpy(MConstructor autoCpy) {
		this.autoCpy = autoCpy;
	}
	
	public MConstructor getAutoCpy() {
		return autoCpy;
	}
	
	public List<MField> getFields(){
		return Collections.unmodifiableList(fields);
	}
	
	public void addField(MField field){
		fields.add(field);
	}
	
	public void addCtor(MConstructor ctor){
		ctors.add(ctor);
	}
	
	public void addGenericCtor(MGenericConstructor ctor){
		genericCtors.add(ctor);
	}
	
	public void addMethod(MMethod method){
		methods.add(method);
	}
	
	public void addGenericMethod(MGenericMethod method){
		genericMethods.add(method);
	}
	
	public void setStaticBlock(MBlock staticBlock, ParserRuleContext ctx) {
		if(this.staticBlock != null)
			throw new ListenerException("Duplicate static constructor.", ctx);
		this.staticBlock = staticBlock;
	}
	
	public void addInitializer(MBlock initializer){
		initializers.add(initializer);
	}
	
	public void addSubType(MType subType){
		subTypes.add(subType);
	}
	
	public void useBrackets(){
		useBrackets = true;
	}
	
	private String openingBracket(){
		if(useBrackets)return "{";
		else return "";
	}
	
	private String closingBracket(){
		if(useBrackets)return "}";
		else return "";
	}
	
	@Override
	public String toString() {
		return new StringBuilder()
				.append(openingBracket()).append(System.lineSeparator())
				.append(ModelUtil.concat(System.lineSeparator(), subTypes))
				.append(System.lineSeparator())
				.append(ModelUtil.ifNotNull(staticBlock, () -> "static" + staticBlock.toString()))
				.append(System.lineSeparator())
				.append(ModelUtil.concat(System.lineSeparator(), initializers))
				.append(System.lineSeparator())
				.append(ModelUtil.concat(System.lineSeparator(), fields))
				.append(System.lineSeparator())
				.append(ModelUtil.concat(System.lineSeparator(), ctors))
				.append(System.lineSeparator())
				.append(ModelUtil.concat(System.lineSeparator(), genericCtors))
				.append(System.lineSeparator())
				.append(ModelUtil.concat(System.lineSeparator(), methods))
				.append(System.lineSeparator())
				.append(ModelUtil.concat(System.lineSeparator(), genericMethods))
				.append(System.lineSeparator()).append(closingBracket())
				.toString();
	}
}
