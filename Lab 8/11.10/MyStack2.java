/**
*File: MyStack.java
*author: Jack Connly
*course: CMPT 220
*assignment: Lab 8
*due date: November 9, 2016
*11.10

*
*/

import java.util.ArrayList;
import java.util.Scanner;
public class MyStack2 extends ArrayList<Object> {
  public static void main(String[] args){
    MyStack2 Object = new MyStack2();
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter 5 strings: ");
    Object.push(input.next());
    Object.push(input.next());
    Object.push(input.next());
    Object.push(input.next());
    Object.push(input.next());
    System.out.println(Object.pop());
    System.out.println(Object.pop());
    System.out.println(Object.pop());
    System.out.println(Object.pop());
    System.out.println(Object.pop());
  }
  private ArrayList<Object> list = new ArrayList<>();
  public boolean isEmpty(){
    return isEmpty();
  }
  public int getSize() {
    return size();
  }
  public Object peek() {
    return get(getSize() - 1);
  }
  public Object pop() {
    Object o = get(getSize() - 1);
    remove(getSize() - 1);
    return o;
  }
  public void push(Object o) {
    add(o);
  }
  @Override
  public String toString() {
    return "stack : " + toString();
  }
}