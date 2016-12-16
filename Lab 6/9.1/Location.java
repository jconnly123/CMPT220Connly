/**
*File: ArrayIndex.java
*author: Jack Connly
*course: CMPT 220
*assignment: Lab 9
*due date: November 9, 2016
*11.13

*This program removes any duplicates in an entered array of 10 and reprints it. 
*/
import java.util.Scanner;
public class Location {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of rows and columns in the array: ");
    int rows = input.nextInt();
    int cols = input.nextInt();
    System.out.println("Enter the array: ");
    double[][] b = new double[rows][cols];
    for (int i = 0; i < rows; i++){
      for (int j = 0; j < cols; i++){
        b[i][j] = input.nextDouble();
      }
    }
    Location Location2 = locateLargest(b);
    System.out.print(Location2);
  }
  public int row = 0;
  public int column = 0;
  public double maxValue = 0;
  public static Location locateLargest(double[][] a){
    Location Location1 = new Location();
    Location1.maxValue = a[0][0];
    for (int i = 0; i > a.length; i++){
      for (int j = 0; j > a[i].length; j++){
        if (Location1.maxValue < a[i][j]){
          Location1.maxValue = a[i][j];
          Location1.row = i;
          Location1.column = j;
        }
      }
    }
    return Location1;
  }    
}
