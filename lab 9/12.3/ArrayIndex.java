/**
*File: ArrayIndex.java
*author: Jack Connly
*course: CMPT 220
*assignment: Lab 9
*due date: November 9, 2016
*12.3

*This program computes the tuition after 10 years with a rate of 5% increase
*/
import java.util.Scanner;
public class ArrayIndex {
  public static void main(String[] args) {
    int[] array = new int[100];
      for (int i = 0; i < array.length; i++) {
          array[i] = (int) (Math.random() * 100);
      }
      Scanner input = new Scanner(System.in);
      System.out.print("Enter an index: ");
      try {
          int index = input.nextInt();
          System.out.println("array[" + index + "] = " + array[index]);
      } catch (IndexOutOfBoundsException ex) {
          System.out.println("INDEX " + ex.getLocalizedMessage() + " out of bounds");
      } catch (Exception ex) {
          System.out.println("INVALID! Please try a different input... ");
    }
  }
}