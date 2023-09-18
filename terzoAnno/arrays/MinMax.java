import java.util.Random;
public class MinMax {
  public static void main(String[] args) {
    // oggetti 
    Random r = new Random();

    // creazione array bidimensionale
    int [] [] array = new int [5] [5];
    
    for (int i = 0; i < 5; i++) {
      for (int c = 0; c < 5; c++) {
       array[i][c] = r.nextInt(58);  
      }
    }

    // cercamentolo numero massimo
    int min = array[0][0];
    int minI = 0;
    int minC = 0;
    
    int max = array[0][0];
    int maxI = 0;
    int maxC = 0;

    for (int i = 1; i < 5; i++) {
      for (int c = 1; c < 5; c++){
        if (min > array[i][c]) {
          min = array[i][c];
          minI = i;
          minC = c;
        }
        if (max < array[i][c]) {
          max = array[i][c];
          maxI = i;
          maxC = c;
        }
      }
    }

    // stampamentolo
    System.out.println("min: " + min + " in posizione: " + " riga " + minI + " colonna " + minC);
    System.out.println("max: " + max + " in posizione: " + " riga " + maxI + " colonna " + maxC);
  
  }
}
