/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nicholas
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {
    
    private ChangeHistory changeHistory;
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.changeHistory = new ChangeHistory();
        this.addToWarehouse(initialBalance);
    
    } 
    
    public String history() {
        return this.changeHistory.toString();
    } 
    
    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.changeHistory.add(this.getBalance());
    }
    
    @Override
    public double takeFromWarehouse(double amount) {
        double takenAmount = super.takeFromWarehouse(amount);
        this.changeHistory.add(this.getBalance());
        return takenAmount; 
    }
    
    public void printAnalysis() {
        System.out.println("Product: " +this.getName());
        System.out.println("History: " +this.history());
        System.out.println("Largest amount of product: " +this.changeHistory.maxValue());
        System.out.println("Smallest amount of product: " +this.changeHistory.minValue());
        System.out.println("Average: " +this.changeHistory.average());
    }

    //which prints history related information for the product in the way presented in the example.
    
}
