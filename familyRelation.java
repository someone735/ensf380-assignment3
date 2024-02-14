/*have to include the package contianing all classes so disaster victim can be taken as a data type */
package ensf380_assignment3;

public class familyRelation {
    private DisasterVictim personOne;
    private String relationshipTo;
    private DisasterVictim personTwo;

    /*constructor */
    public familyRelation (DisasterVictim personOne, String relationshipTo, DisasterVcitim personTwo){
        this.personOne = personOne;
        this.relationshipTo = relationshipTo;
        this.personTwo = personTwo;
    }

    /*setters */

    public void setPersonOne (DisasterVcitim personOne){
        this.personOne = personOne;
    }

    public void setRelationshipTo (String relationshipTo){
        this.relationshipTo = relationshipTo;
    }

    public void setPersonTwo (DisasterVcitim person){
        this.personTwo = personTwo;
    }

    
     /* Getters */
    public DisasterVictim getpersonOne() {
        return personOne;
    }

    public String getrelationshipTo() {
        return relationshipTo;
    }

    public DisasterVictim getpersonTwo() {
        return personTwo;
    }

    
}