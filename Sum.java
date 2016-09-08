import java.util.Scanner;
public class Sum{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Please input a number between 0 and 1000 ");
		int number = input.nextInt();
		int firstplacedigit = number % 10;
		number /= 10;
		int secondplacedigit = number % 10;
		number /= 10;
		int thirdplacedigit = number % 10;
		number /= 10;
		int total = thirdplacedigit + secondplacedigit + firstplacedigit;
		
		System.out.println("The sum of the digits in your number is " + total );
		
		
		
		
	}
	
	
	
	
	
}