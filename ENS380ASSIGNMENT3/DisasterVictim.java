package edu.ucalgary.oop;

public class DisasterVictim {
	
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private String comments;
	private int ASSIGNED_SOCIAL_ID;
	private MedicalRecord[] medicalRecords;
	private FamilyRelation[] familyRelations;
	private String ENTRY_DATE;
	private Supply[] personalBelongings;
	private String gender;
	private int counter;
	
	
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
	public FamilyRelation[] getFamilyRelations() {
		return familyRelations;
	}
	public void setFamilyRelations(FamilyRelation[] familyRelations) {
		this.familyRelations = familyRelations;
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
	public int getCounter() {
		return counter;
	}
	public void setCounter(int counter) {
		this.counter = counter;
	}
	
}
