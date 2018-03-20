/*
CSD2221 Individual Programming Assignment 2017 - Task 2
By Antanas Icikovic
ID: M00537517
Last edited: 4 December 2017 22:48
*/

package task.pkg2;

// Import the java librarys...
import java.io.File;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

// Main class
public class Task2_V2 {
    
// Main method starts here...
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
    
    // Createing a TreeSet to remove dublicates and sort in abc order (default sorting)
        TreeSet<String> sharkRegionSet = new TreeSet<>();
    
        
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
// Task methods...

    // Method to add evry possible reagion into a TreeSet
      for (Shark listShark : listSharks) {
          String[] data = listShark.getSharkRegions().replace(":", "").split(", ");
          for (Object d : data){
              sharkRegionSet.add(d.toString().trim());
          }
      }
    /*
      Method to run a for each loop on a ordered set without dublicates and create 
      a temp TreeSet do order common shark names, then run a 2nd for each loop on all the sharks,
      split the region names by ", ", and add them to a string array, then check if the string from
      the ordered "sharkRegionsSet" (without dublicates) is inside the dataRegions (regions of shark),
      if yes, add it's common name to "regionCommonName" treeset.
      And then print out the region that is being matched with and all the common names that were added
      to a set.
      */
       for (Object s : sharkRegionSet){
           TreeSet<String> regionCommonName = new TreeSet<>();
           for (Shark listShark : listSharks){
               String[] data = listShark.getSharkRegions().replace(":", "").split(", ");
               TreeSet<String> dataRegions = new TreeSet<>();
               for(Object d: data){
                   dataRegions.add(d.toString().trim());
               }
               if(dataRegions.contains(s.toString())){
                   regionCommonName.add(listShark.getRealName());
               }
           }
           System.out.println(s.toString() + " -> " + regionCommonName.toString());
           output.println(s.toString() + " -> " + regionCommonName.toString());
       }
    // Close of output file
       output.close();
  }
}