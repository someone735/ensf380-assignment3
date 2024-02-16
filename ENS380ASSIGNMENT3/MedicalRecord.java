package ENS380ASSIGNMENT3;

import java.util.regex.*;
import java.util.Arrays;



import java.lang.Character;

public class MedicalRecord{
    private Location location;
    private String treatmentDetails;
    private String dateOfTreatment;

    public MedicalRecord(Location location, String treatmentDetails, String dateOfTreatment) throws IllegalArgumentException{
            this.location = location;
            this.treatmentDetails = treatmentDetails;
            this.dateOfTreatment = dateOfTreatment;
    }
    public void setDateOfTreatment(String dateOfTreatment) throws IllegalArgumentException{
        for (int i = 0; i < dateOfTreatment.length(); i++){
            char c = dateOfTreatment.charAt(i);
            if ((c != '-') && (!Character.isDigit(c))){
                throw new IllegalArgumentException("invalid date format " + dateOfTreatment);
            }
        }
        this.dateOfTreatment = dateOfTreatment;
    }
    public void setLocation(Location location) throws IllegalArgumentException{
        this.location = location;
    }
    public void setTreatmentDetails(String treatmentDetails) throws IllegalArgumentException{
        this.treatmentDetails = treatmentDetails;
    }

    public String getDataOfTreatment() {
        return this.dateOfTreatment;
    
    }public Location getLocation() {
        return this.location;
    }
    public String getTreatmentDetails() {
        return this.treatmentDetails;
    }
}
