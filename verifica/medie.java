import java.util.Scanner;
public class medie
{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
   // array
   System.out.println("inserisci vettore");
    int[] arr = new int[in.nextInt()];
    
    // vars
    int mediaP, mediaD;
    int sommaP = 0;
    int sommaD = 0;
    int numeroP = 0;
    int numeroD = 0;

    for(int i = 0; i < arr.length; i++){
        System.out.println("inserisci valore");
        arr[i] = in.nextInt();
        if(arr[i] % 2 == 0){
          numeroP++;
          sommaP += arr[i];
        }
        else{
          numeroD++;
          sommaD += arr[i];
        }
      }

    // magic
    mediaP = sommaP / numeroP;
    mediaD = sommaD / numeroP;
    System.out.println("media elementi pari " + mediaP);
    System.out.println("media elementi dispari " + mediaD);
    }
}
