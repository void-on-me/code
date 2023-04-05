import java.util.Scanner;

public class Tab {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("inserisci il numero");
    int n = in.nextInt();
    for (int x = 1; x <= 10; x++) {
      System.out.println(n + " * " + x + " = " + n * x);
    }
  }
}

