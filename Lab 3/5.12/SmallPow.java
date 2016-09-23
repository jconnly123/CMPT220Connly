/**
*File: compute.java
*author: Jack Connly
*course: CMPT 220
*assignment: Lab 3
*due date: September 14, 2016
*5.12

*This program computes the smallest number n that will produce a number greater than 12,000
*/
public class SmallPow {
	public static void main(String[] args){
		boolean number = true;
		int small = 1;  
		while(number != false){
		 if (small * small > 12000){
		   number = false;
		 }
		 else{
		   small++;
		 }
	}
	System.out.println(small);
  }
}


