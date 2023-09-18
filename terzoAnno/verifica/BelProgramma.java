import java.util.Random; 
public class BelProgramma {
  public static void main(String[] args) {
    // Oggetti
    Random r = new Random();


    // generazione e calcolo del 5
    int cinque = 0;

    for (int i = 0; i < 15; i++) {
      int generato = r.nextInt(91);
      if (generato == 5) {
        cinque++;
      }
    }

    // Restituzione output
    System.out.println("il numero 5 risulta presente " + cinque + " volte su 15");
  }
}
