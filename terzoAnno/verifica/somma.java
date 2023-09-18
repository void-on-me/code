import java.util.Scanner;
public class somma
{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int[] vettore = new int[5];
      int pari = 0;
      int dispari = 0;
    for(int i = 0; i < vettore.length; i++){
    vettore[i] = in.nextInt();
    if(vettore[i] % 2 == 0){
      pari += vettore[i];
    }
    else{
      dispari += vettore[i];
    }
    }

    System.out.println("pari " + pari);
    System.out.println("dispari " + dispari);
}
}
