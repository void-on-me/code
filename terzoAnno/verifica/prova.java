import java.util.Scanner;

public class prova {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Lettura degli elementi del primo vettore
        System.out.print("Inserisci la dimensione del vettore: ");
        int dimensione = input.nextInt();
        int[] vettore1 = new int[dimensione];
        for (int i = 0; i < dimensione; i++) {
            System.out.print("Inserisci il " + (i+1) + "° elemento: ");
            vettore1[i] = input.nextInt();
        }
        
        // Creazione del secondo vettore
        int[] vettore2 = new int[dimensione];
        int numZero = 0;
        
        // Copia degli elementi non nulli dal primo al secondo vettore
        for (int i = 0; i < dimensione; i++) {
            if (vettore1[i] != 0) {
                vettore2[i - numZero] = vettore1[i];
            } else {
                numZero++;
            }
        }
        
        // Inserimento degli zeri alla fine del secondo vettore
        for (int i = dimensione - numZero; i < dimensione; i++) {
            vettore2[i] = 0;
        }
        
        // Stampa del secondo vettore
        System.out.print("Il vettore ordinato è: ");
        for (int i = 0; i < dimensione; i++) {
            System.out.print(vettore2[i] + " ");
        }
    }

}

