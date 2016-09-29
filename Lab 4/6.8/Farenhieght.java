// File: Farenhiegth.java
// Jack Connly
// cmpt 220
// 09/28/2016
// Professor Rivas
// lab 40
// 6.8
public class Farenhieght{
  public static void main(String[] args){
    System.out.format("  Celsius Farenheit | Farenheit  Celsius\n");
    for (double cel=40.0 , far = 120; cel > 30; cel -= 1, far-=10)	 {
      double[] myList = new double[100];
	  System.out.format("%9.1f %9.1f | %9.1f %9.1f\n", cel, Cel2Far(cel), far, Far2Cel(far)) ;
	}
  }
  public static double Cel2Far(double cel){
    return (9.0/5.0) *(cel +32.0);
  }
  public static double Far2Cel(double far){
	return (5.0/9.0) * (far -32);
  }
}