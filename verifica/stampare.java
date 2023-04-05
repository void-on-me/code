import java.util.Scanner;
public class stampare {
  public static void main (String [] args){
    Scanner in = new Scanner (System.in);
    int[] vettoreUno = new int[in.nextInt()];
    int zeri = 0;
    for (int i = 0; i < vettoreUno.length; i++){
      System.out.println("inserisci numero in posizione " + i);
      vettoreUno[i] = in.nextInt();
      if(vettoreUno[i] == 0){
        zeri++;
      }
    }
    int[] vettoreDue = new int[vettoreUno.length];
    for(int i = 0; i < vettoreUno.length; i++){
      if(vettoreUno[i] != 0){
      vettoreDue[i] = vettoreUno[i];
      }
      System.out.println("valore " + vettoreDue[i]);
    }
    
    } 
    }
  


