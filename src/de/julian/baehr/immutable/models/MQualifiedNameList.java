package de.julian.baehr.immutable.models;

import java.util.LinkedList;
import java.util.List;

public class MQualifiedNameList {

	private List<String> qualifiedNames = new LinkedList<>();
	
	public void add(String qualifiedName){
		qualifiedNames.add(qualifiedName);
	}
	
	@Override
	public String toString() {
		return ModelUtil.concat(" , ", qualifiedNames);
	}
}
