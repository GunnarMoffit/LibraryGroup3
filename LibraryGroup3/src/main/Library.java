package main;

import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    //need method to return item specific fines, getFine()
    //need method to return item specific due date, getDueDate()

    //List of Item objects, can be book, magazine, etc..
    public ArrayList<Item> items;
    //List of User objects, has name, address, etc..
    public ArrayList<User> users;

    //Generic Constructor
    public Library() {
        this.users = new ArrayList<>();
        this.items = new ArrayList<>();
    }

    public void addUser(User x){
        users.add(x);
    }

    public void addItem(Item x){
        items.add(x);
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

    public void getUserCheckedOutItems(int libraryCardNum){
        User tempUser;
        int tempID;
        Item tempItem;
        String tempName;
        for(int x = 0; x < users.size(); x++) {
            tempUser = users.get(x);
            tempID = tempUser.getID();
            if(tempID == libraryCardNum){
                System.out.println("User: " + tempUser.getName() + "\n" + "Items checked out: ");
                for(int i = 0; i < tempUser.getItemsCheckedOut().size(); i++) {
                    tempItem = items.get(i);
                    tempName = tempItem.getName();
                    System.out.println(tempName + "\n");
                }
            }
        }
    }

    public void getUserItemsDueDates(int libraryCardNum){
        User tempUser;
        int tempID;
        Item tempItem;
        String tempName;
        for(int x = 0; x < users.size(); x++) {
            tempUser = users.get(x);
            tempID = tempUser.getID();
            if(tempID == libraryCardNum){
                System.out.println("User: " + tempUser.getName() + "\n" + "Items with due dates: ");
                for(int i = 0; i < tempUser.getItemsCheckedOut().size(); i++) {
                    tempItem = items.get(i);
                    tempName = tempItem.getName();
                    //getDueDate() isn't real
                    //System.out.println(tempName + ": " + tempItem.getDueDate() + "\n");
                }
            }
        }
    }

    public void getUserFines(int libraryCardNum){
        User tempUser;
        int tempID;
        Item tempItem;
        String tempName;
        for(int x = 0; x < users.size(); x++) {
            tempUser = users.get(x);
            tempID = tempUser.getID();
            if(tempID == libraryCardNum){
                System.out.println("User: " + tempUser.getName() + "\n" + "Items with fines: ");
                for(int i = 0; i < tempUser.getItemsCheckedOut().size(); i++) {
                    tempItem = items.get(i);
                    tempName = tempItem.getName();
                    //getFine() isn't real
                    //System.out.println(tempName + ": " + tempItem.getFine() + "\n");
                }
            }
        }
    }

}