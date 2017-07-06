package de.julian.baehr.immutable.models;

import java.lang.reflect.Modifier;
import java.util.LinkedList;
import java.util.List;

public class MTypeInterface extends MType {

	private MTypeParameters parameters;
	private MTypeList extensions;
	
	private List<MConstDeclaration> constDeclarations = new LinkedList<>();
	private List<MInterfaceMethod> interfaceMethods = new LinkedList<>();
	private List<MGenericInterfaceMethod> genericInterfaceMethods = new LinkedList<>();
	
	public MTypeInterface(String name) {
		super("interface", name, Modifier.interfaceModifiers());
	}
	
	public void setParameters(MTypeParameters parameters) {
		this.parameters = parameters;
	}
	
	public void setExtensions(MTypeList extensions) {
		this.extensions = extensions;
	}

	public void addInterfaceMethod(MInterfaceMethod interfaceMethod){
		interfaceMethods.add(interfaceMethod);
	}
	
	public void addGenericInterfaceMethod(MGenericInterfaceMethod genericInterfaceMethod){
		genericInterfaceMethods.add(genericInterfaceMethod);
	}
	
	public void addConstDeclaration(MConstDeclaration constDeclaration){
		constDeclarations.add(constDeclaration);
	}
	
	@Override
	public String toString() {
		return new StringBuilder()
				.append(getModifiers().toString()).append(" ")
				.append(getType()).append(" ").append(getName())
				.append(ModelUtil.ifNotNull(parameters, () -> parameters.toString()))
				.append(" ")
				.append(ModelUtil.ifNotNull(extensions, () -> "extends " + extensions.toString()))
				.append("{").append(System.lineSeparator())
				.append(ModelUtil.concat(System.lineSeparator(), getSubTypes()))
				.append(System.lineSeparator())
				.append(ModelUtil.concat(System.lineSeparator(), constDeclarations))
				.append(System.lineSeparator())
				.append(ModelUtil.concat(System.lineSeparator(), interfaceMethods))
				.append(System.lineSeparator())
				.append(ModelUtil.concat(System.lineSeparator(), genericInterfaceMethods))
				.append(System.lineSeparator()).append("}")
				.toString();
	}
}
