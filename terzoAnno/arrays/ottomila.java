import java.util.Scanner;
public class ottomila{
  public static void main(String[] args){
    int somma = 0;
    Scanner in = new Scanner(System.in);

  int[] numeri = new int[8000];
    System.out.println("inserisci numeri");
  for (int i = 0; i < numeri.length;i++){
    numeri[i] = in.nextInt();
    somma += numeri[i];
  }
  System.out.println("somma" + somma);

  }
}
