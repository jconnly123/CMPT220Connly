import java.util.Random;
public class Rndmonth{
	public static void main(String[] args){
		Random rand= new Random();
		
		double randmonth = (int)(Math.random()*12 +1);
		
		
		
		System.out.println(randmonth);
		if (randmonth == 1){
			System.out.print("Your random month is January!");	
		}
		else if (randmonth == 2){
			System.out.print("Your random month is February!");
		}
		else if (randmonth == 3){
			System.out.print("Your random month is March!");
		}
		else if (randmonth == 4){
			System.out.print("Your random month is April!");
		}else if (randmonth == 5){
			System.out.print("Your random month is may!");
		}else if (randmonth == 6){
			System.out.print("Your random month is June!");
		}else if (randmonth == 7){
			System.out.print("Your random month is July!");
		}else if (randmonth == 8){
			System.out.print("Your random month is August!");
		}else if (randmonth == 9){
			System.out.print("Your random month is September!");
		}else if (randmonth == 10){
			System.out.print("Your random month is October!");
		}else if (randmonth == 11){
			System.out.print("Your random month is November!");
		}else if (randmonth == 12){
			System.out.print("Your random month is December!");
		} else {
			System.out.print("Error! Please close and run again");
		}
	}

}