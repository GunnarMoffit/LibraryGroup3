import java.time.LocalDate;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {            //Main set for testing loans

        Library library = new Library();
        User userEx = new User("John", "11517 Flushwing Drive", "979-824-9001", 15);

        library.addUser(userEx);



        //Book bookEx = new Book("Book 1", 9.55f, false);
        //Book book1 = new Book("Book 2", 9.55f, false);
        //Book book2 = new Book("Book 3", 9.55f, false);
        //Book book3 = new Book("Book 4", 9.55f, false);

        AudVid avEx = new AudVid("The Departed", 20f);
        ReferenceBook refBook = new ReferenceBook("Map of USA", 3.85f);
        Magazine mag = new Magazine("Hustler", 19.99f);

        library.addItem(mag);
        library.addItem(avEx);
        library.addItem(refBook);
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


        //String bookName = bookEx.getName();
        //float bookValue = bookEx.getValue();
        //boolean bookLoan = bookEx.isloanable();
        //boolean bookReq = bookEx.isRequested();
        //boolean bookAv = bookEx.isAvailable();
        //boolean bestSel = bookEx.isBestSeller();

        LibraryView libraryview = new LibraryView(library);

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

        //System.out.println("Name: " + bookName);
        //System.out.println("Value: " + bookValue);
        //System.out.println("BookLoan: " + bookLoan);
        //System.out.println("bookReq: " + bookReq);
        //System.out.println("bookAv : " + bookAv);
        //System.out.println("bestSel : " + bestSel);
        //System.out.println("StartDate : " + bookEx.loan.getStartDate());
        //System.out.println("DueDate : " + bookEx.loan.getDueDate());
        //System.out.println("Loaner : " + bookEx.loan.getLoaner());



        library.readBooks();

        for (Book book : library.books) {
            System.out.println("Name: " + book.getName());
            System.out.println("StartDate : " + book.getValue());
            System.out.println("available : " + book.isAvailable());
            System.out.println("bestsell : " + book.isBestSeller());
            System.out.println("renew : " + book.isRenewed());
            System.out.println("Request : " + book.isRequested());
            System.out.println("Request : " + book.isloanable() + "\n");
        }
        //else {
        //System.out.println("Class Name: " + classString + "\n");
        //}

    }

}