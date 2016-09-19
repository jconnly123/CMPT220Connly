// no header
import java.util.Scanner;
public class Percentage{
  // == tabs!!
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the following as percentages ");
		
		System.out.print("Midterm Exam: ");
		double midterm = input.nextDouble();
		System.out.print("Final Exam: ");
		double finalexam = input.nextDouble();
		System.out.print("Projects: ");
		double projects = input.nextDouble();
		System.out.print("Homework and Labs: ");
		double homelabs = input.nextDouble();
		double total = (midterm + finalexam + projects + homelabs)/4; 
		System.out.print("Your final grade is: " + total );
		
	}
}
