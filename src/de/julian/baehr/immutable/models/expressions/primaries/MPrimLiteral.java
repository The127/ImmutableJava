package de.julian.baehr.immutable.models.expressions.primaries;

public class MPrimLiteral extends MPrimary {

	private String literal;
	
	public void setLiteral(String literal) {
		this.literal = literal;
	}
	
	public String toString() {
		return literal;
	}
}
