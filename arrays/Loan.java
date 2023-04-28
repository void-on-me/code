import java.util.Scanner;
public class Loan {
   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int amount = in.nextInt();
    int percentuale = 0;
    int rimanente = 0;
    for (int i = 0; i < 3; i++){
        percentuale = (amount * 10) / 100;
        rimanente = amount - percentuale;
    }
    System.out.println("rimanente " + rimanente);
   }
}