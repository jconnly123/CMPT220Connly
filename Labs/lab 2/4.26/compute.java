/**
*File: compute.java
*author: Jack Connly
*course: CMPT 220
*assignment: Lab 2
*due date: September 14, 2016
*4.26

*This is a Computing program 
*/
import java.util.Scanner;
public class compute {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an amount in double, for example 11.56: ");
		double total = input.nextDouble();
		String thing = Double.toString(total);
		
		int remAMT = (int)(total * 100);
		int numdol = remAMT / 100;
		remAMT = remAMT % 100;
		int numQ = remAMT / 25;
		remAMT = remAMT % 25;
		int numD = remAMT / 10;
		remAMT = remAMT % 10;
		int numN = remAMT / 5;
		remAMT = remAMT % 5;
		int numP = remAMT;
		
		System.out.println("Your amount " + total + " consists of");
		System.out.println("     " + numdol + " dollars");
		System.out.println("     " + numQ + " quarters");
		System.out.println("     " + numD + " dimes");
		System.out.println("     " + numN+ " nickels");
		System.out.println("     " + numP + " pennies");
	}
}

