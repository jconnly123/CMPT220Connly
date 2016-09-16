/**
*File: polyarea.java
*author: Jack Connly
*course: CMPT 220
*assignment: Lab 2
*due date: September 14, 2016
*4.5


*This program calculates the area of a polygot
*/
import java.util.Scanner;
public class polyarea {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("please enter number of sides: ");
		double x = input.nextDouble();
		System.out.print("please enter length: ");
		double y = input.nextDouble();
		double polygon = (x * Math.pow(y, 2)) / (4 * Math.tan(Math.PI / x));
		System.out.print("The area of the polygon is " + polygon);
	}
}
