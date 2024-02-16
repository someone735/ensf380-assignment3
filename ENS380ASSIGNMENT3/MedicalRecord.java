package ENS380ASSIGNMENT3;

import java.util.regex.*;
import java.util.Arrays;

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
        this.dateOfTreatment = dateOfTreatment;
    }
    public void setLocation(Location location) throws IllegalArgumentException{
        this.location = location;
    }
    public void setTreatmentDetails(String treatmentDetails) throws IllegalArgumentException{
        String[] check = treatmentDetails.split("-");
        if (check[0].length() != treatmentDetails.length()){
            for (int i = 0; i < check.length; i++){
                for (int j = 0; i < check.length; i++){
                    char c = check[i].charAt(j);
                    if (!(Character.isDigit(c))){
                        throw new IllegalArgumentException();
                    }
                }
            }
            this.treatmentDetails = treatmentDetails;
        } else {
            throw new IllegalArgumentException();
        }
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