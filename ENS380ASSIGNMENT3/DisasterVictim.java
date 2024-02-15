package edu.ucalgary.oop;

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
	private static int counter;
	
	//constructor 
	public DisasterVictim(String firstName, String ENTRY_DATE) {
		this.firstName = firstName;
		this.ENTRY_DATE = ENTRY_DATE;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public int getAssignedSocialID() {
		return ASSIGNED_SOCIAL_ID;
	}
	public void setAssignedSocialID(int ASSIGNED_SOCIAL_ID) {
		this.ASSIGNED_SOCIAL_ID = ASSIGNED_SOCIAL_ID;
	}
	public MedicalRecord[] getMedicalRecords() {
		return medicalRecords;
	}
	public void setMedicalRecords(MedicalRecord[] medicalRecords) {
		this.medicalRecords = medicalRecords;
	}
	public FamilyRelation[] getFamilyConnections() {
		return familyConnections;
	}
	public void setFamilyConnections(FamilyRelation[] familyConnections) {
		this.familyConnections = familyConnections;
	}
	
	public String getEntryDate() {
		return ENTRY_DATE;
	}
	
	public void setEntryDate(String ENTRY_DATE) {
		this.ENTRY_DATE = ENTRY_DATE;
	}
	
	public Supply[] getPersonalBelongings() {
		return personalBelongings;
	}
	public void setPersonalBelongings(Supply[] personalBelongings) {
		this.personalBelongings = personalBelongings;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void addPersonalBelonging(Supply supply) {
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
	
	
	
}
