
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nicholas
 */
public class VehicleRegistry {
    
    private HashMap<LicensePlate, String> registry;

    public VehicleRegistry() {
        this.registry = new HashMap();
    }
    
    public boolean add(LicensePlate licensePlate, String owner) {
        if (!(this.registry.containsKey(licensePlate))) {
            this.registry.put(licensePlate, owner);
            return true;
        }
        return false;
    } 
    //assigns the owner it received as a parameter to a car that corresponds 
    //to the license plate received as a parameter. If the license plate doesn't have an owner, 
    //the method returns true. If the license already has an owner attached, the method returns false and does nothing.
    public String get(LicensePlate licensePlate) {
        return this.registry.get(licensePlate);
    }
    //returns the owner of the car corresponding to the license plate received as a parameter. 
    //If the car isn't in the registry, the method returns null.
    public boolean remove(LicensePlate licensePlate) {
        if (this.registry.containsKey(licensePlate)) {
            this.registry.remove(licensePlate);
            return true;
        }
        return false;
    }
    //removes the license plate and attached data from the registry. 
    //The method returns true if removed successfully and false if the license plate wasn't in the registry
    
    public void printLicensePlates() {
        for (LicensePlate plate: this.registry.keySet()) {
            System.out.println(plate);
        }
    }//prints the license plates in the registry.
    
    public void printOwners() {
        ArrayList<String> owners = new ArrayList();
        for (String owner: this.registry.values()) {
            if (!(owners.contains(owner))) {
                owners.add(owner);
                System.out.println(owner);
            }
        }
    }
    //prints the owners of the cars in the registry. Each name should only be printed once, 
    //even if a particular person owns more than one car.
    
    
}
