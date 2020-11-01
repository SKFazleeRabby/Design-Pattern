package com.mycompany.scrabblewords;
import java.util.LinkedList;
import java.util.Arrays;


public class ScrabbleWord {
    
    String[] scabbleLetters = {
        "a", "a", "a", "a", "b", "b", "b", "b", "b", "b", "b", "b", "b", "b",
        "c", "c", "c", "d", "e", "e", "e", "e", "e", "e", "f", "f", "f", "g",
        "g", "g", "g", "g", "g", "g", "g", "g", "g", "g", "g", "g", "g", "g",
        "h", "h", "h", "i", "j", "k", "l", "l", "l", "l", "l", "l", "m", "m"    
    };
    
    private static ScrabbleWord onlyInstance = null;
    private LinkedList<String> letterList = new LinkedList<String>(Arrays.asList(scabbleLetters));
    
    public ScrabbleWord(){}
    
    public static ScrabbleWord getInstance(){
        if(onlyInstance == null){
            onlyInstance = new ScrabbleWord();
        }
        return onlyInstance;
    }
    
    public LinkedList<String> getLettersList(){
        return this.letterList;
    }
    
    public LinkedList<String> getLetters(int numberOfLetters){
        LinkedList<String> lettersToSend = new LinkedList<String>();
        
        for(int i=0; i<numberOfLetters; i++){
            lettersToSend.add(this.letterList.remove(0));
        }
      
        return lettersToSend;
    }
    
}
