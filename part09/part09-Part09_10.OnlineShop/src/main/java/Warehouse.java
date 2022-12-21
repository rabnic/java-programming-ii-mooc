
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nicholas
 */
public class Warehouse {
    private Map<String,Integer> productPrices;
    private Map<String,Integer> productStock;
    
    public Warehouse() {
        this.productPrices = new HashMap<>();
        this.productStock = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock) {
        this.productPrices.putIfAbsent(product, price);
        this.productStock.putIfAbsent(product, stock);
    }
           
    public int price(String product) {
        return this.productPrices.getOrDefault(product, -99);
    }
    
    public int stock(String product) {
        return this.productStock.getOrDefault(product, 0);
    }
    
    public boolean take(String product) {
        int currentStock = this.stock(product);
        if (currentStock == 0) {
            return false;
        }
        this.productStock.replace(product, currentStock, currentStock - 1);
        return true;   
    }
    public Set<String> products() {
        return this.productPrices.keySet();
    }
}
