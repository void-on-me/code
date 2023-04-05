import java.util.Scanner;
public class verifica{
  public static void main (String [] args){
     Scanner in = new Scanner (System.in);
     
    int n = 0;
    do{
     System.out.println("inserisci grandezza due vettori");
     n = in.nextInt();
    } while(n <= 0);
     int[] vettoreA = new int[n];
     int[] vettoreB = new int[n];

    for (int i = 0; i < vettoreA.length; i++){
     System.out.println("inserisci numero in " + i);
     vettoreA[i] = in.nextInt();
    }

    for (int i = 0; i < vettoreB.length; i++){
     System.out.println("inserisci numero in " + i);
     vettoreB[i] = in.nextInt();
    }
    boolean check = false; 
    for (int i = 0; i < n; i++){
      int contatore = 0;
      while (vettoreA[i] != vettoreB[contatore] && contatore < n) {
        if(vettoreA[i] == vettoreB[contatore]){
          check = true;
        }
        else{
          check = false;
        }
        contatore++;
      }
      check = true;
    }

    System.out.println("i vettori sono " + check);
  } 
}
