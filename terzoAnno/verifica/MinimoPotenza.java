import java.util.Scanner;

public class MinimoPotenza {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Lettura degli elementi del vettore
        System.out.print("Inserisci la dimensione del vettore: ");
        int n = input.nextInt();
        int[] vettore = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Inserisci l'elemento " + (i+1) + ": ");
            vettore[i] = input.nextInt();
        }

        // Trovare l'indice e il valore massimo
        int max = vettore[0];
        int index = 0;
        int secondo = 0;
        int secIndex = 0;
        for (int i = 1; i < n; i++) {
            if (vettore[i] > max) {
                secondo = max;
                secIndex = index;
                max = vettore[i];
                index = i;
            }
        }

        // Stampa del risultato
        System.out.println("L'elemento maggiore del vettore è " + max + " e si trova all'indice " + index);
        System.out.println("L'elemento maggiore(secondo) del vettore è " + secondo + " e si trova all'indice " + secIndex);
    }

}

