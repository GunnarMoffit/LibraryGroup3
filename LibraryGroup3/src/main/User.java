package main;

import java.util.ArrayList;

public class User implements java.io.Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String address;
	private String phoneNumber;
	private int ID;
	private ArrayList<String> ItemsCheckedOut;
	private int age;
	private ArrayList<String> ItemsRequested;
	private double fines;
	
	public User(String name1, String address1, String phoneNumber1, int Age) {
		this.setName(name1);
		this.setAddress(address1);
		this.setPhoneNumber(phoneNumber1);
		this.setAge(Age);	
		this.fines = 0;
		this.ItemsCheckedOut = new ArrayList<>();
		this.ItemsRequested = new ArrayList<>();
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getNumItemsChecked() {
		return this.ItemsCheckedOut.size();
	}


	public int getNumItemsRequested() {
		return this.ItemsRequested.size();
	}
	
	public void addItemChecked(Item item) {
		this.ItemsCheckedOut.add(item.getName());
	}
	
	public void remItemChecked(Item item) {
		this.ItemsCheckedOut.remove(item.getName());
	}
	
	public void addItemRequested(Item item) {
		this.ItemsRequested.add(item.getName());
	}
	
	public void remItemRequested(Item item) {
		this.ItemsRequested.remove(item.getName());
	}


	public double getFines() {
		return fines;
	}
	
	public void addFines(double x) {
		this.fines = this.fines + x;
	}
	
	public void payFines(double x) {
		this.fines = this.fines - x;
	}
	
	public String requestItem(Item item) {
		String message = "Error";
		if (this.age <= 12) {
			if (this.ItemsCheckedOut.size() == 5) {
				message ="Maximum number of Items checked out \n";
			}
		}
		else if (item.isloanable() == false) {
			message = "This item cannot be checked out";
		}
		else if (item.isAvailable() == true){
			item.setLoan(this);
			item.setAvailable(false);
			this.addItemChecked(item);
			this.remItemRequested(item);
			message = "This item is checked out";
		}
		else {
			item.setRequested(false);
			this.addItemRequested(item);
			message = "This item is not avaiable, Item is now Requested";
		}		
		return message;
	}
	
	public String renewItem(Item item) {
		String message = item.loan.setRenewed(item);
		return message;
	}
	
	public String checkInItem(Item item) {
		this.addFines((item.loan.calculateFine(item)));
		item.loan.remLoanData(item);
		this.remItemChecked(item);
		item.setAvailable(true);
		String message = "Item Checkedd in";
		return message;
	}
}