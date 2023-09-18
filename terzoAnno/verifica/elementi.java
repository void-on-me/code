import java.util.Scanner;
public class elementi{
  public static void main(String [] args){
    // riempimentolo di array
    System.out.println("inserisci vettore");
    Scanner in = new Scanner(System.in);
    int[] arr = new int[in.nextInt()];

    // var 
    int positivi = 0;
    int negativi = 0;

    for(int i = 0; i < arr.length; i++){
    System.out.println("inserisci valore");
      arr[i] = in.nextInt();
      if(arr[i] < 0){
        negativi += arr[i];
      }
      else{
        positivi += arr[i];
      }
    }

    // stampiamo 
    System.out.println("somma positivi: " + positivi);
    System.out.println("somma negatovi: " + negativi);
    
  }
}
