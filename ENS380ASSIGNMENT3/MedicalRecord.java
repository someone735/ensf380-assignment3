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
        //checks proper dash placement
        if (dateOfTreatment.charAt(4) != '-' || dateOfTreatment.charAt(7) != '-' || dateOfTreatment.length() != 10)
            throw new IllegalArgumentException("invalid date format " + dateOfTreatment);
        //checks year is digits
        for(int j = 0; j <4; j++) {
            char c = dateOfTreatment.charAt(j);
            if (!Character.isDigit(c))
                throw new IllegalArgumentException("invalid date format " + dateOfTreatment);
        }
        //checks month is digits
        for(int j = 5; j <7; j++) {
            char c = dateOfTreatment.charAt(j);
            if (!Character.isDigit(c))
                throw new IllegalArgumentException("invalid date format or invalid date " + dateOfTreatment);
        }
        //checks day is digits
        for(int j = 8; j < 10; j++) {
            char c = dateOfTreatment.charAt(j);
            if (!Character.isDigit(c))
                throw new IllegalArgumentException("invalid date format or invalid date " + dateOfTreatment);
        }
        //day check
        int a = Character.getNumericValue(dateOfTreatment.charAt(8));
        int b = Character.getNumericValue(dateOfTreatment.charAt(9));
        if (a > 3 || a < 0 || b < 0 || b > 9) {
            throw new IllegalArgumentException("invalid date format or invalid date " + dateOfTreatment);
        }
        if (a == 3 && (b > 1))
            throw new IllegalArgumentException("invalid date format or invalid date " + dateOfTreatment);

        //month check
        int c = Character.getNumericValue(dateOfTreatment.charAt(5));
        int d = Character.getNumericValue(dateOfTreatment.charAt(6));
        if (c == 1){
            if(d < 0 || d > 2){
                throw new IllegalArgumentException("invalid date format or invalid date " + dateOfTreatment);
            }
        } else if (c==0){
            if(d < 0 || d > 9){
                throw new IllegalArgumentException("invalid date format or invalid date " + dateOfTreatment);
            }
        }
        this.dateOfTreatment = dateOfTreatment;
        }
    public void setDateOfTreatment(String dateOfTreatment) throws IllegalArgumentException{
        //checks proper dash placement
        if (dateOfTreatment.charAt(4) != '-' || dateOfTreatment.charAt(7) != '-' || dateOfTreatment.length() != 10)
            throw new IllegalArgumentException("invalid date format " + dateOfTreatment);
        //checks year is digits
        for(int j = 0; j <4; j++) {
            char c = dateOfTreatment.charAt(j);
            if (!Character.isDigit(c))
                throw new IllegalArgumentException("invalid date format " + dateOfTreatment);
        }
        //checks month is digits
        for(int j = 5; j <7; j++) {
            char c = dateOfTreatment.charAt(j);
            if (!Character.isDigit(c))
                throw new IllegalArgumentException("invalid date format or invalid date " + dateOfTreatment);
        }
        //checks day is digits
        for(int j = 8; j < 10; j++) {
            char c = dateOfTreatment.charAt(j);
            if (!Character.isDigit(c))
                throw new IllegalArgumentException("invalid date format or invalid date " + dateOfTreatment);
        }
        //day check
        int a = Character.getNumericValue(dateOfTreatment.charAt(8));
        int b = Character.getNumericValue(dateOfTreatment.charAt(9));
        if (a > 3 || a < 0 || b < 0 || b > 9) {
            throw new IllegalArgumentException("invalid date format or invalid date " + dateOfTreatment);
        }
        if (a == 3 && (b > 1))
            throw new IllegalArgumentException("invalid date format or invalid date " + dateOfTreatment);

        //month check
        int c = Character.getNumericValue(dateOfTreatment.charAt(5));
        int d = Character.getNumericValue(dateOfTreatment.charAt(6));
        if(c < 0 || c >1 || d <0 || d > 2)
            throw new IllegalArgumentException("invalid date format or invalid date " + dateOfTreatment);
        this.dateOfTreatment = dateOfTreatment;
    }
    public void setLocation(Location location) throws IllegalArgumentException{
        this.location = location;
    }
    public void setTreatmentDetails(String treatmentDetails) throws IllegalArgumentException{
        this.treatmentDetails = treatmentDetails;
    }

    public String getDateOfTreatment() {
        return this.dateOfTreatment;
    
    }public Location getLocation() {
        return this.location;
    }
    public String getTreatmentDetails() {
        return this.treatmentDetails;
    }
}
