import java.util.Scanner;
public class dispari
{
  public static void main(String[] args){
   Scanner in = new Scanner(System.in);
   int dimensione;
   do {System.out.println("inserisci dimensione vettore"); 
      dimensione = in.nextInt();
   } while (dimensione <= 0);
    int[] vettore = new int [dimensione];

    int i = 0; // contatore 
    int zeri = 0; // numeri diversi da 0
    int dispari = 0; 
    do{
      System.out.println("inserisci un numero");
      vettore[i] = in.nextInt();
      dispari = vettore[i];
      i++;
    }
    while(dispari % 2 == 0 && i < vettore.length);

    for (int x = 0; x < vettore.length; x++){
      if (vettore[x] != 0){
       zeri++;
      }
    }


    if(dispari % 2 != 0){
    System.out.println("numero dispari trovato: " + dispari + " in posizione " + i);
    }
    System.out.println("numeri diversi da zero: " + zeri);
  }
}
