import java.util.Random;
import java.util.Scanner;
public class Scalare {
  public static void main(String[] args) {
    // Creazione oggetti
    Scanner in = new Scanner(System.in);
    Random r = new Random();

    // Creazione matrice bidimensionale
    int [][] matrix = new int [4][4];

      // Uso Random per generare numeri
      for (int i = 0; i < 4; i++){
        for (int c = 0; c < 4; c++){
          matrix[i][c] = r.nextInt(40);
        }
      }

    // Richista numero Scalare
    System.out.println("inserisci il numero scalare");
    int scalare = in.nextInt();
    in.close();

    // Moltiplicazione di ogni elemento della matrici per il numero scalare
    for (int i = 0; i < 4; i++){
      for (int c = 0; c < 4; c++){
        matrix[i][c] *= scalare;
      }
    }
    
    // Risultato 
    System.out.println("la matrice risultante è:");
      for (int i = 0; i < 4; i++) {
              for (int c = 0; c < 4; c++) {
                  System.out.print(matrix[i][c] + " ");
              }
              System.out.println();
          }


  }
}
