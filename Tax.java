// missing header
import java.util.Scanner;
public class Tax{
  // using tabs!!!!
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the Subtotal and gratuity rate ");
		double subtotal = input.nextDouble();
		double taxes = input.nextDouble();
		double taxestotal = subtotal * (taxes / 100);
		double total = taxestotal + subtotal;
		System.out.println("Your gratuity will be $" + taxestotal );
		System.out.println("Bringing your total to $" + total );
		
		
		
	}
	
}
