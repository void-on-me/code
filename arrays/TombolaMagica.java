import java.util.Random;
import java.util.Scanner; 
public class TombolaMagica {
  public static void main(String[] args) {
    // Oggetti
    Scanner in = new Scanner(System.in);
    Random r = new Random();

    // Arrays
    int [] generato = new int [10];
    int [] inserito = new int [10];

    // inserimento dati nel secondo array dall'utente
    for (int i = 0; i < inserito.length; i++) {
        System.out.println("inserisci un numero tra 1 e 90 senza ripetizioni");
        inserito[i] = in.nextInt();
    }

    // generazione dei valori per il secondo array
    for (int i = 0; i < 10; i++) {
      generato[i] = r.nextInt(89 + 1);
      // controllo doppioni 
      for (int c = 0; c < i; c++) {
        if (generato[c] == generato[c]) {
          c--;
          break;
        }
      }
    }

    // risultati
    int score = 0;
    for (int i = 0; i < 10; i++) {
      for (int c = 0; c < 10; c++) {
        if (inserito[i] == generato[c]) {
          score++;
          break;
        }
      }
    }
    
    switch (score) {
      case 2:
        System.out.println("Hai fatto ambo!");
        break;

      case 3:
        System.out.println("Hai fatto terna!");
        break;
        
      case 4:
        System.out.println("Hai fatto quaterna!");
        break;

      case 5:
        System.out.println("Hai fatto cinquina!");
        break;

      default:
        System.out.println("Mi dispiace, hai perso!");
        break;
    }
    

  }
}
