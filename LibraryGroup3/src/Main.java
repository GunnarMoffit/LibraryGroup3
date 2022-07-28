
import java.time.LocalDate;     //To create testing date


public class Main {

    public static void main(String[] args) {            //Main set for testing loans
        
        
        ShortTermLoan shortEx = new ShortTermLoan();
        
        String startCheck = shortEx.getStartDate();             //Creates short term loans
        String endCheck = shortEx.getDueDate();                 //Checks for correct start/end dates
        System.out.println("");
        System.out.println("Start Short Initialized: " + startCheck);
        System.out.println("End Short Initialized: " + endCheck + "\n");

        LongTermLoan longEx = new LongTermLoan();               //Creates long term loans
                                                                //Checks for correct start/end dates
        String startLong = longEx.getStartDate();
        String endLong = longEx.getDueDate();
        System.out.println("");
        System.out.println("Start Long Initialized: " + startLong);
        System.out.println("End Long Initialized: " + endLong + "\n");

        
        double bookPrice = 9.50;
        LocalDate testDate = LocalDate.of(2022, 11, 15);    //Item attributes created for testing
        
        System.out.println("Testing date for Fee: " + testDate);                    //Calculate Fee testing
        double shortFee = shortEx.calculateFine(bookPrice, testDate);               
        double longFee = longEx.calculateFine(bookPrice, testDate);

        System.out.println("Short Fee: " + shortFee);
        System.out.println("Long Fee: " + longFee + "\n");
    }
}
