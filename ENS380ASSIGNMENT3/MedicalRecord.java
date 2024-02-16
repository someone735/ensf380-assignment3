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
        String[] check = dateOfTreatment.split("-");
        if (dateOfTreatment.length() != check[0].length()){
            for (int i = 0; i < check.length; i++){
                for (int j = 0; i < check[i].length(); i++){
                    char c = check[i].charAt(j);
                    System.err.println();
                    if ((Character.isDigit(c)) == false){
                        throw new IllegalArgumentException("invalid date format" + dateOfTreatment);
                    }
                }
            }
            this.dateOfTreatment = dateOfTreatment;
        } else {
            throw new IllegalArgumentException();
        }
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

void 