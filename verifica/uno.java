import java.util.Scanner;
public class uno
{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    
    int grandezza;
    do { 
      System.out.println("inserisci grandezza vettore");
      grandezza = in.nextInt();
    } while (grandezza <= 0);
    int[] vettore = new int[grandezza];
    
    System.out.println("grandezza vettore: " + vettore.length);
    }
}
