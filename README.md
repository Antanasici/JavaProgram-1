# JavaProgram-1
Java assignment for the 1st term of Software Development module in the 2nd year of Computer Science university of London

For this assignment, a single data (text) file is provided as a test file. This test file should be used for all of the three tasks and should not be altered in any way (use a separate copy of the file for each task, as described below). When checking your work, the tutors will use a different test file with identical structure to that provided. That is to say, your programs should work because the structure of the second test file is identical, but the program outputs will be different. The markers will examine these outputs to verify the correctness of your programs.

## Task 1 
Inspect the test file provided, which is called shark-data.txt. This is a delimited text file which contains data about different types of sharks. Each new line represents a single shark species with seven fields delimited by the colon character. The seven fields represent different information about the shark in the following order:

- Common name
- Latin name (by genus and species)
- Maximum length in centimetres that the shark can grow to
- Maximum depth the shark type can swim in metres
- The maximum number of young a female shark of that species would have in their lifetime
- A global presence indicator which is an integer between 1 and 10 to reflect how widespread that shark species can roam
- A list of oceanic regions that the shark species has been observed, with each region delimited by the comma character

Write a Java program (as a NetBeans project) that opens up the data file, parses the shark data, and prints the following information to the console:

1. The three largest sharks by length, ordered by the largest first. Print the common name of each shark on a newline along with the maximum length in centimetres.
2. The three smallest sharks by length, ordered by the smallest first. Print the common name of each shark on a newline along with the maximum length in centimetres.
3. The total number of letters (not including whitespace characters) of all the Latin names for all sharks in the data file. Duplicate letters must be counted.
4. The total number of unique words contained within all of the Latin names for all sharks in the data file that have an even number of letters.
5. The total number of unique words contained within all of the Latin names for all sharks in the data file that have an odd number of letters.

On compiling and running, your program should have output similar to the following:

```--- Three largest sharks ---
Shark A, Length = a centimetres
Shark B, Length = b centimetres
Shark C, Length = c centimetres
--- Three smallest sharks ---
Shark X, Length = x centimetres
Shark Y, Length = y centimetres
Shark Z, Length = z centimetres
--------------------------
Total number of letters in all Latin names = P
Total number of unique even words in Latin names = Q
Total number of unique odd words in Latin names = R
```

Where the values ‘Shark A’ through ‘Shark C’ and ‘Shark X’ through ‘Shark Z’ are replaced with the relevant shark common names, and the values a through c and x though z are replaced with their respective maximum lengths, and the values P, Q and R replaced with the respective letter and word counts.

In addition to the console output, your program should also save all of the output to parts (a) through (e) above to a text file in the NetBeans project root folder. Call the file results.txt.

Having performed these actions, your program should close the opened file properly.
Your program should handle exceptions robustly.

## Task 2
Remember, create a new (separate) NetBeans project for this task, named Task2.

As with Task1, you are required to write a Java program that opens the test data file of shark information. Use a separate copy of the test data file located in the root of the Task2 NetBeans project.

For this task you are required to write a Java program that analyses the oceanic regions associated with each shark listed in the test data file. For each unique region that is contained in the entire shark data set, the Java program should print to the output window (console) the oceanic region and an associated list of sharks (using their common name, in alphabetical order) that are known to roam within that region. Each oceanic region and associated list of sharks should be printed on a separate line, as illustrated below.
```
Region 1 -> [Shark A, Shark B, Shark C]
Region 2 -> [Shark D, Shark E]
Region 3 -> [Shark F, Shark G, Shark H, Shark I]
. . .
Etc.
```
Each region should be listed only once, and the associated list of sharks for that region should not contain duplicates. Sharks should be listed using their common name. The printout should list regions alphabetically, and the list of sharks associated with each region should also be in alphabetical order (based on their common name).

In addition to the console output, your program should also save all of the output to a text file in the NetBeans project root folder. Call the file results.txt.

Having performed these tasks, your program should close the opened file properly.

Your program should handle exceptions robustly.

## Task 3
Remember, create a new (separate) NetBeans project for this task, named Task3.

As with the previous tasks, you are required to write a Java program that opens the test data file of shark information. Use a separate copy of the test data file located in the root of the Task3 NetBeans project.

For this task, your Java program should prompt the User to enter a search string at the command prompt, i.e., the NetBeans console window. The program should then match the input search string against all of the Latin names in the shark data set and print a list of the sharks that match. The matching should be case insensitive. In other words, the strings “aBc” and “AbC” should match.

On entering a search string expression at the console (command prompt), and after processing the data matching, the program should return a list of matching sharks ordered by their common name in alphabetical order, but which also lists their Latin name with all occurrences of matching string in uppercase and the rest of the Latin name in lowercase. The following examples illustrate how the program should operate.

### Example 1
```
Enter search string for Latin names: > tUm
You entered string "tUm"
The following matches have been found:-
Nurse Shark - Latin name: Ginglymostoma cirraTUM
Variegated Shark - Latin name: Stegostoma fasciaTUM
```
### Example 2
```
Enter search string for Latin names: > Charc
You entered string "Charc"
The following matches have been found:-
Great White Shark - Latin name: CHARCharodon CHARCharias
```
## Meta

Antanas Icikovic – [LinkedIn](www.linkedin.com/in/antanas-icikovic) – Find me here!
