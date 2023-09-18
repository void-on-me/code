import java.lang.Math;
import java.util.Random; 
public class Temperature {
  public static void main(String[] args) {
    // creo l'oggetto random 
    Random ran = new Random();
    int[] mese = new int [30];
    
    // riempio array
    for(int i= 0; i < mese.length; i++){
      mese[i] = ran.nextInt(56);
    }
    
    // calcolo media
    double media = 0;
    double somma = 0;
    for(int t: mese){
     somma += t;
    }
    media = somma / 30;
    media = Math.round(media);
    System.out.println("media temperature del mese: " + media + "°");
    
    // stampo giorni minori della media 
    System.out.println("giorni con temperature sotto la media");
    for(int i = 0; i < 30; i++){
      if (mese[i] < media){
        System.out.println((i + 1)  + "° giorno del mese" + "(" + mese[i] + ")");
      }
    }

  }
}
