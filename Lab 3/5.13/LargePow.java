/**
*File: compute.java
*author: Jack Connly
*course: CMPT 220
*assignment: Lab 3
*due date: September 14, 2016
*5.13

*This program computes the 
*/
public class LargePow {
  public static void main(String[] args){
    boolean numberfound = true;
    long large = 12000;  
    while(numberfound != false){
      if ((large * large * large) < 12000){
        numberfound = false;
      }
      else {
        large--;
      }
    }
    System.out.println(large);
  }
}
