/*
CSD2221 Individual Programming Assignment 2017 - Task 1
By Antanas Icikovic
ID: M00537517
Last edited: 30 November 2017 22:14


To Do:

*/
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

// Class for all the methods that are used in task 1 of java coursework
public class Methods {

    // Sorting method for min length using comparator
    static void sortMinLength(List<Shark> listSharks){
        Collections.sort(listSharks, new minComparator());
    }
    // Sorting method for max length using comparator
    static void sortMaxLength(List<Shark> listSharks){
        Collections.sort(listSharks, new maxComparator());
    }
    // Method for counting odd words by using hashset to remove dublicates
    static int countOdd(List<Shark> listSharks){
        HashSet sharkSet = new HashSet();
            for (int i =0; i <listSharks.size(); i++){
                String string = listSharks.get(i).getLatinName();
                String[] parts = string.split(" ");
                for (String part : parts){
                    sharkSet.add(part);
                }
            }
        int oddWord = 0;     
            for (Object s : sharkSet) {
                if(s.toString().length()%2 == 1){
                    oddWord++;}
            }
        return oddWord;
    }
    // Method for counting even words by using hashset to remove dublicates
    static int countEven(List<Shark> listSharks){
        HashSet sharkSet = new HashSet();
            for (int i =0; i <listSharks.size(); i++){
                String string = listSharks.get(i).getLatinName();
                String[] parts = string.split(" ");
                for (String part : parts){
                    sharkSet.add(part);
                }
            }
        int evenWord =0;    
            for (Object s : sharkSet) {
                if(s.toString().length()%2 == 0){
                    evenWord++;}
            }
        return evenWord;
    }
    // Method for counting all the letters by NOT including the space (" ")...
    static int counterChar(List<Shark> listSharks){
        int charCount = 0;
        char temp;
        for( int i = 0; i < listSharks.size(); i++ ){
            for (int j = 0; j < listSharks.get(i).getLatinName().length(); j++){
                temp = listSharks.get(i).getLatinName().charAt(j);
                if(temp != ' '){
                    charCount++;}
            }
        }
        return charCount;    
}
}
