package equazione;
import java.util.Scanner;


public class EquazioneJava {
	
	// Metodo calcolo del delta
	public static float calcoloDelta(float a, float b,float c) {
		float delta;
		return delta = b*b - 4 * a * c;
	}
	
	// Metodo calcolo degli zeri dell'equazione 
	public static double[] eqSecondoGrado(float a, float b, float c) {
		float delta = calcoloDelta(a, b, c);
		
		// arr con soluzioni
		double[] zeriEq = new double[2];
		if (delta < 0) {
			System.out.println("l'equazione non ha soluzioni nel campo dei reali");
		}
		else if (delta == 0) {
			zeriEq[0] = Math.round(-b / (2 * a));
			System.out.println("l'equazione ha una sola soluzione: " + zeriEq[0]);
		}
		else {
			zeriEq[0] = Math.round((-b + Math.sqrt(delta)) / (2 * a));
			zeriEq[1] = Math.round((-b - Math.sqrt(delta)) / (2 * a));
			
			System.out.println("l'equazione ha due soluzioni reali e distinte: X1 " + zeriEq[0] + " X2 " + zeriEq[1]);
		}
		return zeriEq;
	}

	public static void main(String[] args) {
	// Scanner
	Scanner in = new Scanner(System.in);
	
	float coeA;
	do {
		System.out.println("inserisci il coefficente a diverso da 0");
		coeA = in.nextFloat();
	} while (coeA == 0);
	
	System.out.println("inserisci il coefficente b");
	float coeB = in.nextFloat();
	
	System.out.println("inserisci il coefficente c");
	float coeC = in.nextFloat();
	
	// Richiamo del metodo risolutore
	double zeriEq[] = eqSecondoGrado(coeA, coeB, coeC);

	}

}
