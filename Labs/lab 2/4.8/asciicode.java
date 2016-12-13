/**
*File: asciicode.java
*author: Jack Connly
*course: CMPT 220
*assignment: Lab 2
*due date: September 14, 2016
*4.8


*This program promts the user to enter an ascii code and it gives the corresponding symbol
*/
import java.util.Scanner;
public class asciicode {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an ascii code: ");
		int code = input.nextInt(); 
		char sym = (char)code;
		System.out.println("The character for ascii code "+code+" is: "+sym);		
	}
}
