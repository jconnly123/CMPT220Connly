/**
*File: MaxValue.java
*author: Jack Connly
*course: CMPT 2208
*assignment: Lab 7
*due date: November 9, 2016
*11.13

*This program removes any duplicates in an entered array of 10 and reprints it. 
*/
import java.math.BigInteger;
public class MaxValue {
  public static void main(String[] args) {
    String temp = Long.toString((long)Math.floor(Math.sqrt(Long.MAX_VALUE)));
    String maxAsString = Long.toString(Long.MAX_VALUE);

    
    BigInteger maxValue = new BigInteger(maxAsString);
    BigInteger Square = new BigInteger(temp);
    
    int count = 0;
    
    while(count < 10){
      if(Square.multiply(Square).compareTo(maxValue) == 1){
        System.out.println(Square.multiply(Square));
        count++;
      }
      Square = Square.add(new BigInteger("1"));
    }

  }
}
