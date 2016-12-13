/**
*File: compute.java
*author: Jack Connly
*course: CMPT 220
*assignment: Lab 3
*due date: September 14, 2016
*5.7

*This program computes the tuition after 10 years with a rate of 5% increase
*/
public class TuitionCalc {
  public static void main(String[] args){
    double tuition = 10000;
	double year;
	double tuitionfinal;
	double total;
	double totalA = 0;
	double totalB = 0;
	double totalC = 0;
	double totalD = 0;
			
	for (year=11; year<=15; year++){
			double rate = .05 * year;
			tuitionfinal = rate*tuition + tuition;
			System.out.println("The tuition for this year is " + tuitionfinal);
			if (year==12){
				totalA = tuitionfinal;
			}
			else if (year==13){
				totalB = tuitionfinal;
			}
			else if (year==14){
				totalC = tuitionfinal;
			}
			else if (year==15){
				totalD = tuitionfinal;
			}
	  }
		
	total = totalA + totalB + totalC + totalD;
	System.out.println("The tuition for the last four years is " + total);
	
  }
}