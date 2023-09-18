import java.util.Scanner;
public class Decripta {
	public static void main (String[] args){
		// Oggetti 
		Scanner in = new Scanner(System.in);
		
		// Input
		System.out.println("inserisci il messaggio criptato qui");
		String testoCriptato = in.nextLine();
		
		// In Array 
		char[] testo = testoCriptato.toCharArray();
		char[] decriptato = new char[testo.length];
		
		// "Decript" 
		for(int i = 0;i < testo.length;i++){
			int temp = testo[i];
			temp -= 4;
			decriptato[i] = (char) temp;
		}
	
		// Output
		System.out.println("messaggio decriptato");
		for(int i = 0;i < decriptato.length;i++){
			System.out.print(decriptato[i]);
		}		
	}
}