/**
*File: compute.java
*author: Jack Connly
*course: CMPT 220
*assignment: Lab 3
*due date: September 14, 2016
*6.2

*This program computes the tuition after 10 years with a rate of 5% increase
*/

import java.util.Scanner;
public class SumInt {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("enter a number between 1 and 999: ");
    int number = input.nextInt(); 
    int answer = 0;
    int rem = 0;
    while(number > 0){
      rem = number % 10;
      number = number / 10;
      answer = answer + rem;
    }
    System.out.println(answer);
  }
}
