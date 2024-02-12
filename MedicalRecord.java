import java.util.regex.*;

public class MedicalRecord{
    private Location location;
    private String treatmentDetails;
    private String dataOfTreatment;

    public MedicalRecord(Location location, String treatmentDetails, String dateOfTreatment){
        
        this.location = location;
        this.treatmentDetails = treatmentDetails;
        this.dataOfTreatment = dateOfTreatment;
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