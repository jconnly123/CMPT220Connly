/**
*File: lottery.java
*author: Jack Connly
*course: CMPT 220
*assignment: Lab 2
*due date: September 14, 2016


*This is a lottery program 
*/
import java.util.Scanner;
public class lottery{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);


System.out.println("Welcome to the Lottery! Good luck..");
    int lottonum = (int)(Math.random()*1000);
  
	
System.out.println("Please enter a three digit number: ");
	int x = input.nextInt();

		int lottoA = lottonum /100;
		int lottoB = (lottonum % 100)/10;
		int lottoC = lottonum % 10;
		
		int guesslottoA = x / 100;
		int guesslottoB = (x % 100)/10;
		int guesslottoC = x % 10;
			
		int i=0;
		if (lottoA == guesslottoA && lottoB == guesslottoB && lottoC == guesslottoC){
			 i = 0;
		}
		else if (lottoA == guesslottoA || lottoA == guesslottoB || lottoA == guesslottoC && lottoB == guesslottoA || lottoB == guesslottoB || lottoB == guesslottoC && lottoC == guesslottoA || lottoC == guesslottoB || lottoC == guesslottoC){
			 i = 1;
		}else if (guesslottoA == lottoA || guesslottoB == lottoB || guesslottoC == lottoC){
				i=2;
		}
		 else {
			 i=3;
		 }
														
	switch (i){
	case 0: System.out.println("You won! Heres $10,000!"); break;
	case 1: System.out.println("You won 3,000 "); break;
	case 2: System.out.println("You won 1,000 "); break;
	case 3: System.out.println("Sorry Try again... "); break;
	

	}
  }
}
