/**
*File: area.java
*author: Jack Connly
*course: CMPT 220
*assignment: Lab 2
*due date: September 14, 2016


*This program calculates the area of a pentagon
*/
import java.util.Scanner;
public class area {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("please enter length: ");
		double length = input.nextDouble(); 
		double side = ((2.0 * length) * Math.sin(Math.PI / 5.0));
		double pentagonArea = ((5.0 * (Math.pow(side , 2))) / (4.0 * Math.tan(Math.PI / 5.0)));
		System.out.print("The area of the pentagon is " + (String.format("%.2f" ,pentagonArea)) + " Units squared");
	}
}
