package main;

public class Item {
	
	
	//name of item
	private String name;
	
	//value of the item 
	private float valueOfItem;
	
	//qualifier if the item is loanable
	//default is set at 1, unless item is a magazine or reference book
	private boolean loanable;
	
	//boolean to determine whether the item is restricted to staff only
	//default is 0
	private boolean restricted;
	
	//boolean to determine whether the item is available
	//default is 1
	private boolean available;
	
	
	//Base Constructor
	public Item() {
		name = "";
		valueOfItem = 0;
		loanable = true;
		restricted = false;
		available = true;
	}
	
	public Item(String a,float b, boolean c, boolean d){
			name = a;
			valueOfItem = b;
			loanable = c;
			restricted = d;
			
		}
	
	
	
	
	
	
	//getters for
	public String getName() {
		return name;
	};
	
	public float getValue() {
		return valueOfItem;
	};
	
	public boolean isloanable() {
		return loanable;
	};
	
	public boolean isRestricted() {
		return restricted;
	};
	
	public boolean isAvailable() {
		return available;
	};
	
}
