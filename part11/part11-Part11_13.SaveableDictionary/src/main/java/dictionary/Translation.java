/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.util.Objects;

/**
 *
 * @author Nicholas
 */
public class Translation {
    
    private String from;
    private String to;
    
    public Translation(String from, String to) {
        this.from = from;
        this.to = to;
    }
    
    public String getTranslation(String word) {
        if (isMatch(word)) {
            return this.from.equals(word) ? this.to : this.from;
        }
        return null;
    }
    
    public boolean isMatch(String word) {
        return this.from.equals(word) || this.to.equalsIgnoreCase(word);
    }
    
    @Override
    public String toString() {
        return this.from + ":" + this.to;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.from);
        hash = 79 * hash + Objects.hashCode(this.to);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Translation other = (Translation) obj;
        if (!Objects.equals(this.from, other.from)) {
            return false;
        }
        if (!Objects.equals(this.to, other.to)) {
            return false;
        }
        return true;
    }
    
}
