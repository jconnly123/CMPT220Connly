/**
*File: BigInt.java
*author: Jack Connly
*course: CMPT 220
*assignment: Lab 10
*/

import java.math.BigInteger;
import java.util.Scanner;
public class BigInt {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter an integer: ");
    long var = input.nextLong();

    System.out.println(factorial(new BigInteger(var + "")));
  }

  private static BigInteger factorial(BigInteger n) {
    BigInteger result = BigInteger.ONE;
    if (n.equals(BigInteger.ZERO)){
      return result;
    }
    return n.multiply(factorial(n.subtract(result)));
  }
}
