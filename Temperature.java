import java.util.Scanner;



public class Temperature{ 
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please Input a temperature");
		double temp = input.nextDouble();
		temp = ((9.0 / 5) * temp) + 32;
		System.out.println("Your Temperature Fahrenheit is " + temp + "!");
 



	}
}