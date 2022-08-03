package main;
import java.time.LocalDate;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class main {

public static void main(String[] args) {            //Main set for testing loans
        
		Library library = new Library();
		
        //User user1 = new User("John", "11517 Flushwing Drive", "979-824-9001", 15);
        //User user2 = new User("Annabel", "202 Mesquite Street", "979-841-1001", 8);
        //User user3 = new User("Tom", "911 Hospital Lane", "999-954-1122", 98);
        //User user4 = new User("Stacy", "11152 South Oak Valley Lane", "555-852-1325", 40);
        //User user5 = new User("Rodrigo", "11517 Flushwing Drive", "979-824-9001", 15);
       
        //library.addUser(user1);
        //library.addUser(user2);
        //library.addUser(user3);
        //library.addUser(user4);
        //library.addUser(user5);
        
        
        //Book bookEx = new Book("Book 1", 9.55f, false);
        //Book book1 = new Book("Book 2", 9.55f, false);
        //Book book2 = new Book("Book 3", 9.55f, false);
        //Book book3 = new Book("Book 4", 9.55f, false);
        
        //AudVid avEx = new AudVid("1", 20f);
		//AudVid av1 = new AudVid("2", 20f);
		//AudVid av2 = new AudVid("3", 20f);
		//AudVid av3 = new AudVid("4", 20f);
		//AudVid av4 = new AudVid("5", 20f);
		
		
		
        //library.addAudVid(avEx);
        //library.addAudVid(av1);
        //library.addAudVid(av2);
        //library.addAudVid(av3);
        //library.addAudVid(av4);
        //ReferenceBook refBook = new ReferenceBook("Map of USA", 3.85f);
        //Magazine mag = new Magazine("Hustler", 19.99f);
        
        //library.addItem(mag);
        //library.addItem(avEx);
        //library.addItem(refBook);
        //library.addBook(bookEx);
        //library.addBook(book1);
        //library.addBook(book2);
        //library.addBook(book3);
        
    	//userEx.requestItem(bookEx);
        //userEx.checkInItem(bookEx);
        //userEx.requestItem(book1);
        //userEx.checkInItem(book1);
        //userEx.requestItem(book2);
        //userEx.checkInItem(book2);
        //userEx.requestItem(book3);
        //userEx.checkInItem(book3);
        LibraryView libraryview = new LibraryView(library);    //  
        
        //String bookName = bookEx.getName();
    	//float bookValue = bookEx.getValue();
    	//boolean bookLoan = bookEx.isloanable();
    	//boolean bookReq = bookEx.isRequested();
    	//boolean bookAv = bookEx.isAvailable();
    	//boolean bestSel = bookEx.isBestSeller();
    	

        //String avName = avEx.getName();
    	//float avValue = avEx.getValue();
    	//boolean avLoan = avEx.isloanable();
    	//boolean avReq = avEx.isRequested();
    	//boolean avAv = avEx.isAvailable();
    	
        //String refName = refBook.getName();
    	//float refValue = refBook.getValue();
    	//boolean refLoan = refBook.isloanable();
    	//boolean refReq = refBook.isRequested();
    	//boolean refAv = refBook.isAvailable();
    	
        //String magName = mag.getName();
    	//float magValue = mag.getValue();
    	//boolean magLoan = mag.isloanable();
    	//boolean magReq = mag.isRequested();
    	//boolean magAv = mag.isAvailable();
    	
    	//String name = userEx.getName();
    	//String address = userEx.getAddress();
    	//String phoneNumber = userEx.getPhoneNumber();
    	//int numItemsChecked = userEx.getNumItemsChecked();
    	//int age = userEx.getAge();
    	//int numItemsRequested = userEx.getNumItemsRequested();
    	//double fines = userEx.getFines();
    	//int ID = userEx.getID();
        //System.out.println("");
        //System.out.println("Name: " + name);
        //System.out.println("Address: " + address);
        //System.out.println("phone: " + phoneNumber);
        //System.out.println("ID: " + ID);
        //System.out.println("numItemsChecked : " + numItemsChecked);
        //System.out.println("age: " + age);
        //System.out.println("numItemsRequested: " + numItemsRequested);
        //System.out.println("fines: " + fines + "\n");
        
        //System.out.println("Name: " + bookName);
        //System.out.println("Value: " + bookValue);
        //System.out.println("BookLoan: " + bookLoan);
        //System.out.println("bookReq: " + bookReq);
        //System.out.println("bookAv : " + bookAv);
        //System.out.println("bestSel : " + bestSel);
        //System.out.println("StartDate : " + bookEx.loan.getStartDate());
        //System.out.println("DueDate : " + bookEx.loan.getDueDate());
        //System.out.println("Loaner : " + bookEx.loan.getLoaner());
        
        
        
        library.readAudVid();
        
        for (AudVid av : library.audvids) {
            System.out.println(av.getName() + "\n");
        }
    	//else {
    		//System.out.println("Class Name: " + classString + "\n");
    	//}

    }

}
