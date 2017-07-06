package de.julian.baehr.immutable.models;

import java.util.LinkedList;
import java.util.List;

public class MTypeList {

	private List<MTypeType> types = new LinkedList<>();
	
	public void addType(MTypeType typeType){
		types.add(typeType);
	}
	
	@Override
	public String toString() {
		return ModelUtil.concat(" , ", types);
	}
}
