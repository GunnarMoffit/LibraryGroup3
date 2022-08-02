package main;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class Loans {                    //SuperClass for loans
    
    protected LocalDate startDate;
    protected LocalDate dueDate;
    protected boolean renewed;
    protected String loaner;



    public Loans(User user, Item item) {                    //Generic Constructor
        this.setStartDate();
        this.loaner = user.getName();
        this.renewed = false;
    }

    public void setStartDate() {           //Sets start Date to local system clock. Can adjust to include time if needed
        LocalDate start = LocalDate.now();
        this.startDate = start;
    }

    public String getStartDate() {
        String formStart = this.startDate.format(DateTimeFormatter.ISO_DATE);       // Getter function, returns string in form "yyyy-mm-dd", can adjust
        return formStart;
    }
    
    public String setDueDate() {
        String message = "Please Specify Length of loan";
        return message;
    }
    
    public String getDueDate() {                //Getter function -- returns date in string in form "yyyy-mm-dd"
        String formDue = this.dueDate.format(DateTimeFormatter.ISO_DATE);     
        return formDue;
    }


    public boolean isRenewed() {        // Return boolean if renewed
        return renewed;
    }
    
    public String setRenewed(Item item) {
    	String message = "Please Specify Length of loan";
        return message;
    }
    
    public double calculateFine(Item item) {    //Altered to run without Item, switch arguments after constructors built
        double fee = 0;
        LocalDate today = LocalDate.now();
        double price = item.getValue();
        boolean isAfter = today.isAfter(this.dueDate);
        if (isAfter == true) {
            double days = ChronoUnit.DAYS.between(this.dueDate, today); //If current day is after due date, assess fee
            double feePerDay = 0.10;
            fee = days * feePerDay;
        }
        if (fee > price) {                                               //If fee is greater than item price, fee = price
            fee = price;
        }   
        return fee;                                                     //Returns fee -- double unformatted
    }
    
    public void remLoanData(Item item) {
    	this.dueDate = this.startDate;
    	this.renewed = false;
    	this.loaner = "";
    }
    
    public String getLoaner() {
        String loaner = this.loaner;      // Getter function, returns string in form "yyyy-mm-dd", can adjust
        return loaner;
    }
    


    
}
