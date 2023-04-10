import java.util.Random;
public class SommaMatrici {
  public static void main(String[] args) {
    Random r = new Random();
    
    // creo matrice e riempio di numeri casuali minori = di 50 
    int [] [] matriceA = new int [2] [2];
    System.out.println("Prima matrice: ");
    for (int i = 0; i < 2;i++){
      for (int c = 0; c < 2; c++){
        matriceA[i][c] = r.nextInt(50);
        System.out.print(matriceA[i][c] + "\t");
      }
    }

    System.out.println("\n");
    System.out.println("seconda matrice: ");
    int [] [] matriceB = new int [2][2];
    for (int i = 0; i < 2;i++){
      for (int c = 0; c < 2; c++){
        matriceB[i][c] = r.nextInt(50);
        System.out.print(matriceB[i][c] + "\t");
      }
    }

    // matrice somma 
    System.out.println("\n");
    System.out.println("matrice somma:");
    int [] [] matriceSomma = new int [2][2]; 
    for (int i = 0; i < 2; i++){
      for (int c = 0; c < 2; c++){
        matriceSomma[i][c] = matriceA[i][c] + matriceB[i][c];
        System.out.print(matriceSomma[i][c] + "\t");
      }
    }

  }
}
