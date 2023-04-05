import java.util.Scanner;
public class festa{
  public static void main(String [] args){
    Scanner in = new Scanner(System.in);

    int[] vettore = new int[20];
    int[] numeri = new int[6]; // 0 = 5, 1 = 6, 2 = 7, 3 = 8, 4 = 9, 5 = 10.
    for (int i = 0; i < vettore.length;i++){
      
      do {System.out.println("inserisci il numero nella posizione: " + i);
          vettore[i] = in.nextInt();
      } while(vettore[i] < 5 || vettore[i] > 10);
    }
    
    for(int i = 0; i < vettore.length;i++){
      if(vettore[i] == 5){
      numeri[0]++;
      }
      else if(vettore[i] == 6){
      numeri[1]++;
      }
      else if(vettore[i] == 7){
      numeri[2]++;
      }
      else if(vettore[i] == 8){
      numeri[3]++;
      }
      else if(vettore[i] == 9){
      numeri[4]++;
      }
      else if(vettore[i] == 10){
      numeri[5]++;
      }
    }

    // stampiamo
    for(int i = 0; i < numeri.length;i++){
      System.out.println("numeri uguali a " + (i + 5) + " sono: " + numeri[i]);
    } 
  }
}
