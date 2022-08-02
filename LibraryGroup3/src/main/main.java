package main;
import java.time.LocalDate;
import java.util.ArrayList; 
public class main {

public static void main(String[] args) {            //Main set for testing loans
        
        
        User userEx = new User("John", "11517 Flushwing Drive", "979-824-9001", 100001, 15);
    	String name = userEx.getName();
    	String address = userEx.getAddress();
    	String phoneNumber = userEx.getPhoneNumber();
    	int ID = userEx.getID();
    	int numItemsChecked = userEx.getNumItemsChecked();
    	int age = userEx.getAge();
    	int numItemsRequested = userEx.getNumItemsRequested();
    	double fines = userEx.getFines();
        
    	Library library = new Library();

        System.out.println("");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("phone: " + phoneNumber);
        System.out.println("ID: " + ID);
        System.out.println("numItemsChecked : " + numItemsChecked);
        System.out.println("age: " + age);
        System.out.println("numItemsRequested: " + numItemsRequested);
        System.out.println("fines: " + fines + "\n");
        
        Book bookEx = new Book("The Bible", 9.55f, true);
        AudVid avEx = new AudVid("The Departed", 20f);
        ReferenceBook refBook = new ReferenceBook("Map of USA", 3.85f);
        Magazine mag = new Magazine("Hustler", 19.99f);

        String bookName = bookEx.getName();
    	float bookValue = bookEx.getValue();
    	boolean bookLoan = bookEx.isloanable();
    	boolean bookReq = bookEx.isRequested();
    	boolean bookAv = bookEx.isAvailable();
    	boolean bestSel = bookEx.isBestSeller();

        String avName = avEx.getName();
    	float avValue = avEx.getValue();
    	boolean avLoan = avEx.isloanable();
    	boolean avReq = avEx.isRequested();
    	boolean avAv = avEx.isAvailable();
    	
        String refName = refBook.getName();
    	float refValue = refBook.getValue();
    	boolean refLoan = refBook.isloanable();
    	boolean refReq = refBook.isRequested();
    	boolean refAv = refBook.isAvailable();
    	
        String magName = mag.getName();
    	float magValue = mag.getValue();
    	boolean magLoan = mag.isloanable();
    	boolean magReq = mag.isRequested();
    	boolean magAv = mag.isAvailable();
    	
    	library.addUser(userEx);
    	
    	library.addItem(bookEx);
    	library.addItem(avEx);
    	library.addItem(refBook);
    	library.addItem(mag);
    	
    	
    	userEx.requestItem(mag, library);
    	


    	//else {
    		//System.out.println("Class Name: " + classString + "\n");
    	//}

    }

}
