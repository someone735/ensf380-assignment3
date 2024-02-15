package ENS380ASSIGNMENT3;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Arrays;
public class Location {
    public static void main(String[] args) {
    }

    //private members
    private String name;
    private String address;
    private DisasterVictim[] occupants;
    private Supply[] supplies;

    //public member functions
    //constructor
    Location(String name, String address) {
        this.name = name;
        this.address = address;
    }
    //getters
    String getName(){ return name;}
    String getAddress() {return address;}
    DisasterVictim[] getOccupants() {return occupants;}
    Supply[] getSupplies() {return supplies;}
    //setters
    void setName(String name) {this.name = name;}
    void setAddress(String address) {this.address = address;}
    void setOccupants(DisasterVictim[] occupants) {this.occupants = occupants.clone();}
    void setSupplies(Supply[] supplies) {this.supplies = supplies.clone();}
    //adders
    void addOccupant(DisasterVictim occupant) {
        DisasterVictim[] temp = new DisasterVictim[this.occupants.length + 1];
        for (int i = 0; i < this.occupants.length; i++) {
            temp[i] = this.occupants[i];
        }
        temp[this.occupants.length] = occupant;
        this.occupants = temp;
    }
    void addSupply(Supply supply) {
        Supply[] temp = new Supply[this.supplies.length + 1];
        for (int i = 0; i < this.supplies.length; i++) {
            temp[i] = this.supplies[i];
        }
        temp[this.supplies.length] = supply;
        this.supplies = temp;
    }
    //removers
    void removeOccupant(DisasterVictim occupant) {
        DisasterVictim[] temp = new DisasterVictim[this.occupants.length - 1]; //added new ...
        for (int i = 0; i < this.occupants.length; i++) {
            if (this.occupants[i] != occupant ){
                temp[i] = this.occupants[i];
            }
        }
        this.occupants = temp;
    }
    void removeSupply(Supply supply) {
        Supply[] temp = new Supply[this.supplies.length - 1]; //added new ...
        for (int i = 0; i < this.supplies.length; i++) {
            if (this.supplies[i] != supply ){
                temp[i] = this.supplies[i];
            }
        }
        this.supplies = temp;
    }
}
