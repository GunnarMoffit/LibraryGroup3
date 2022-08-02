package main;

public class ReferenceBook extends Item {


	public ReferenceBook(String a, float b) {
		super(a, b);
		this.loanable = false;
	}
}
