import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Escursionista {
  public static void main(String[] args) {
    
    // Oggetti 
    Scanner in = new Scanner(System.in);
    Random r = new Random();

    // Ruscello
    boolean [][] ruscello = new boolean [4][4];
    
    // Generazione rocce
    for (int i = 0; i < 4; i++) {
      for (int c = 0 ; c < 4; c++) {
        ruscello[i][c] = r.nextBoolean();
      }
    }

    // Territorio 
    System.out.println("ruscello");
    for (int i = 0; i < 4; i++) {
     for (int c = 0; c < 4; c++) {
      if (ruscello[i][c] == true) {
        System.out.print("[0] ");
      }
      else{
        System.out.print("[>] ");
      }
     }
      System.out.println();
    }




  }
}
