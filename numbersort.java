/**
*File: lottery.java
*author: Jack Connly
*course: CMPT 220
*assignment: Lab 2
*due date: September 14, 2016
*version: "1.8.0_101"

*This is a number sorting program
*/import java.util.Scanner;
public class numbersort{
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
System.out.print("Please enter three integers: ");
	int a = input.nextInt();
	int b = input.nextInt();
	int c = input.nextInt();
	numbersorted(a, b, c);
}


public static void numbersorted(double a, double b, double c){
	if ((a < b) && (b < c)){
		System.out.println("The sorted numbers are " + a + " " + b + " " + c);
		}
	if ((a < b) && (b > c)){
		System.out.println("The sorted numbers are " + c + " " + a + " " + b);
		}
	if ((a > b) && (b > c)){
		System.out.println("The sorted numbers are " + c + " " + b + " " + a);
		}
	if ((a > b) && (b < c)){
		System.out.println("The sorted numbers are " + b + " " + a + " " + c);
		}
}
} 