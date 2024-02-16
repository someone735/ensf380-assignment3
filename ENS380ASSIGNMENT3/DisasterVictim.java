package ENS380ASSIGNMENT3;
public class DisasterVictim {
    
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String comments;
    private int ASSIGNED_SOCIAL_ID;
    private MedicalRecord[] medicalRecords;
    private FamilyRelation[] familyConnections;
    private String ENTRY_DATE;
    private Supply[] personalBelongings;
    private String gender;
    private static int counter = 0;
    
    // Constructor
    public DisasterVictim(String firstName, String ENTRY_DATE) {
        this.firstName = firstName;
        // added code
        //checks proper dash placement
        if (ENTRY_DATE.charAt(4) != '-' || ENTRY_DATE.charAt(7) != '-')
            throw new IllegalArgumentException("invalid date format " + ENTRY_DATE);
        //checks year is digits
        for(int j = 0; j <4; j++) {
            char c = ENTRY_DATE.charAt(j);
            if (!Character.isDigit(c))
                throw new IllegalArgumentException("invalid date format " + ENTRY_DATE);
        }
        //checks month is digits
        for(int j = 5; j <7; j++) {
            char c = ENTRY_DATE.charAt(j);
            if (!Character.isDigit(c))
                throw new IllegalArgumentException("invalid date format or invalid date " + ENTRY_DATE);
        }
        //checks day is digits
        for(int j = 8; j < 10; j++) {
            char c = ENTRY_DATE.charAt(j);
            if (!Character.isDigit(c))
                throw new IllegalArgumentException("invalid date format or invalid date " + ENTRY_DATE);
        }
        //day check
        int a = Character.getNumericValue(ENTRY_DATE.charAt(8));
        int b = Character.getNumericValue(ENTRY_DATE.charAt(9));
        if (a > 3 || a < 0 || b < 0 || b > 9) {
            throw new IllegalArgumentException("invalid date format or invalid date " + ENTRY_DATE);
        }
        if (a == 3 && (b > 1))
            throw new IllegalArgumentException("invalid date format or invalid date " + ENTRY_DATE);

        //month check
        int c = Character.getNumericValue(ENTRY_DATE.charAt(5));
        int d = Character.getNumericValue(ENTRY_DATE.charAt(6));
        if(c < 0 || c >1 || d <0 || d > 2)
            throw new IllegalArgumentException("invalid date format or invalid date " + ENTRY_DATE);
        this.ENTRY_DATE = ENTRY_DATE;
        // addded code
        this.ASSIGNED_SOCIAL_ID = counter;
        counter++;

    }
    
