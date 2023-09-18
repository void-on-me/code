import java.util.Scanner;

public class mediaAlunni {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci il numero di studenti: ");
        int numStudenti = input.nextInt();

        int[] voti = new int[numStudenti];
        int totaleVoti = 0;
        int votiSufficienti = 0;

        for (int i = 0; i < numStudenti; i++) {
            System.out.print("Inserisci il voto dello studente " + (i+1) + ": ");
            voti[i] = input.nextInt();
            totaleVoti += voti[i];
            if (voti[i] >= 6) {
                votiSufficienti++;
            }
        }

        int votoMedio = totaleVoti / numStudenti;
        int percentualeSufficienti = votiSufficienti * 100 / numStudenti;
        int percentualeInsufficienti = 100 - percentualeSufficienti;

        System.out.println("Il voto medio della classe è: " + votoMedio);
        System.out.println("La percentuale di voti sufficienti è: " + percentualeSufficienti + "%");
        System.out.println("La percentuale di voti insufficienti è: " + percentualeInsufficienti + "%");
    }
}

