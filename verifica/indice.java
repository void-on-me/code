import java.util.Scanner;
public class indice {
  public static void main (String [] args){
    Scanner in = new Scanner (System.in);
    System.out.println("vettore");
    int[] vettore = new int[in.nextInt()];

    for(int i = 0; i < vettore.length; i++){
      vettore[i] = i;
      System.out.println(vettore[i]);
    }
  }
}

