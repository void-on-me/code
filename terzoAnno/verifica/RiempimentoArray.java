import java.util.Random;
import java.util.Scanner;
public class RiempimentoArray {
  public static void main(String[] args) {
    // Oggetti
    Scanner in = new Scanner(System.in);
    Random r = new Random();

    // Dim Array
    int dim = 1; 
    do {
      System.out.println("inserisci la grandezza dell'Array");
      dim = in.nextInt();
    } while (dim <= 0);

    // Array
    int [] arr = new int[dim];
    int sum = 0;

    // Random Array
    for (int i = 0; i < arr.length; i++) {
      arr[i] = r.nextInt(51);
    }

    // Major detection
    for (int t : arr) {
      if (t > 5) {
       sum += t; 
      }
    }

    // Output time
    System.out.println("sum of all the numbers grater than 5: " + sum);
  }
}
