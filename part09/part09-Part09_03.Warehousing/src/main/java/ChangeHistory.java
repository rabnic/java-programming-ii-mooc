
import java.util.ArrayList;
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
public class ChangeHistory {
    
    private ArrayList<Double> history;
    
    public ChangeHistory() {
        this.history = new ArrayList();
    }
    //creates an empty ChangeHistory object.
    
    public void add(double status) {
        this.history.add(status);
    } 
    //adds provided status as the latest amount to remember in the change history.
    
    public void clear() {
        this.history.clear();
    } 
    //empties the history.
    
    @Override
    public String toString() {
        return this.history.toString();
    } 
    // The string representation provided by the ArrayList class is sufficient.
    
    public double maxValue() {
        
        if (this.history.isEmpty()) {
            return 0.0;
        }
        
        double maxValue = this.history.get(0);
        for (Double value: this.history) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        
        return maxValue;
        
    } 
    //returns the largest value in the change history. 
    //If the history is empty, the method should return zero.

    public double minValue() {
        
        if (this.history.isEmpty()) {
            return 0.0;
        }
        
        double minValue = this.history.get(0);
        for (double value: this.history) {
            if (value < minValue) {
                minValue = value;
            }
        }
        return minValue;
    } 
    //returns the smallest value in the change history. 
    //If the history is empty, the method should return zero.

    public double average() {
        if (this.history.isEmpty()) {
            return 0.0;
        }
        double totalAmountChangeHistory = 0;
        for (Double value: this.history) {
            totalAmountChangeHistory += value;
        }
        
        return totalAmountChangeHistory / this.history.size();
        
    } 
    //returns the average of the values in the change history. 
    //If the history is empty, the method should return zero.
    
}
