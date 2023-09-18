import java.util.Scanner;
public class velocità 
{
	public static void main (String [] args){
	Scanner in = new Scanner(System.in);
	int zero;
	int macchine = 0;	
	do{
	System.out.println("inserire la velocità con cui andavi altrimenti inserisci 0");
	zero = in.nextInt();
	if(zero > 90){
	macchine++;
	}
	}while(zero != 0);
	
	System.out.println("numero macchine che hanno superato i 90km/h: " + macchine);	
	}
}



















