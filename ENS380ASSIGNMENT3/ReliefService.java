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
    public void setinquirer (Inquirer inquirer){
        this.inquirer = inquirer;
    }

    public void setMissingPerson (DisasterVictim MissingPerson){
        this.MissingPerson = MissingPerson;
    }

    public void setdateOfInquiry (String dateOfInquiry){
        for (int i = 0; i < dateOfInquiry.length(); i++){
            char c = dateOfInquiry.charAt(i);
            if ((c != '-') && (!Character.isDigit(c))){
                throw new IllegalArgumentException("invalid date format " + dateOfInquiry);
            }
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


