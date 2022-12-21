/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nicholas
 */
public class Book {
    
    final private String name;
    final private int recommendationAge;
    
    public Book(String name, int age) {
        this.name = name;
        this.recommendationAge = age;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getAge() {
        return this.recommendationAge;
    }
    
    @Override
    public String toString() {
        return this.name + " (recommended for " + this.recommendationAge +
                " year-olds or older)";
    }
    
}
