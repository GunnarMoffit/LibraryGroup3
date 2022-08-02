package main;

import java.util.ArrayList;

public class Library {

    //need method to return user specific checked out items "User.getItems()"
    //need method to return item specific fines, Item.getFine()
    //need method to return item specific due date, Item.getDueDate()
    //need user constructor method in user class
	public ArrayList<Item> items;
	public ArrayList<User> users;
	private int userID = 10001;
    //Map containing Library Card #'s as keys, and User objects as values
    //HashMap<Integer, User> usersMap = new HashMap<>();
    //
    //Map containing Item names as keys, and Item objects as values
    //HashMap<String, Item> itemMap = new HashMap<>();
    public Library() {                    //Generic Constructor
        this.users = new ArrayList<>();
        this.items = new ArrayList<>();
    }
    //List of Item objects, can be book, magazine, etc..


    //List of User objects, has name, address, etc..
    

    public void addUser(User x){
        x.setID(userID);
    	users.add(x);
        userID++;
    }

    public void addItem(Item y){


        items.add(y);
    }

    public ArrayList<User> getUserList(){
        return users;
    }

    public ArrayList<Item> getItemList(){
        return items;
    }

    public void getUserInfo(int libraryCardNum){
    	User tempUser;
    	int tempID;
    	boolean flag = false;
        for(int x = 0; x < users.size(); x++) {
        	tempUser = users.get(x);
        	tempID = tempUser.getID();
            if(tempID == libraryCardNum){
                System.out.println("User found.\n");
                System.out.println("Name: ");
                System.out.println(tempUser.getName() + "\n");
                System.out.println("Address: ");
                System.out.println(tempUser.getAddress() + "\n");
                System.out.println("Phone Number: ");
                System.out.println(tempUser.getPhoneNumber() + "\n");
                System.out.println("Library Card Number: ");
                System.out.println(libraryCardNum + "\n");
                flag = true;
            }
        }
        if (flag != true) {
                System.out.println("User not found. Please enter a valid ID.");
        }
    }

    public void getItemInfo(String name){
    	Item tempItem;
    	String tempName;
    	boolean flag = false;
        for(int x = 0; x < items.size(); x++) {
        	tempItem = items.get(x);
        	tempName = tempItem.getName();
            if(tempName == name){
                System.out.println("Item found.\n");
                System.out.println("Name: ");
                System.out.println(tempItem.getName() + "\n");
                System.out.println("Value: ");
                System.out.println(tempItem.getValue() + "\n");
                System.out.println("Loanability: ");
                System.out.println(tempItem.isloanable() + "\n");
                System.out.println("Availability: ");
                System.out.println(tempItem.isAvailable() + "\n");
                flag = true;
            }
        }
        if (flag != true) {
                System.out.println("Item not found. Please enter a valid item name.");
        }
    }



}