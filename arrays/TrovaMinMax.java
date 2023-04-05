import java.util.Scanner;

public class TrovaMinMax {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      int[] numeri = new int[15];
      System.out.println("inserisci 15 numeri:");
      for (int i = 0; i < 15; i++) {
         numeri[i] = input.nextInt();
      }
      
      int min = numeri[0];
      int max = numeri[0];
      for (int i = 1; i < 15; i++) {
         if (numeri[i] < min) {
            min = numeri[i];
         }
         if (numeri[i] > max) {
            max = numeri[i];
         }
      }
      
      System.out.println("valore minimo: " + min);
      System.out.println("valore massimo: " + max);
   }
}