    // Getter and Setter methods
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) throws IllegalArgumentException {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws IllegalArgumentException {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) throws IllegalArgumentException {
        //checks proper dash placement
        if (dateOfBirth.charAt(4) != '-' || dateOfBirth.charAt(7) != '-')
            throw new IllegalArgumentException("invalid date format " + dateOfBirth);
        //checks year is digits
        for(int j = 0; j <4; j++) {
            char c = dateOfBirth.charAt(j);
            if (!Character.isDigit(c))
                throw new IllegalArgumentException("invalid date format " + dateOfBirth);
        }
        //checks month is digits
        for(int j = 5; j <7; j++) {
            char c = dateOfBirth.charAt(j);
            if (!Character.isDigit(c))
                throw new IllegalArgumentException("invalid date format or invalid date " + dateOfBirth);
        }
        //checks day is digits
        for(int j = 8; j < 10; j++) {
            char c = dateOfBirth.charAt(j);
            if (!Character.isDigit(c))
                throw new IllegalArgumentException("invalid date format or invalid date " + dateOfBirth);
        }
        //day check
        int a = Character.getNumericValue(dateOfBirth.charAt(8));
        int b = Character.getNumericValue(dateOfBirth.charAt(9));
        if (a > 3 || a < 0 || b < 0 || b > 9) {
            throw new IllegalArgumentException("invalid date format or invalid date " + dateOfBirth);
        }
        if (a == 3 && (b > 1))
            throw new IllegalArgumentException("invalid date format or invalid date " + dateOfBirth);

        //month check
        int c = Character.getNumericValue(dateOfBirth.charAt(5));
        int d = Character.getNumericValue(dateOfBirth.charAt(6));
        if(c < 0 || c >1 || d <0 || d > 2)
            throw new IllegalArgumentException("invalid date format or invalid date " + dateOfBirth);
        this.dateOfBirth = dateOfBirth;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) throws IllegalArgumentException {
        this.comments = comments;
    }

    public int getAssignedSocialID() {
        return ASSIGNED_SOCIAL_ID;
    }

    public void setAssignedSocialID(int ASSIGNED_SOCIAL_ID) throws IllegalArgumentException {
        this.ASSIGNED_SOCIAL_ID = ASSIGNED_SOCIAL_ID;
    }

    public MedicalRecord[] getMedicalRecords() {
        return medicalRecords;
    }

    public void setMedicalRecords(MedicalRecord[] medicalRecords) throws IllegalArgumentException {
        this.medicalRecords = medicalRecords;
    }

    public FamilyRelation[] getFamilyConnections() {
        return familyConnections;
    }

    public void setFamilyConnections(FamilyRelation[] familyConnections) throws IllegalArgumentException {
        this.familyConnections = familyConnections;
    }

    public String getEntryDate() {
        return ENTRY_DATE;
    }

    public void setEntryDate(String ENTRY_DATE) throws IllegalArgumentException {
        this.ENTRY_DATE = ENTRY_DATE;
    }

    public Supply[] getPersonalBelongings() {
        return personalBelongings;
    }

    public void setPersonalBelongings(Supply[] personalBelongings) throws IllegalArgumentException {
        this.personalBelongings = personalBelongings;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) throws IllegalArgumentException {
        this.gender = gender;
    }
    
    // Function to add a family connection
    public void addFamilyConnection(FamilyRelation familyConnection) throws IllegalArgumentException {
        
        if (familyConnections == null) {
            familyConnections = new FamilyRelation[1];
            familyConnections[0] = familyConnection;
        } else {
            FamilyRelation[] newFamilyConnections = new FamilyRelation[familyConnections.length + 1];
            System.arraycopy(familyConnections, 0, newFamilyConnections, 0, familyConnections.length);
            newFamilyConnections[familyConnections.length] = familyConnection;
            familyConnections = newFamilyConnections;
        }
    }
    
    // Function to remove a family connection
    public void removeFamilyConnection(FamilyRelation familyConnection) throws IllegalArgumentException {
        
        if (familyConnections != null) {
            for (int i = 0; i < familyConnections.length; i++) {
                if (familyConnections[i].equals(familyConnection)) {
                    removeFamilyConnectionAtIndex(i);
                    break;
                }
            }
        }
    }

    // Helper function to remove a family connection at a specific index
    private void removeFamilyConnectionAtIndex(int index) {
        if (index < 0 || index >= familyConnections.length) {
            return;
        }
        FamilyRelation[] newArray = new FamilyRelation[familyConnections.length - 1];
        for (int i = 0, j = 0; i < familyConnections.length; i++) {
            if (i != index) {
                newArray[j++] = familyConnections[i];
            }
        }
        familyConnections = newArray;
    }
    
    // Function to add a medical record
    public void addMedicalRecord(MedicalRecord medicalRecord) throws IllegalArgumentException {
        
        if (medicalRecords == null) {
            medicalRecords = new MedicalRecord[1];
            medicalRecords[0] = medicalRecord;
        } else {
            MedicalRecord[] newMedicalRecords = new MedicalRecord[medicalRecords.length + 1];
            System.arraycopy(medicalRecords, 0, newMedicalRecords, 0, medicalRecords.length);
            newMedicalRecords[medicalRecords.length] = medicalRecord;
            medicalRecords = newMedicalRecords;
        }
    }
    
    // Function to add a personal belonging
    public void addPersonalBelonging(Supply supply) throws IllegalArgumentException {
        if (supply == null) {
            throw new IllegalArgumentException("Supply cannot be null");
        }
        
        if (personalBelongings == null) {
            personalBelongings = new Supply[1];
            personalBelongings[0] = supply;
        } else {
            Supply[] newPersonalBelongings = new Supply[personalBelongings.length + 1];
            System.arraycopy(personalBelongings, 0, newPersonalBelongings, 0, personalBelongings.length);
            newPersonalBelongings[personalBelongings.length] = supply;
            personalBelongings = newPersonalBelongings;
        }
    }
    
    // Function to remove a personal belonging
    public void removePersonalBelonging(Supply supplyToRemove) throws IllegalArgumentException {
        if (supplyToRemove == null) {
            throw new IllegalArgumentException("Supply to remove cannot be null");
        }
        
        if (personalBelongings != null) {
            for (int i = 0; i < personalBelongings.length; i++) {
                if (personalBelongings[i].equals(supplyToRemove)) {
                    removePersonalBelongingAtIndex(i);
                    break;
                }
            }
        }
    }
    
    // Helper function to remove a personal belonging at a specific index
    private void removePersonalBelongingAtIndex(int index) {
        if (index < 0 || index >= personalBelongings.length) {
            return;
        }
        Supply[] newArray = new Supply[personalBelongings.length - 1];
        for (int i = 0, j = 0; i < personalBelongings.length; i++) {
            if (i != index) {
                newArray[j++] = personalBelongings[i];
            }
        }
        personalBelongings = newArray;
    }
}
