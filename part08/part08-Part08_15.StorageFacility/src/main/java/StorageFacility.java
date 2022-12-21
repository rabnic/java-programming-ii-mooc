
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nicholas
 */
public class StorageFacility {
    
    private HashMap<String, ArrayList<String>> storage;
    
    public StorageFacility() {
        this.storage = new HashMap();
    }
    
    public void add(String unit, String item) {
        // Assign new storage unit if not assigned already
        this.storage.putIfAbsent(unit, new ArrayList());
        
        // Add items to assigned unit
        this.storage.get(unit).add(item);
    }
    //adds the parameter item to the storage unit that is also given as a parameter.
    
    public ArrayList<String> contents(String storageUnit) {
        return this.storage.getOrDefault(storageUnit, new ArrayList());
    }
    //returns a list that contains all the items in the storage unit indicated
    //by the parameter. If there is no such storage unit or it contains no items
    //, the method should return an empty list.
    
    public void remove(String storageUnit, String item) {
        this.storage.get(storageUnit).remove(item);
        
        if (this.storage.get(storageUnit).isEmpty()) {
            this.storage.remove(storageUnit);
        }
    }
    //removes the given item from the given storage unit. NB! Only removes one 
    //item — if there are several items with the same name, the rest still remain. 
    //If the storage unit would be empty after the removal, the method also removes the unit.
    
    public ArrayList<String> storageUnits() {
        return new ArrayList(Arrays.asList(this.storage.keySet().toArray()));
    }
    //returns the names of the storage units as a list. NB! Only the units that contain items are listed.
    
}
