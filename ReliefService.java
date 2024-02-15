public class ReliefService {

    private Inquirer inquirer;
    private DisasterVictim MissingPerson;
    private String dateOfInquirery;
    private String InfoProvided;
    private Location LastKnownLocation;

    //constructors
    public ReliefService (Inquirer inquirer, DisasterVictim MissingPerson, String dateOfInquirery, String InfroProvided, Location LastKnownLocation){
        this.inquirer = inquirer;
        this.MissingPerson = MissingPerson;
        this.dateOfInquirery = dateOfInquirery;
        this.InfoProvided = Infoprovided;
        this.LastKnownLocation = LastKnownLocation;
    }
    //setters
    public void setinquirer (Inquirer inquirer){
        this.inquirer = inquirer;
    }

    public void setMissingPerson (DisasterVictim MissingPerson){
        this.MissingPerson = MissingPerson;
    }

    public void setdateOfInquirery (String dateOfInquirery){
        this.dateOfInquirery = dateOfInquirery;
    }

    public void setInfoProvided (String InfoProvided){
        this.InfoProvided = InfoProvided;
    }

    public void setLastKnownLocation (Location LastKnownLocation){
        this.LastKnownLocation = LastKnownLocation;
    }
    

    // getters
    Inquirer getInquirer() {return inquirer;}

    DisasterVictim getMissingPerson(){return missingPerson;}

    String getDateOfInquiry() {return datOfInquiry;}

    String getInfoProvided() {return infoProvided;}

    Location getLastKnowLocation() {return lastKnownLocation;}
    
    String getLogDetails() {
    people = "\nInquirer: " + inquirer.getFirstName() + inquirer.getLastName + "\nMissing Person: " + missingPerson.getFirstName() + missingPerson.getLastName;
    info = "\n Date of Inquiry: " + dateOfInquiry + "\nInfo Provided: " + infoProvided + "\nLast Known Location: " +lastKnownLocation.getName();
    log_detail = "Log Details :\n" + people + info;
    return log_details; }
}
