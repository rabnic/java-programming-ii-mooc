
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
public class BoxWithMaxWeight extends Box {
    
    private int capacity;
    private ArrayList<Item> items;
    
    public BoxWithMaxWeight(int capacity) {
        this.capacity =  capacity;
        this.items = new ArrayList();
    }

    @Override
    public void add(Item item) {
        if (isSpaceAvailable(item.getWeight())) {
            this.items.add(item);
        }
    }
    
    private boolean isSpaceAvailable(int newWeightIn) {
        int currentWeightInBox = 0;
        
        for (Item item: this.items) {
            currentWeightInBox += item.getWeight();
        }
        
        
        return currentWeightInBox + newWeightIn <= this.capacity;
    }

    @Override
    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }
    
    
    
}
