package main;

public class AudVid extends Item {
	
	
	private boolean renewed;

	public AudVid(String a, float b) {
	super(a, b);
	this.loanable = true;
	this.renewed = false;
	}

	public boolean isRenewed() {
		return renewed;
	}

	public void setRenewed(boolean renewed) {
		this.renewed = renewed;
	}
}

