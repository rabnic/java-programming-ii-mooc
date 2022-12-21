
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nicholas
 * @param <T>
 */
public class Pipe<T> {
    
    private ArrayList<T> items;
    
    public Pipe() {
        this.items = new ArrayList<>();
    }
    
    public void putIntoPipe(T value) {
        this.items.add(value);
    }
    
    public T takeFromPipe() {
        if (this.items.isEmpty()) {
            return null;
        }
        T toBeTaken = this.items.get(0);
        this.items.remove(toBeTaken);
        return toBeTaken;
    }
    
    public boolean isInPipe() {
        return !(this.items.isEmpty());
    }
}
