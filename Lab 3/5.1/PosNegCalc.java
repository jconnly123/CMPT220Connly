/**
*File: compute.java
*author: Jack Connly
*course: CMPT 220
*assignment: Lab 3
*due date: September 14, 2016


*This program computes the number of positive and negative numbers
*/
import java.util.Scanner;
public class PosNegCalc {
	public static void main(String[] args){
		int imp;
		int sum = 0;
		int pos = 0;
		int neg = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("enter an integer, the input ends if it is 0: ");
		do {
		imp = input.nextInt();
		sum += imp;
		if (imp < 0){
			neg = neg + 1;
		}
		if (imp > 0){
			pos = pos + 1;
		}
		} while (imp!= 0);
		double total = pos + neg;
		if (total == 0){
			System.out.print("no numbers are entered except 0");
		}
		else{	
			double subtotal = sum / total;
			System.out.println("the number of positives is " + pos);
			System.out.println("the number of negatives is " + neg);
			System.out.println("the total is " + sum);
			System.out.println("the average is " + subtotal);
		}
	}
}
