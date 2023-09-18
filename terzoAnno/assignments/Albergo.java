import java.util.Scanner;

public class Albergo {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
	System.out.println("inserire piano");
	int piano = in.nextInt();
	int importo, giorni;
	System.out.println("inserire giorni");
	giorni = in.nextInt();
	switch(piano) {
		case 1:
			System.out.println("hai scelto il primo piano");
			importo = 35 * giorni;
			System.out.println(importo + " €");
			break;
		case 2:
			System.out.println("hai scelto il secondo piano");
			importo = 45 * giorni;
			System.out.println(importo + " €");
			break;
			
		case 3:
			System.out.println("hai scelto il terzo piano");
			importo = 55 * giorni;
			System.out.println(importo + " €");
			break;

		case 4:
			System.out.println("hai scelto il quarto piano");
			importo = 65 * giorni;
			System.out.println(importo + " €");	
			break;
		default:
			System.out.println("error");
  		 }
        }
}

