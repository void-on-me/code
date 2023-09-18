import java.util.Scanner;
public class Vettore{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);

    // variabili
    System.out.println("inserisci la grandezza del vettore");
    int x = in.nextInt();
    int[] vettore = new int[x];
    int media_uno, media_due;
    int pari = 0;
    int dispari = 0;
    int somma_pari = 0;
    int somma_dispari = 0;
    // riempimento array
    for (int i = 0; i < vettore.length;i++){
     System.out.println("inserisci il valore nella posizione: " + i);
     vettore[i] = in.nextInt();
     if (i % 2 == 0){
       pari++;
       somma_pari += vettore[i];
     }
     else{
       dispari++;
       somma_dispari += vettore[i];
     }
    }

    // calcolo media
    media_uno = somma_pari / pari;
    media_due = somma_dispari / dispari;
    
    // determino media maggiore
    if (media_uno > media_due){
      System.out.println("la media dei pari è maggiore di quella dei dispari");
      System.out.println("pari: " + media_uno + " media dispari: " + media_due);
    }
    else{
      System.out.println("la media dei dispari è maggiore di quella dei pari");
      System.out.println("pari: " + media_uno + " media dispari: " + media_due);
    }
  }
}
