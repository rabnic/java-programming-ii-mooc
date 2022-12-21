/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Nicholas
 */
public class SaveableDictionary {
    
    private List<Translation> dictionary; 
    private String filename;
    
    public SaveableDictionary() {
        this.dictionary = new ArrayList<>();
    }
    
    public SaveableDictionary(String file) {
        this();
        this.filename = file;
    }
    
    public boolean load() {
    
        try(Scanner scan = new Scanner(new File(this.filename))) {
            while (scan.hasNextLine()){
                String line = scan.nextLine();
                String[] parts = line.split(":");
                this.add(parts[0], parts[1]);
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean save() {
        
        try {
            PrintWriter writer = new PrintWriter(this.filename);
            for (Translation translation: this.dictionary) {
               // writer.println(translation.toString());
                writer.println(translation.toString());
            }
            writer.close();
            return true;
        } catch (FileNotFoundException e) {
            return false;
        }
    }
    
    public void add(String words, String translation) {
        Translation newTranslation = new Translation(words, translation);
        if (!this.dictionary.contains(newTranslation)) {
            this.dictionary.add(newTranslation);
        }
    }
    
    public String translate(String word) {

        for (Translation translation: this.dictionary) {
            if (translation.isMatch(word)) {
                return translation.getTranslation(word);
            }
        }
        return null;
    }
    
    public void delete(String word) {
        Translation toBeDeleted = null;
        for (Translation translation: this.dictionary) {
            if (translation.isMatch(word)) {
                toBeDeleted =  translation;
            }
        }
        this.dictionary.remove(toBeDeleted);
    }
       
}
