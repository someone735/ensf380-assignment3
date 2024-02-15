package ENS380ASSIGNMENT3;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Arrays;

import java.util.ArrayList;
public class Location {
    public static void main(String[] args) {
    }

    //private members
    private String name;
    private String address;
    private ArrayList<DisasterVictim> occupants;
    private ArrayList<Supply> supplies;

    //public member functions
    //constructor
    Location(String name, String address) {
        this.name = name;
        this.address = address;
    }
    //getters
    String getName(){ return name;}
    String getAddress() {return address;}
    ArrayList<DisasterVictim> getOccupants() {return occupants;}
    ArrayList<Supply> getSupplies() {return supplies;}
    //setters
    void setName(String name) {this.name = name;}
    void setAddress(String address) {this.address = address;}
    void setOccupants(DisasterVictim[] occupants) {this.occupants = occupants.clone();}
    void setSupplies(Supply[] supplies) {this.supplies = supplies.clone();}
    //adders
    void addOccupant(DisasterVictim occupant) {
        this.occupants.add(occupant);
    }
    void addSupply(Supply supply) {
        this.supplies.add(supply);
    }
    //removers
    void removeOccupant(DisasterVictim occupant) {
        for (int i = 0; i < this.occupants.size(); i++) {
            if (this.occupants.get(i) == occupant) {
                occupants.remove(i);
            }
        }
    }
    void removeSupply(Supply supply) {
        for (int i = 0; i < this.supplies.size(); i++) {
            if (this.supplies.get(i) == supply) {
                supplies.remove(i);
            }
        }
    }
}
