// File: Project1
// Jack Connly
// cmpt 220
// 09/28/2016
// Professor Rivas
// lab 40
// Project One

import java.util.Scanner;
import java.io.*;

public class Project1 {
  public static void main(String[] args) {
    Scanner scanFile = new Scanner(System.in);
    System.out.println("Please enter the size of the first vector: ");
    int input = scanFile.nextInt();
    double[] array = new double[input];
    System.out.println("Please enter the size of the 2nd vector: ");
    input = scanFile.nextInt();
    System.out.println("Please enter the elements of the 1st vector: ");
    
	for (int vFirst = 0; vFirst < array.length; vFirst++){
      array[vFirst] = scanFile.nextDouble();
    }
    System.out.println("Please enter the elements of the 2nd vector: ");
    double[] array2 = new double[input];
    
	for (int vSecond = 0; vSecond < array2.length; vSecond++){
      array2[vSecond] = scanFile.nextDouble();
    }
    double[] vResult = convolveVectors(array, array2);
    
	for (int vFirst = 0; vFirst < vResult.length; vFirst++){
      System.out.print((int) vResult[vFirst] + " ");
    }
  }

  public static double[] convolveVectors(double[] vFirst, double[] vSecond) {
    double[] vResult = new double[(vFirst.length + vSecond.length) - 1];
    for (int cResult = 0; cResult < vResult.length; cResult++){ 
      vResult[cResult] = 0;
      for (int shift = 0; shift < 51; shift++){
        double sum = 0;
        if (cResult - shift >= 0 && cResult - shift < vFirst.length){
          if (cResult >= 0 && cResult < vSecond.length)
            sum = (vFirst[cResult - shift] * vSecond[shift]);
        }
        vResult[cResult] += sum; 
      }
    }
    return vResult;  
  }
}


