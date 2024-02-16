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

    public void setdateOfInquiry (String dateOfInquirery){
        this.dateOfInquiry = dateOfInquirery;
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
        String people = "\nInquirer: " + this.inquirer.getFirstName() + this.inquirer.getLastName() + "\nMissing Person: " + this.MissingPerson.getFirstName() + this.MissingPerson.getLastName();
        String info = "\n Date of Inquiry: " + this.dateOfInquiry + "\nInfo Provided: " + this.infoProvided + "\nLast Known Location: " + this.lastKnownLocation.getName();
        String log_detail = "Log Details :\n" + people + info;
        return log_detail; 
}
}


