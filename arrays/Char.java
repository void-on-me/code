import java.util.Scanner;
public class Char {
  public static void main(String[] args) {
    // Oggetti 
    Scanner in = new Scanner(System.in);

  // Stringa di testo && creazione array char 
  System.out.println("inserisci una stringa di testo");
  String testo = in.nextLine();

  char[] array = testo.toCharArray();

  // Testo originale
  System.out.println();
  System.out.println("-----------------------------");
  System.out.println("testo originale:");
  System.out.println(testo);
  System.out.println();
  System.out.println("Testo nuovo");

  // Nuovo arary
  char[] derivato = new char [array.length];
  for (int i = 0; i < array.length; i++) {
    int temporaneo = (array[i] + 5);
    derivato[i] = (char)temporaneo;
    System.out.print(derivato[i]);
  }



  }
}
