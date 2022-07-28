import java.time.*;
import java.time.format.DateTimeFormatter;


public class Loans {                    //SuperClass for loans
    
    private LocalDate startDate;
    public boolean renewed;
    public boolean requested;



    public Loans() {                    //Generic Constructor
        this.setStartDate();
    }

    private void setStartDate() {           //Sets start Date to local system clock. Can adjust to include time if needed
        LocalDate start = LocalDate.now();
        this.startDate = start;
    }

    public String getStartDate() {
        String formStart = this.startDate.format(DateTimeFormatter.ISO_DATE);       // Getter function, returns string in form "yyyy-mm-dd", can adjust
        return formStart;
    }


    public boolean isRenewed() {        // Return boolean if renewed
        return renewed;
    }

    
    public void setRequested(boolean setting) {     //Set Requested by library
        this.requested = setting;
    } 
}
