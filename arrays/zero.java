import java.util.Scanner;
public class zero 
{
  public static void main (String[] args){
  Scanner in = new Scanner (System.in);
    int dimensione;
    int somma = 0;
    System.out.println("inserire la dimensione dell'array");
    dimensione = in.nextInt();
  
    int[] arr = new int[dimensione];
    System.out.println("la dimensione dell'array è " + arr.length);
    
    for (int i = 0;i < arr.length;i++){
      System.out.println("inserisci il valore della posizione numero: " + i);
        arr[i] = in.nextInt();
      somma += arr[i];
      if (arr[i] == 0){t
        i = arr.length + 1;
        }
      }
    System.out.println("la somma dei numeri fino ad ora è di " + somma);
   }
}

/* definizione array è insieme di locazioni logicamente contugue identificati tramite un index */ 
