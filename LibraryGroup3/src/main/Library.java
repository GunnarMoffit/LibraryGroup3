package main;

import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    //need method to return user specific checked out items "User.getItems()"
    //need method to return item specific fines, Item.getFine()
    //need method to return item specific due date, Item.getDueDate()
    //need user constructor method in user class

    //Map containing Library Card #'s as keys, and User objects as values
    //HashMap<Integer, User> usersMap = new HashMap<>();
    //
    //Map containing Item names as keys, and Item objects as values
    //HashMap<String, Item> itemMap = new HashMap<>();

    //List of Item objects, can be book, magazine, etc..
    ArrayList<Item> items = new ArrayList<Item>();

    //List of User objects, has name, address, etc..
    ArrayList<User> users = new ArrayList<User>();

    public void addUser(String name, String address, int phonenumber, int libraryCardID){

        User newUser = new User(name, address, phonenumber, libraryCardID);

        users.add(newUser);

    }

    public void addItem(String name, float value, boolean loanable, boolean restricted, boolean available){

        Item newItem = new Item(name, value, loanable, restricted, available);

        items.add(newItem);
    }

    public ArrayList<User> getUserList(){
        return users;
    }

    public ArrayList<Item> getItemList(){
        return items;
    }

    public void getUserInfo(int libraryCardNum){
        for(User : users) {
            if(User.getCardNumber() == libraryCardNum){
                System.out.println("User found.\n");
                System.out.println("Name: ");
                System.out.println(User.getName() + "\n");
                System.out.println("Address: ");
                System.out.println(User.getAddress() + "\n");
                System.out.println("Phone Number: ");
                System.out.println(User.getPhoneNumber() + "\n");
                System.out.println("Library Card Number: ");
                System.out.println(libraryCardNum + "\n");
            }
            else {
                System.out.println("User not found. Please enter a valid library card number.");
            }
        }
    }

    public void getItemInfo(String name){
        for(Item : items) {
            if(Item.getName() == name){
                System.out.println("Item found.\n");
                System.out.println("Name: ");
                System.out.println(Item.getName() + "\n");
                System.out.println("Value: ");
                System.out.println(Item.getValue() + "\n");
                System.out.println("Loanability: ");
                System.out.println(Item.isLoanable() + "\n");
                System.out.println("Restriction: ");
                System.out.println(Item.isRestricted() + "\n");
                System.out.println("Availability: ");
                System.out.println(Item.isAvailable() + "\n");
            }
            else {
                System.out.println("Item not found. Please enter a valid item name.");
            }
        }
    }

    public void getUserCheckedOutItems(int libraryCardNum){
        for(User : users) {
            if(User.getCardNumber() == libraryCardNum){
                System.out.println("User: " + User.getName() + "\n" + "Items checked out: ");
                for(Item : User.getItems()) {
                    System.out.println(Item.getName() + "\n");
                }
            }
        }
    }

    public void getUserItemsDueDates(int libraryCardNum){
        for(User : users) {
            if(User.getCardNumber() == libraryCardNum){
                System.out.println("User: " + User.getName() + "\n" + "Items with due date: ");
                for(Item : User.getItems()) {
                    System.out.println(Item.getName() + ": " + Item.getDueDate() + "\n");
                }
            }
        }
    }

    public void getUserFines(int libraryCardNum){
        for(User : users) {
            if(User.getCardNumber() == libraryCardNum){
                System.out.println("User: " + User.getName() + "\n" + "Item fines: ");
                for(Item : User.getItems()) {
                    System.out.println(Item.getName() + ": " + Item.getFine() + "\n");
                }
            }
        }
    }

}