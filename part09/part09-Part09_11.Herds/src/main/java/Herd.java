
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nicholas
 */
public class Herd implements Movable {
    
    private List<Movable> herd;
    
    public Herd() {
        this.herd = new ArrayList<>();
    }
    
    @Override
    public String toString() {
        String positions = "";
        
        for (Movable organism: this.herd) {
            positions += organism + "\n";
        }
        
        return positions;
    }
    
    public void addToHerd(Movable movable) {
        this.herd.add(movable);
    }
    
    @Override
    public void move(int dx, int dy) {
        for (Movable movable: this.herd) {
            movable.move(dx, dy);
        }
    }

//public void addToHerd(Movable movable)
//Adds an object that implements the Movable interface to the herd.
//public void move(int dx, int dy)
//Moves the herd with by the amount specified by the parameters. 
//        Notice that here you have to move each member of the herd.
}
