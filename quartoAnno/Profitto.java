package Profitto;
import java.util.Scanner;
public class Profitto {
	
	public static void caricaVettore(int v[]) {
		// Oggetto Scanner
		Scanner in = new Scanner(System.in);
		
		for (int t = 0; t < 9; t++) {
			v[t] = in.nextInt();
		}
		
		in.close();
	}
	
	public static int piccoMax(int v[]) {
		int max = 0; 
		for (int t = 1; t < 9; t++) {
			if (v[t] > v[max]) {
				max = t;
			}
		}
		return max;
	}
	
	public static int piccoMin(int v[], int j) {
		int min = 0;
		for (int t = 1; t < j; t++) {
			if (v[t] < v[min]) {
				min = t;
			}
		}
		return min;
	}
	
	public static int profumoProfitto(int i, int j, int v[]) {
		int profitto = v[j] - v[i];
		return profitto;
	}
	
	public static void main(String[] args) {
		
		// Previsione del cash
		int [] N = new int [10];
		
		System.out.println("inserisci le 10 stime per il valore del grano");
		caricaVettore(N);
		
		// Variabili 
		int j = piccoMax(N);
		int i = piccoMin(N, j);
		
		
		// Risultato 
		System.out.println("il profitto massimo è di " + profumoProfitto(i, j, N) + "€ se si compra il giorno " + (i + 1) + " e se si vende nel giorno " + (j + 1));
		
	}

}
