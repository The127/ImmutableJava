package de.julian.baehr.immutable.models;

import java.lang.reflect.Modifier;
import java.util.LinkedList;
import java.util.List;

public class MTypeEnum extends MType {

	private MTypeList interfaces;
	private List<MEnumConstant> enumConstants = new LinkedList<>();
	private MClassBody classBody;
	
	public MTypeEnum(String name) {
		super("enum", name, Modifier.interfaceModifiers());
	}
	
	public void setClassBody(MClassBody classBody) {
		this.classBody = classBody;
	}
	
	public MClassBody getClassBody() {
		return classBody;
	}
	
	public void addConstant(MEnumConstant enumConstant){
		enumConstants.add(enumConstant);
	}
	
	public void setInterfaces(MTypeList interfaces) {
		this.interfaces = interfaces;
	}

	@Override
	public String toString() {
		return new StringBuilder()
				.append(getModifiers().toString()).append(" ")
				.append(getType()).append(" ").append(getName()).append(" ")
				.append(ModelUtil.ifNotNull(interfaces, () -> interfaces.toString()))
				.append("{").append(System.lineSeparator())
				.append(ModelUtil.concat("," + System.lineSeparator(), enumConstants))
				.append(System.lineSeparator())
				.append(";").append(System.lineSeparator())
				.append(ModelUtil.concat(System.lineSeparator(), getSubTypes()))
				.append(System.lineSeparator())
				.append(ModelUtil.ifNotNull(classBody, () -> classBody.toString()))
				.append(System.lineSeparator()).append("}")
				.toString();
	}
}
