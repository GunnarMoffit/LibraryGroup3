package main;

import java.time.*;
import java.time.format.DateTimeFormatter;


public class ShortTermLoan extends Loans{           //Short term Loans



    public ShortTermLoan(User user, Item item) {                     //Constructor automatically sets up start and end date automatically
        super(user, item);
        this.setDueDate();
    }

    
    @Override public String setDueDate() {                 //Due date uses start date adding 21 days
    	String message = "Book is due in 14 days";
        this.dueDate = this.startDate.plusDays(14);
        return message;
    }


    public String setRenewed(Item item) {                        //Renewal Request setter -- returns string of status and pass/fail, can change return value
        String message;
        if (item.isRequested() == true) {
            String formDue = this.dueDate.format(DateTimeFormatter.ISO_DATE);
            message = ("Book has been requested. Due Date is still: " + formDue + "\n");    //If requested, renewal denied with message
        }
        else if (this.renewed == true) {
            String formDue = this.dueDate.format(DateTimeFormatter.ISO_DATE);
            message = ("Book has already been renewed. Due Date is still: " + formDue + "\n");  //If renewed already, renewal denied with message
        }
        else {                              //If not requested or renewed - Add 14 days 
            LocalDate ren = this.dueDate;
            ren = ren.plusDays(14);
            this.dueDate = ren;
            this.renewed = true;
            String formDue = this.dueDate.format(DateTimeFormatter.ISO_DATE);
            message = ("Book is renewed. New Due Date is: " + formDue + "\n");
        }
        return message;
    }
     
}
