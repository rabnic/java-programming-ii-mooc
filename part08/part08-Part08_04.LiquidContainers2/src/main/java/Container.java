/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nicholas
 */
public class Container {
    
    private int amount;
    private static final int MAX = 100;
    private static final int MIN = 0;
    
    public Container() {
        this.amount = MIN;
    }
    
    public void add(int amountToAdd) {
        if (amountToAdd > MIN) {
            this.amount += amountToAdd;
            if (this.amount > MAX) {
                this.amount = MAX;
            }
        }
    }
    
    public void remove(int amountToRemove) {
        if (amountToRemove > MIN) {
            this.amount -= amountToRemove;
            if (this.amount < MIN) {
                this.amount = MIN;
            }
        }
    }
    
    public int contains() {
        return this.amount;
    }
    
    public String toString() {
        return this.amount + "/100";
    }
    
}
