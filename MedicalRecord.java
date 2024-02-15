package ensf380assignment3;

import java.util.regex.*;
import java.util.Arrays;

public class MedicalRecord{
    private Location location;
    private String treatmentDetails;
    private String dataOfTreatment;

    public MedicalRecord(Location location, String treatmentDetails, String dateOfTreatment) throws IllegalArgumentException{
        try{
            this.location = location;
            this.treatmentDetails = treatmentDetails;
            this.dataOfTreatment = dateOfTreatment;
        }
        catch(IllegalArgumentException e){
            throw new IllegalArgumentException();
        }
    }
    public void setDataOfTreatment(String dataOfTreatment) {
        this.dataOfTreatment = dataOfTreatment;
    }
    public void setLocation(Location location) {
        this.location = location;
    }
    public void setTreatmentDetails(String treatmentDetails) {
        this.treatmentDetails = treatmentDetails;
    }

    public String getDataOfTreatment() {
        return dataOfTreatment;
    
    }public Location getLocation() {
        return location;
    }
    public String getTreatmentDetails() {
        return treatmentDetails;
    }
}