import java.util.Scanner;

public class partitaiva {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci i primi 10 numeri della PIVA: ");
        String pivaString = input.nextLine();
        int[] pivaArray = new int[10];
        for (int i = 0; i < 10; i++) {
            pivaArray[i] = Integer.parseInt(pivaString.substring(i, i+1));
        }
        int s = 0;
        for (int i = 0; i < 10; i++) {
            int d = pivaArray[i];
            if (i % 2 == 0) {
                d *= 2;
                if (d > 9) {
                    d -= 9;
                }
            }
            s += d;
        }
        int c = (10 - s % 10) % 10;
        System.out.println("Il codice di controllo della PIVA è " + c);
    }
}

