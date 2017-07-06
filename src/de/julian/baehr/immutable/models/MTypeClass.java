package de.julian.baehr.immutable.models;

import java.lang.reflect.Modifier;

public class MTypeClass extends MType {

	private MTypeType superType;
	private MTypeParameters typeParameters;
	private MTypeList interfaces;
	private MClassBody classBody;
	
	public MTypeClass(String name) {
		super("class", name, Modifier.classModifiers());
	}
	
	public void setClassBody(MClassBody classBody) {
		this.classBody = classBody;
	}
	
	public void setSuperType(MTypeType superType) {
		this.superType = superType;
	}
	
	public void setTypeParameters(MTypeParameters typeParameters) {
		this.typeParameters = typeParameters;
	}
	
	public void setInterfaces(MTypeList interfaces) {
		this.interfaces = interfaces;
	}
	
	@Override
	public String toString() {
		return new StringBuilder()
				.append(getModifiers().toString()).append(" ")
				.append(getType()).append(" ").append(getName())
				.append(ModelUtil.ifNotNull(typeParameters, () -> typeParameters.toString()))
				.append(" ")
				.append(ModelUtil.ifNotNull(superType, () -> "extends " + superType.toString() + " "))
				.append(ModelUtil.ifNotNull(interfaces, () -> "implements " + interfaces.toString() + " "))
				.append(classBody.toString())
				.toString();
	}
}
