import java.util.Scanner;
public class Percentage{
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
		System.out.print("Your final grade is: "  );
		
		if(total >= 95.0){
			System.out.println("A");
		}
		else if (total >= 90.0){
			System.out.println ("A-");
		}
		else if (total >= 87.0){
			System.out.println ("B+");
		}
		else if (total >= 83.0){
			System.out.println("B");
		}
		else if (total >= 80.0){
			System.out.println("B-");
		}
		else if (total >= 77.0) {
			System.out.println("C+");
		}
		else if (total >= 73.0){
			System.out.println("C");
		}
		else if (total >= 70.0){
			System.out.println("C-");
		}
		else if (total >= 67.0){
			System.out.println("D+");
		}
		else if (total >= 63.0){
			System.out.println("D");
		}
		else if (total >= 60.0){
			System.out.println("D-");
		}
		else {
			System.out.println("F");
			
		}
	}
}