/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nicholas
 */
public class Item {
    
    private String product;
    private int price;
    private int quantity;
    
    public Item(String product, int qty, int unitPrice) {
        this.product = product;
        this.quantity = qty;
        this.price = unitPrice;
    }
    
    public int price() {
        return this.price * this.quantity;
    }
    
    public void increaseQuantity() {
        this.quantity += 1;
    }
    
    @Override
    public String toString() {
        return this.product + ": " + this.quantity;
    }
}
