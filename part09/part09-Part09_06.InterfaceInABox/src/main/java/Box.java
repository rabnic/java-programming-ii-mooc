
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nicholas
 */
public class Box implements Packable{
    
    private ArrayList<Packable> items;
    private double maxCapacity;
    
    public Box(double maxCapacity) {
        this.items = new ArrayList();
        this.maxCapacity = maxCapacity;
    }
    
    public void add(Packable item) {
        if (this.weight() + item.weight() <= this.maxCapacity) {
            this.items.add(item);
        }
    }

    @Override
    public double weight() {
        double capacity = 0;
        for(Packable item: items) {
            capacity += item.weight();
        }
        
        return capacity;
    }
    
    @Override
    public String toString() {
        //Box: 6 items, total weight 4.0 kg
        return "Box: " + this.items.size() + " items," +
                " total weight " + this.weight() + " kg";
    }
    
}
