/*
CSD2221 Individual Programming Assignment 2017 - Task 1
By Antanas Icikovic
ID: M00537517
Last edited: 2 December 2017 22:14
*/

// Import the java librarys...
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_V2 {
    
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
        ArrayList<Shark> listSharks =  new ArrayList<>();
        
    // Refference for the Methods class
        Methods mainMethods = new Methods();
        
// Add object into array after creating Shark object based on the input from the file
try{
    while (input.hasNext()){
        listSharks.add(
             new Shark(
                input.next(),           //Input shark common name
                input.next(),           //Input shark latin name
                input.nextInt(),        //Input shark max length
                input.nextInt(),        //Input shark max depth
                input.next(),        //Input max young in the lifetime
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
    // Close input file.
    input.close();
// Task 1 methods are being called here..
    //Method to sort array of shark objects by max length
        Methods.sortMaxLength(listSharks);
    // Print out the top largest sharks to a console and save to file...
        System.out.println("--- Three largest sharks ---");
        output.println("--- Three largest sharks ---");
    try{
        for (int i = 0; i < 3; i++){
            System.out.println(listSharks.get(i).getRealName()+","+
                    " Length = " + listSharks.get(i).getMaxLength());
            output.println(listSharks.get(i).getRealName()+","+
                    " Length = " + listSharks.get(i).getMaxLength());
        }
    }
    catch(IndexOutOfBoundsException ex){
            System.out.println("Not enough data on the sharks to show the 3 largest ones!");
    }
    //Method to sort array of shark objects by min length
        Methods.sortMinLength(listSharks);
        
    // Print out the top smallest sharks to a console and save to file...
        System.out.println("--- Three smallest sharks ---");
        output.println("--- Three smallest sharks ---");
    try{
        for (int i = 0; i < 3; i++){
            System.out.println(listSharks.get(i).getRealName()+","+
                    " Length = " + listSharks.get(i).getMaxLength());
            output.println(listSharks.get(i).getRealName()+","+
                    " Length = " + listSharks.get(i).getMaxLength());
        }
    }
    catch(IndexOutOfBoundsException ex){
           System.out.println("Not enough data on the sharks to show the 3 smallest ones!");
    }
    // Print out the separator in the console and file
      System.out.println("-----------------------------");
      output.println("-----------------------------");
      
    // Print out the number of letters in latin names by calling a method counterChar (save to file too)
      System.out.println("Total number of letters in all Latin names = " + Methods.counterChar(listSharks));
      output.println("Total number of letters in all Latin names = " + Methods.counterChar(listSharks));
      
    // Print out the number of unique even words in latin names by calling method countEven (save to file too)
      System.out.println("Total number of unique even words in Latin names = " + Methods.countEven(listSharks));
      output.println("Total number of unique even words in Latin names = " + Methods.countEven(listSharks));
      
    // Print out the number of unique odd words in latin names by calling method countOdd (save to file too)
      System.out.println("Total number of unique odd words in Latin names = " + Methods.countOdd(listSharks));
      output.println("Total number of unique odd words in Latin names = " + Methods.countOdd(listSharks));
      
    // Close the output file
    output.close();

// End of the main method...
}
}