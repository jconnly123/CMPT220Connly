// File: StringCounter.java
// Jack Connly
// cmpt 220
// 09/28/2016
// Professor Rivas
// lab 40
// 6.20
import java.util.*;
  import java.util.Scanner;
    public class StringCounter {
    public static void main(String[] args){
	  Scanner input = new Scanner(System.in);
	  System.out.println("Please enter a String...");
	  String thing = input.nextLine();
	  System.out.print(CountLetters(thing));
    }
 
  public static int CountLetters(String thing){
    int counter = thing.length();
	return counter;
  }
}
	  
	  
	 