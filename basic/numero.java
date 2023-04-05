import java.util.Scanner;

public class numero {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int min = 0;
    boolean first = true;

    System.out.println("Inserisci 5 numeri:");
    for (int i = 0; i < 5; i++) {
      int num = input.nextInt();
      if (first) {
        min = num;
        first = false;
      } else if (num < min) {
        min = num;
      }
    }
    System.out.println("Il numero minimo è: " + min);
    System.out.println("Scusi il ritardo, non avevo visto il programma da fare...");
  }
}

