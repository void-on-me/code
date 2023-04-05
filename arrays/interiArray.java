import java.util.Scanner;
public class interiArray{
  public static void main (String [] args){
    Scanner in = new Scanner(System.in);
    int[] numeri = new int[15];
    int finale = 0;
    for (int i = 0; i < 15;i++){
      System.out.println("inserisci il numero " + i);  
      numeri[i] = in.nextInt();
    }
    for (int x = 1;x != 15; x += 2){
      finale += numeri[x];   
    }
    System.out.println("somma dei numeri in posizione dispari: " + finale);
  }
}
