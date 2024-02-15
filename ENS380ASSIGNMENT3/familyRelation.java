/*have to include the package contianing all classes so disaster victim can be taken as a data type */
package ENS380ASSIGNMENT3;

public class familyRelation {
    private DisasterVictim personOne;
    private String relationshipTo;
    private DisasterVictim personTwo;

    /*constructor */
    public familyRelation (DisasterVictim personOne, String relationshipTo, DisasterVictim personTwo){
        this.personOne = personOne;
        this.relationshipTo = relationshipTo;
        this.personTwo = personTwo;
    }

    /*setters */

    public void setPersonOne (DisasterVictim personOne){
        this.personOne = personOne;
    }

    public void setRelationshipTo (String relationshipTo){
        this.relationshipTo = relationshipTo;
    }

    public void setPersonTwo (DisasterVictim personTwo){
        this.personTwo = personTwo;
    }

    
     /* Getters */
    public DisasterVictim getPersonOne() {
        return personOne;
    }

    public String getRelationshipTo() {
        return relationshipTo;
    }

    public DisasterVictim getPersonTwo() {
        return personTwo;
    }

    
}