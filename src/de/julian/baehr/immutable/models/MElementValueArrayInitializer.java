package de.julian.baehr.immutable.models;

import java.util.LinkedList;
import java.util.List;

public class MElementValueArrayInitializer {

	private List<MElementValue> elementValues = new LinkedList<>();
	
	public void addElementValue(MElementValue elementValue){
		elementValues.add(elementValue);
	}
	
	@Override
	public String toString() {
		return new StringBuilder()
				.append("{")
				.append(ModelUtil.concat(", ", elementValues))
				.append("}")
				.toString();
	}
}
