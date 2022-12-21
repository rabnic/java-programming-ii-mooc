/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nicholas
 */
public class Teacher extends Person{
    
    private int salary;
    
    public Teacher(String name, String addr, int sal) {
        super(name, addr);
        this.salary = sal;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n  salary " + this.salary + " euro/month";
    }
    
}
