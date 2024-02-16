package ENS380ASSIGNMENT3;
public class ReliefService {

    private Inquirer inquirer;
    private DisasterVictim MissingPerson;
    private String dateOfInquiry;
    private String infoProvided;
    private Location lastKnownLocation;

    //constructor
    public ReliefService(Inquirer inquirer, DisasterVictim MissingPerson, String dateOfInquiry, String InfoProvided, Location LastKnownLocation) throws IllegalArgumentException{
        try{
            this.inquirer = inquirer;
            this.MissingPerson = MissingPerson;
            this.dateOfInquiry = dateOfInquiry;
            this.infoProvided = InfoProvided;
            this.lastKnownLocation = LastKnownLocation;
        }
        catch(IllegalArgumentException e){
            throw new IllegalArgumentException();
        }
    }
    //setters
    public void setInquirer (Inquirer inquirer){
        this.inquirer = inquirer;
    }

    public void setMissingPerson (DisasterVictim MissingPerson){
        this.MissingPerson = MissingPerson;
    }

    public void setDateOfInquiry (String dateOfInquiry){
        //checks that they're either digit or dash
        /*for (int i = 0; i < dateOfInquiry.length(); i++){
            char c = dateOfInquiry.charAt(i);
            if ((c != '-') && (!Character.isDigit(c))){
                throw new IllegalArgumentException("invalid date format " + dateOfInquiry);
            }
        }*/
        //checks proper dash placement
        if (dateOfInquiry.charAt(4) != '-' || dateOfInquiry.charAt(7) != '-')
            throw new IllegalArgumentException("invalid date format " + dateOfInquiry);
        //checks year is digits
        for(int j = 0; j <4; j++) {
<<<<<<< HEAD
        char c = dateOfInquiry.charAt(j);
        if (!Character.isDigit(c))
=======
        if (!Character.isDigit(dateOfInquiry.charAt(j)))
>>>>>>> 4082bf16bcef2e3af3bdf0ec1e94e3a2d4546a17
            throw new IllegalArgumentException("invalid date format " + dateOfInquiry);
        }
        //checks month is digits
        for(int j = 5; j <7; j++) {
            char c = dateOfInquiry.charAt(j);
            if (!Character.isDigit(c))
                throw new IllegalArgumentException("invalid date format or invalid date " + dateOfInquiry);
        }
        //checks day is digits
        for(int j = 8; j < 10; j++) {
            char c = dateOfInquiry.charAt(j);
            if (!Character.isDigit(c))
                throw new IllegalArgumentException("invalid date format or invalid date " + dateOfInquiry);
        }
        //day check
        int a = Character.getNumericValue(dateOfInquiry.charAt(8));
        int b = Character.getNumericValue(dateOfInquiry.charAt(9));
        if (a > 3 || a < 0 || b < 0 || b > 9) {
            throw new IllegalArgumentException("invalid date format or invalid date " + dateOfInquiry);
        }
        if (a == 3 && (b > 1))
            throw new IllegalArgumentException("invalid date format or invalid date " + dateOfInquiry);

        //month check
        int c = Character.getNumericValue(dateOfInquiry.charAt(5));
        int d = Character.getNumericValue(dateOfInquiry.charAt(6));
        if(c < 0 || c >1 || d <0 || d > 2)
            throw new IllegalArgumentException("invalid date format or invalid date " + dateOfInquiry);
        this.dateOfInquiry = dateOfInquiry;
    }

    public void setInfoProvided (String InfoProvided){
        this.infoProvided = InfoProvided;
    }

    public void setLastKnownLocation (Location LastKnownLocation){
        this.lastKnownLocation = LastKnownLocation;
    }
    

    // getters
    Inquirer getInquirer() {return this.inquirer;}

    DisasterVictim getMissingPerson(){return this.MissingPerson;}

    String getDateOfInquiry() {return this.dateOfInquiry;}

    String getInfoProvided() {return this.infoProvided;}

    Location getLastKnownLocation() {return this.lastKnownLocation;}
    
    String getLogDetails() {
        String people = "Inquirer: " + this.inquirer.getFirstName() + ", Missing Person: " + this.MissingPerson.getFirstName();
        String info = ", Date of Inquiry: " + this.dateOfInquiry + ", Info Provided: " + this.infoProvided + ", Last Known Location: " + this.lastKnownLocation.getName();
        String log_detail = people + info;
        return log_detail;
    }

}


