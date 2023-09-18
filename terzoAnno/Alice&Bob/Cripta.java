/*
Descrizione problema:
Bob ha bisogno di mandare dei messaggi in chiaro ad Alice 
ma che siano incomprensibili ad esterni.

Possibile soluzione:
Ho scelto  di risolvere i problemi separatamente usando un algoritmo per criptare e uno per decriptare.

Algoritmo utilizzato per criptare i messaggi:
ricevuto il messaggio in input dall'utente come stringa e successivamente trasformato in un array di caratteri.
a ogni elemento dell'array viene aggiunto 4 al proprio codice ascii rendendo l'insieme di caratteri incomprensibili.

Algoritmo utilizzato per decriptare:
l'approcio utilizzato è l'inverso del algoritmo usato per criptare.
Quindi ricevuto il messaggio criptato come stringa in input, la converto in un array di caratteri e sottraggo 4
dal codice ascii di ogni carattere rendendolo identico all messaggio originale in chiaro.
*/
import java.util.Arrays;
import java.util.Scanner;
public class Cripta {
	public static void main (String[] args){
		// Oggetti 
		Scanner in = new Scanner(System.in);
		
		// Input
		System.out.println("inserisci il messaggio in chiaro qui");
		String testoInChiaro = in.nextLine();
		
		// In Array 
		char[] testo = testoInChiaro.toCharArray();
		char[] criptato = new char[testo.length];
		
		// "Cript" 
		for(int i = 0;i < testo.length;i++){
			int temp = testo[i];
			temp += 4;
			criptato[i] = (char) temp;
		}
		
		// Output
		System.out.println("messaggio criptato");
		for(int i = 0;i < criptato.length;i++){
			System.out.print(criptato[i]);
		}
	}
}