import java.util.Scanner;
public class factional
{ public static void main (String[] args){
	Scanner in = new Scanner(System.in);
	System.out.println("inserisci il numero");
	int numero = in.nextInt();
	int fact = 1;
	while(numero > 0){
		fact *= numero--;
		}
	System.out.println("risultato " + fact);
	}
}
