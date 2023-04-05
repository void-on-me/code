import java.util.Scanner;
public class Aereo {
	public static void main (String [] args){
	Scanner in = new Scanner(System.in);
	int price = 20;
	int discount;
	System.out.println("are you an over 18 years old? (type 1 for yes or 0 for no)");
		int decision = in.nextInt();
	
	System.out.println("are you from Sardegna? (type 1 for yes or 0 for no)");
		int from = in.nextInt();
/*************************************************************************************/
		
	if(decision != 1 && from != 1 ){
		System.out.println("your import is: " + price);	
   	}
	else if (decision == 1 && from == 0) {
		discount = price * 15 / 100;
		price = price - discount;
		System.out.println("your import is: " + price + " €"); 

	}
else if (decision == 0 && from == 1) {
		discount = price * 25 / 100;
		price = price - discount;
		System.out.println("your import is: " + price + " €");
 	  }
  
	else {
	discount = price * 35 / 100;
	price = price - discount;
	System.out.println("your import is: " + price + " €");
	}
	
	
}
}

