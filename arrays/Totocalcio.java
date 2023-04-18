import java.util.Scanner;
import java.util.Random;
public class Totocalcio {
  public static void main(String[] args) {
    // Oggetti 
    Random r = new Random();
    Scanner in = new Scanner(System.in);

    // Matrici 
    char [][] matrice = new char [13][3];
    
    // Input dall'utente 
    for (int i = 0;i < 13;i++){
      System.out.println("inserisci 1/2/x");
      char input = in.next().charAt(0);
      switch (input) {
        case '1':
         matrice [i][0] = '1';
          break;
        
        case '2':
          matrice [i][0] = '2';
           break;

        default:
             matrice [i][0] = 'X';
          break;
      }
    }

    // generazione 
    for (int i = 0;i < 13;i++){
      int risultati = r.nextInt(2);
      switch (risultati) {
        case 1:
          matrice [i][1] = '1';  
           break;
        case 2:
           matrice [i][1] = '2';

        default:
          matrice [i][1] = 'X'; 
           break;
      }
    }

    // risultati 
    int score = 0;
    for (int i = 0;i < 13;i++){
      if (matrice[i][0] == matrice[i][1]) {
        score++;
      }
    }
    System.out.println();
    System.out.println("il tuo punteggio: " + score);


  }
}
