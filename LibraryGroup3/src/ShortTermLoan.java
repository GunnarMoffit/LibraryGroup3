import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class ShortTermLoan extends Loans{           //Short term Loans
    private LocalDate startDate;
    private LocalDate dueDate;
    public boolean renewed;
    public boolean requested;



    public ShortTermLoan() {                        //Constructor automatically sets up start and end date automatically
        this.setStartDate();
        this.setDueDate();
    }

    private void setStartDate() {                   //Start date used local system clock, can adjust to include time
        LocalDate start = LocalDate.now();
        this.startDate = start;
    }
    
    private void setDueDate() {
        this.dueDate = this.startDate.plusDays(14); //Due date uses start date adding 14 days
    }

    public String getDueDate() {
        String formDue = this.dueDate.format(DateTimeFormatter.ISO_DATE);   //Getter function -- returns date in string in form "yyyy-mm-dd"
        return formDue;
    }

    public String setRenewed() {                        //Renewal Request setter -- returns string of status and pass/fail, can change return value
        String message;
        if (this.requested == true) {
            String formDue = this.dueDate.format(DateTimeFormatter.ISO_DATE);
            message = ("Book has been requested. Due Date is still: " + formDue + "\n");    //If requested, renewal denied with message
        }
        else if ((this.requested == false) && (this.renewed == true)) {
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

    public double calculateFine(double price, LocalDate today) {    //Altered to run without Item, switch arguments after constructors built
        double fee = 0;
        //double price = item.getValue();
        //
        //LocalDate today = LocalDate.now();
        boolean isAfter = today.isAfter(this.dueDate);
        if (isAfter == true) {
            double days = ChronoUnit.DAYS.between(this.dueDate, today); //If current day is after due date, assess fee
            double feePerDay = 0.10;
            fee = days * feePerDay;
        }
        if (fee > price) {                  //If fee is greater than item price, fee = price
            fee = price;
        }
        return fee;                         //Returns fee -- double unformatted
    }
       
}
