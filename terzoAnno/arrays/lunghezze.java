import java.util.Scanner;
public class lunghezze {
	public static void main(String [] args){
	Scanner in = new Scanner(System.in);
	int numero, conto = 0;
	double somma = 0;
	System.out.println("inserire un intero (numero negativo per uscire)");
	numero = in.nextInt();
	while (numero >= 0) {
		conto++;
		somma += numero;
		System.out.println("Media: " + (somma / conto));
 	        System.out.println("inserire un intero (numero negativo per uscire)");
		numero = in.nextInt();
		}
	}
}
