package main;

public class Book extends Item {


	private boolean bestSeller;
	private boolean renewed;
	
	public Book(String a, float b, boolean c) {
		super(a, b);
		this.loanable = true;
		this.bestSeller = c;
		this.renewed = false;
		
	}

	public boolean isBestSeller() {
		return this.bestSeller;
	}

	public boolean isRenewed() {
		return renewed;
	}

	public void setRenewed(boolean renewed) {
		this.renewed = renewed;
	};
	
}
