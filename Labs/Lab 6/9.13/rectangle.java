 /**
*File: Rectangle.java
*author: Jack Connly
*course: CMPT 220
*assignment: Lab 6
*9.1

*This program creates a rectangle and returns the area and perimeter. 
*/
 public class Rectangle {
  public static void main(String[] args){
    Rectangle Rectangle1 = new Rectangle(); 
    System.out.println("The area of the rectangle is: " + Rectangle1.getArea()+ " Units Squared");
    System.out.println("The perimeter of the rectangle is: " + Rectangle1.getPerimeter() + " Units");
  }
  double height = 1;
  double width = 1;
  Rectangle(){
    this.height = 3;
    this.width = 6;
  }
  Rectangle(int width, int height){
    this.width = width;
    this.height = height;
  }
  double getArea(){
    return this.height * this.width;
  }
  double getPerimeter(){
    return 2 * height * width;

  }
}