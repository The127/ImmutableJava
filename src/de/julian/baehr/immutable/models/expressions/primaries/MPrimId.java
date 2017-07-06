package de.julian.baehr.immutable.models.expressions.primaries;

public class MPrimId extends MPrimary {

	private String id;
	
	public void setId(String id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return id;
	}
}
