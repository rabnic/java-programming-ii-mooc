/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nicholas
 */
public class LiteracyData implements Comparable<LiteracyData>{

    private final String country;
    private final int year;
    private final String gender;
    private final double rate;
    
    public LiteracyData(String country, int year, String gender, double rate) {
        this.country = country;
        this.year = year;
        this.gender = gender;
        this.rate = rate;   
    }
    
    public String getCountry() {
        return this.country;
    }
    
    public int getYear() {
        return this.year;
    }
    
    public String getGender() {
        return this.gender;
    }
    
    public double getRate() {
        return this.rate;
    }
    
    @Override
    public String toString(){
        //Niger (2015), female, 11.01572
        return this.country + " (" + this.year + "), "
                + this.gender + ", " + this.rate;
    }
    
    @Override
    public int compareTo(LiteracyData data) {
        return Double.compare(this.getRate(), data.getRate());
    }
}
