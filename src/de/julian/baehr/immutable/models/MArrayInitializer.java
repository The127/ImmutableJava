package de.julian.baehr.immutable.models;

import java.util.LinkedList;
import java.util.List;

public class MArrayInitializer {

	private List<MVariableInitializer> initializers = new LinkedList<>();
	
	public void add(MVariableInitializer initializer){
		initializers.add(initializer);
	}
	
	@Override
	public String toString() {
		return "{" + ModelUtil.concat(" , ", initializers) + "}";
	}
}
