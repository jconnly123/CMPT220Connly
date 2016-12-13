/**
*File: compute.java
*author: Jack Connly
*course: CMPT 220
*assignment: Lab 3
*due date: September 14, 2016
*6.3

*This program computes the tuition after 10 years with a rate of 5% increase
*/
import java.util.Scanner;
public class Palindrome {
  public static void main (String[] args){
    System.out.println("enter a number: ");
    Scanner input = new Scanner(System.in);
    int number = input.nextInt();  
    int answer = reverse(number);
    System.out.println(answer);
    System.out.println(isPalindrome(number));
  }
  
  public static int reverse(int number){
    int answer = 0;
    int rem;
    while(number > 0){
      rem = number % 10;
      number = number / 10;
      answer = answer * 10 + rem;
    }
    return answer;
  }
  
  public static boolean isPalindrome(int number){
    boolean palendr = number == reverse(number);
    return palendr;
  
  }
}


