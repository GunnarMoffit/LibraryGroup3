package main;


public class main {

public static void main(String[] args) {            //Main set for testing loans
        
		Library library = new Library();
		
        User userEx = new User("John", "11517 Flushwing Drive", "979-824-9001", 15);
       
        library.addUser(userEx);
        
        
        Book bookEx = new Book("The Bible", 9.55f, false);
        AudVid avEx = new AudVid("The Departed", 20f);
        ReferenceBook refBook = new ReferenceBook("Map of USA", 3.85f);
        Magazine mag = new Magazine("Hustler", 19.99f);
        
        library.addItem(mag);
        library.addItem(avEx);
        library.addItem(refBook);
        library.addItem(bookEx);
        
    	userEx.requestItem(bookEx);
    	userEx.requestItem(mag);
        //userEx.checkInItem(bookEx);
        
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
    	
    	String name = userEx.getName();
    	String address = userEx.getAddress();
    	String phoneNumber = userEx.getPhoneNumber();
    	int numItemsChecked = userEx.getNumItemsChecked();
    	int age = userEx.getAge();
    	int numItemsRequested = userEx.getNumItemsRequested();
    	double fines = userEx.getFines();
    	int ID = userEx.getID();
        System.out.println("");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("phone: " + phoneNumber);
        System.out.println("ID: " + ID);
        System.out.println("numItemsChecked : " + numItemsChecked);
        System.out.println("age: " + age);
        System.out.println("numItemsRequested: " + numItemsRequested);
        System.out.println("fines: " + fines + "\n");
        
        System.out.println("Name: " + bookName);
        System.out.println("Value: " + bookValue);
        System.out.println("BookLoan: " + bookLoan);
        System.out.println("bookReq: " + bookReq);
        System.out.println("bookAv : " + bookAv);
        System.out.println("bestSel : " + bestSel);
        System.out.println("StartDate : " + bookEx.loan.getStartDate());
        System.out.println("DueDate : " + bookEx.loan.getDueDate());
        System.out.println("Loaner : " + bookEx.loan.getLoaner());
        

    	//else {
    		//System.out.println("Class Name: " + classString + "\n");
    	//}

    }

}
