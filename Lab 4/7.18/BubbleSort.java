// File: BubbleSort.java
// Jack Connly
// cmpt 220
// 09/28/2016
// Professor Rivas
// lab 40
// 7.18
import java.util.Scanner;
public class BubbleSort {
  public static void main(String[] args){
    double[] array =  new double[10];
    Scanner input = new Scanner(System.in);
    System.out.print("please enter 10 numbers: ");
    for (int count = 0; count < array.length; count++) {
      array[count] = input.nextDouble();
    }
    double answerArray[] = bubble(array);
    for(int i = 0; i < answerArray.length; i++){
      System.out.print(answerArray[i] + " ");
    }
  }
  public static double[] bubble(double[] array) {
    double answerArray[] = array;
    for(int j = 0; j < array.length; j++){
      for (int i = 0; i < array.length; i++){
        if(i == array.length-1){
          break;
        }
        double currentIndex = array[i];
        double index = array[i+1];
        if(currentIndex < index){
          double temp = index;
          answerArray[i+1] = currentIndex;
          answerArray[i] = temp;
        }
      }
    }
    return answerArray;
  }    
}
