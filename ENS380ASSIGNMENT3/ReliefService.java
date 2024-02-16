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
        //checks year
        for(int j = 0; j <4; j++) {
        if (!Character.isDigit(j))
            throw new IllegalArgumentException("invalid date format " + dateOfInquiry);
        }
        //checks month
        for(int j = 5; j <7; j++) {
            char c = dateOfInquiry.charAt(j);
            if (!Character.isDigit(c) || Character.getNumericValue(c) >12 || Character.getNumericValue(c) <= 0)
                throw new IllegalArgumentException("invalid date format or invalid date " + dateOfInquiry);
        }
        //checks day
        for(int j = 8; j < 10; j++) {
            char c = dateOfInquiry.charAt(j);
            if (!Character.isDigit(c) || Character.getNumericValue(c) >31 || Character.getNumericValue(c) <= 0)
                throw new IllegalArgumentException("invalid date format or invalid date " + dateOfInquiry);
        }
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


