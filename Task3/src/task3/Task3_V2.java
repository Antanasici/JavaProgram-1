/*
CSD2221 Individual Programming Assignment 2017 - Task 3
By Antanas Icikovic
ID: M00537517
Last edited: 2 December 2017 23:25
*/
package task3;

// Import java library's
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3_V2 {

// Main method beginning... 
  public static void main(String[] args) throws Exception {
      
// Create file read instance...
    Scanner input = null;
try{
    input = new Scanner(new File("shark-data.txt"));
}
catch(FileNotFoundException ex){
    System.out.println("File can NOT be located!");
    System.out.println("Terminating the program...");
    System.exit(0);
}
    Scanner inputConsole = new Scanner(System.in);
    input.useDelimiter(":");
    
    //File save instace...
    java.io.File fileSave = new java.io.File("results.txt");
    java.io.PrintWriter output = new java.io.PrintWriter(fileSave);
    if(!fileSave.canWrite()){
        System.out.println("The save file is read only, the result file wont be generates...");
        System.out.println("Continue execution...");
    }
    
// Arrays, sets, lists and other variables...
    // Creating a array to store all the shark objects
        ArrayList<Shark> listSharks = new ArrayList<>();
        
    // Define the array of the matched sharks...
        ArrayList<Shark> matchedSharks = new ArrayList<>();
        
// Take input fromt he console...
    System.out.print("Enter search string for Latin names: ");
        String searchString = inputConsole.next();
    System.out.println("You entered string " + (char)34 + searchString + (char)34);
        String searchString2 = searchString.toUpperCase();
        
// Add object into array after creating Shark object based on the input from the file
try{
    while (input.hasNext()){
        listSharks.add(
             new Shark(
                input.next(),           //Input shark common name
                input.next(),           //Input shark latin name
                input.nextInt(),        //Input shark max length
                input.nextInt(),        //Input shark max depth
                input.next(),           //Input max young in the lifetime
                input.nextInt(),        //Input global presence
                input.nextLine()));     //Input regions that sharks been seen
    }
}
catch(InputMismatchException ex){
    System.out.print("ERROR! ");
    System.out.println("There was an mismatch error when reading the file...");
    System.out.println("Program will be terminated!");
    System.exit(0);
}
     // Close input file...
    input.close();
    
// Find the sharks that match the string and put them in that array...
    for (int i = 0; i < listSharks.size(); i++){
        if (listSharks.get(i).getLatinName().toUpperCase().contains(searchString2)){
            matchedSharks.add(listSharks.get(i));
        }
    }
      System.out.println("The following matches have been found:-");
      output.println("The following matches have been found:-");
      

// Sort matchedSharks array in alphabetic order using comparator
    Collections.sort(matchedSharks, new OrderComparator());
    
/* Run a loop through every matched shark, create a temp string of the latin name of the shark
    that is being looped, then split the latin name into string array, and run a loop for each 
    string in that array while getting the index of the position where the searched string is
    positioned and calculate the end index by adding the length of the search string.
    Then check if index is more or equal to 0 (if not, it means there is no match found), if true
    get a substring of it, then check if there was no matched (sorta flag point called last ), if false
    add the string to a temp position "last" while replacing the subSearch (the location of the match ) by 
    uppercased string "searchString2" and flag(check) true. Then if flag is ture, replace the matched string with 
    uppercase string and finally print out the temp string that was build that way.
    
    This way even if the original latin name from a file starts with capital letter it will be replaced,
    because of accsesing it through the index start and end.
    
    */
    for (int i = 0; i < matchedSharks.size(); i++){
        String indexSearch = matchedSharks.get(i).getLatinName();
        String last = "";
        boolean check = false;
        String[] indexSearchSplit = indexSearch.split(" ");
        for (String s : indexSearchSplit){
          int a = s.toUpperCase().indexOf(searchString.toUpperCase());
          int b = a + searchString.length();
            if ( a >= 0){
                String subSearch = s.substring(a, b);
                if (! last.toUpperCase().contains(s.toUpperCase())){
                last += (matchedSharks.get(i).getLatinName().replace(subSearch, searchString2));
                check = true;
                }
                if ( check == true){
                    last = last.replace(subSearch, searchString2);
                }
            }
        }
        System.out.println(matchedSharks.get(i).getRealName() + " - Latin name: " + last);
        output.println(matchedSharks.get(i).getRealName() + " - Latin name: " + last);
        }
    // Close the results file
    output.close();
  }
}