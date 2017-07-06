package de.julian.baehr.immutable.models;

import java.lang.reflect.Modifier;
import java.util.LinkedList;
import java.util.List;

public class MTypeAnnotation extends MType {

	private final List<MAnnotationMethod> annotationMethods = new LinkedList<>();
	private final List<MAnnotationConstant> annotationConstants = new LinkedList<>();
	
	public MTypeAnnotation(String name) {
		super("@interface", name, Modifier.interfaceModifiers());
	}

	public void addAnnotationMethod(MAnnotationMethod annotationMethod){
		annotationMethods.add(annotationMethod);
	}
	
	public void addAnnotationConstant(MAnnotationConstant annotationConstant){
		annotationConstants.add(annotationConstant);
	}
	
	@Override
	public String toString() {
		return new StringBuilder()
				.append(getModifiers().toString())
				.append(" ").append(getType()).append(" ").append(getName()).append("{").append(System.lineSeparator())
				.append(ModelUtil.concat(System.lineSeparator(), getSubTypes()))
				.append(System.lineSeparator())
				.append(ModelUtil.concat(System.lineSeparator(), annotationConstants))
				.append(System.lineSeparator())
				.append(ModelUtil.concat(System.lineSeparator(), annotationMethods))
				.append(System.lineSeparator())
				.append("}")
				.toString();
	}
}
