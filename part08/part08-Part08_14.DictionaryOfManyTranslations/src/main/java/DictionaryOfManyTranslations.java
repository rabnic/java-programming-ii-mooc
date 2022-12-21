
import java.util.ArrayList;
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
public class DictionaryOfManyTranslations {
    
    private HashMap<String, ArrayList<String>> dictionary;
    
    public DictionaryOfManyTranslations() {
        this.dictionary = new HashMap();
    }
    
    public void add(String word, String translation) {
        // Create new empty translation list if not already created
        this.dictionary.putIfAbsent(word, new ArrayList());
        
        // then add the translation to parent word
        this.dictionary.get(word).add(translation);
    
    }
    //adds the translation for the word and preserves the old translations.
    
    public ArrayList<String> translate(String word) {
        return this.dictionary.getOrDefault(word, new ArrayList());
    }
    
    //returns a list of the translations added for the word. If the word has 
    //no translations, the method should return an empty list.
    
    public void remove(String word) {
        this.dictionary.remove(word);
    }
    //removes the word and all its translations from the dictionary
    
}
