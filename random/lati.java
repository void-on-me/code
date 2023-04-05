import java.util.Scanner;
public class lati {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("inserisci quanti quadrati");
    int length = in.nextInt();
    int[] sides = new int [length];
    for (int i = 0; i < length; i++){
      System.out.println("inserisci lunghezza lato del " + (i + 1) + "° quadrato");
      sides[i] = in.nextInt();
    }
    
    for (int t: sides){
    System.out.println("area: " + (t * t));
    }
  }
}
