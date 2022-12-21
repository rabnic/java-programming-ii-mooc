
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nicholas
 */
public class Abbreviations {
    
    private HashMap<String, String> abbrs;
    
    public Abbreviations() {
        abbrs = new HashMap();
    }
    
    public void addAbbreviation(String abbr, String explanation) {
        this.abbrs.put(abbr, explanation);
    }
    
    public boolean hasAbbreviation(String abbr) {
        return this.abbrs.containsKey(abbr);
    }
    
    public String findExplanationFor(String abbr) {
        return this.abbrs.get(abbr);
    }
    
}
