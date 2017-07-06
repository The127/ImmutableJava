package de.julian.baehr.immutable.models;

public class MFinallyBlock {

	private MBlock block;
	
	public void setBlock(MBlock block) {
		this.block = block;
	}
	
	@Override
	public String toString() {
		return " finally " + block.toString();
	}
}
