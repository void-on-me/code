import java.util.Scanner;
public class ScalareAmano {
  public static void main(String[] args) {
    // Creazione oggetti
    Scanner in = new Scanner(System.in);

    // Creazione matrice bidimensionale
    int [][] matrix = new int [4][4];

      // Uso scanner per inserire input da tastiera
      for (int i = 0; i < 4; i++){
        for (int c = 0; c < 4; c++){
          System.out.println("inserisci un numero nella matrice..");
          matrix[i][c] = in.nextInt();
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
