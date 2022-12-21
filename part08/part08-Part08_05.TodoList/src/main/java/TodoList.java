
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
public class TodoList {
    
    private ArrayList<String> tasks;
    
    public TodoList() {
        this.tasks = new ArrayList();
    }
    
    public void add(String task) {
        this.tasks.add(task);
    }
    
    public void remove(int taskNum) {
        this.tasks.remove(taskNum -1);
    }
    
    public void print() {
        for (String task: this.tasks) {
            System.out.println(1 + tasks.indexOf(task)+": "+task);
        }
    }
    
}
