package main;

import java.util.ArrayList;

public class User {
	
	
	private String name;
	private String address;
	private String phoneNumber;
	private int ID;
	private ArrayList<Item> ItemsCheckedOut;
	private int numItemsChecked;
	private int age;
	private ArrayList<Item> ItemsRequested;
	private int numItemsRequested;
	private double fines;
	
	public User(String name1, String address1, String phoneNumber1, int cardID, int Age) {
		this.setName(name1);
		this.setAddress(address1);
		this.setPhoneNumber(phoneNumber1);
		this.setID(cardID);
		this.setAge(Age);	
		this.numItemsChecked = 0;
		this.numItemsRequested = 0;
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
		return numItemsChecked;
	}


	public int getNumItemsRequested() {
		return numItemsRequested;
	}


	public double getFines() {
		return fines;
	}
	
	public void addFines(double x) {
		this.fines = this.fines + x;
	}
	
	public void payFines(double x) {
		this.fines = this.fines + x;
	}
	
	public void requestItem(Item item, Library library) {

		Book booktemp = new Book("1", 1f, true);
		Class<? extends Item> typeCompare = item.getClass();
		if (this.age <= 12) {
			if (this.ItemsCheckedOut.size() == 5) {
				System.out.println("Maximum number of Items checked out \n");
			}
		}
		else if (item.isloanable() == false) {
			System.out.println("This item cannot be checked out");
		}
		else if (item.isAvailable() == true){
			
		}
	}
}
