/**
*File: FinalProject.java
*author: Jack Connly
*course: CMPT 220
*assignment: Final Project
*due date: Decenber 9, 2016
* I plan on making my final project a computer science phonebook for students 
to use that prints a list of our current class with their email, and then 
gives the user the option to enter in a new name to the phonebook. Once any new 
names are added they can reprint the matrix and see their entries at the bottom.  
*/

import java.util.Scanner;
import java.util.ArrayList;
public class FinalProject {
  public static void main(String[] args) {
	System.out.println("Computer Science Phonebook!");
	// HERE I HAVE CREATED A MATRIX OF 999 ROWS AND 2 COLUMNS. 
	// I DID THIS BECAUSE MY PROGRAM  ALLOWS THE USER
	// TO ADD NAMES AND EMAILS TO THE MATRIX. THIS WAY I CAN NEVER GET "ARRAY OUT OF BOUNDS"
	String list[][] = new String[999][2];
	list[0][0] = "Name";
	list[0][1] = "Email";
	list[1][0] = "Jack Connly";
	list[1][1] = "Jack.Connly1@Marist.edu";
	list[2][0] = "Ariele Silva ";
	list[2][1] = "Ariele.Silva1@Marist.edu";
	list[3][0] = "Hunter Postiglione";
	list[3][1] = "Hunter.Postiglione1@Marist.edu";
	list[4][0] = "Jose Carranza";
	list[4][1] = "Jose.Carranza1@Marist.edu";
	list[5][0] = "Danny Pucket";
	list[5][1] = "Danny.Puckett1@Marist.edu";
	list[6][0] = "Delroy Mathieson";
	list[6][1] = "Delroy.Mathieson1@Marist.edu";
	list[7][0] = "Garrett Meyer";
	list[7][1] = "Garrett.Meyer1@Marist.edu";
	list[8][0] = "Nicole Padrazo";
	list[8][1] = "Nicole.Padrazo1@Marist.edu";
	list[9][0] = "Julia Russell";
	list[9][1] = "Julia.Russell1@Marist.edu";
	list[10][0] = "Laura Florez";
	list[10][1] = "Laura.Florez1@Marist.edu";
	list[11][0] = "Liam Healy";
	list[11][1] = "Liam.Healy1@Marist.edu";
	list[12][0] = "Nicholas Kaban";
	list[12][1] = "Nicholas.Kaban1@Marist.edu";
	list[13][0] = "Drew Burns";
	list[13][1] = "Drew.Burns1@Marist.edu";
	list[14][0] = "Michael Cummins";
	list[14][1] = "Michael.Cummins1@Marist.edu";
	list[15][0] = "Dayna Dunninger";
	list[15][1] = "Dayna.Dunninger1@Marist.edu";
	list[16][0] = "Brian Powers";
	list[16][1] = "Brian.Powers1@Marist.edu";
	list[17][0] = "Alex Richin";
	list[17][1] = "Alex.Richin1@Marist.edu";
	list[18][0] = "John Ryan";
	list[18][1]= "John.Ryan4@Marist.edu";
	// THIS IS THE FINAL MATRIX LIST, EVERYTIMME THE PROGRAM IS CLOSED IT REVERTS
	// TO THIS LIST, DELETING ALL NEW ENTRIES. 
	int count = 19;
	boolean running = true;
	while(running == true){
	  System.out.println("Would you like to see a list of our current class?"); 
	  System.out.println("Input Y for yes and N for no...");
	  Scanner input = new Scanner(System.in);
	  String a = input.nextLine();
	  if (a.equalsIgnoreCase("Y")){
	    // THIS IS A PRINTING ALGORITHM I HAVE CREATED. IT GOES THROUGH EACH LINE
	    // PRINTING I FIRST THEN | THEN J.
		for(int i = 0; i < count; i++){
		  for(int j = 0; j < 2; j++){
			System.out.print(list[i][j]);
			if(j == 1){//
			  System.out.println();
			  break;
			}
			System.out.print("|");
		  }
		}
	    // FINALLY ONCE THE USER HAS PRINTED THE LIST HE IS PROMPTED TO EITHER
	    // PRINT THE LIST AGAIN, OR ADD A NEW NAME TO THE LIST.
	  } else{
		System.out.println("Would you like to Add a name instead?");
	    System.out.println("Input Y for yes and N for no...");
		String b = input.nextLine();
		if(b.equalsIgnoreCase("Y")){
		  // IF THEY DO WANT TO ADD A NAME THE FOLLOWING IF ELSE ADDS 
		  // A NAME AND EMAIL TO THE END OF THE LIST. YOU CAN THEN REPRINT THE LIST
		  // AND SEE YOUR NEW ADDITION AT THE END OF THE MATRIX. 
		  System.out.println("Enter a name");
		  String name = input.nextLine();
		  System.out.println("Enter an email");
		  String email = input.nextLine();
		  list[count][0] = name;					
		  list[count][1] = email;						
		  count++;
		}else{
		    running = false;
	    }
      }	
	}
  }
}
