
import java.util.ArrayList;
import java.util.Iterator;
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
public class Employees {
    
    private List<Person> staff;
    
    public Employees() {
        this.staff = new ArrayList<>();
    }
    
    public void add(Person personToAdd) {
        this.staff.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd) {
        this.staff.addAll(peopleToAdd);
    } 
    
    public void print() {
        Iterator<Person> iterator = this.staff.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    public void print(Education education) {
        Iterator<Person> iterator = this.staff.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getEducation().equals(education)) {
                System.out.println(person);
            }
        }
    }
    
    public void fire(Education education) {
        Iterator<Person> iterator = this.staff.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getEducation().equals(education)) {
                iterator.remove();
            }
        }
    }
            
//        prints the employees whose education 
//        matches the education given as a parameter.
    
}
