/**
*File: DuplicateRemover.java
*author: Jack Connly
*course: CMPT 220
*assignment: Lab 8
*due date: November 9, 2016
*11.13

*This program removes any duplicates in an entered array of 10 and reprints it. 
*/
import java.util.Scanner;
import java.util.ArrayList;
public class DuplicateRemover {
  public static void main(String[] args) {
    System.out.print("Enter 10 integers: ");
    Scanner input = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < 10; i++) list.add(input.nextInt());
    System.out.println("Removing any duplicates.");
    removeDuplicate(list);
    System.out.println("Displaying new array");
    System.out.println(list);
  }

  public static void removeDuplicate(ArrayList<Integer> list) {
    ArrayList<Integer> temp = new ArrayList<>();
    for (int i = 0; i < list.size(); i++) {
      if (!temp.contains(list.get(i))) {
        temp.add(list.get(i));
        }
      }
    list.clear();
    list.addAll(temp);
  }
}

