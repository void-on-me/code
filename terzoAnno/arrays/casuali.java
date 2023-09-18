import java.util.Arrays;
import java.util.Random;
public class casuali {
  public static void main(String[] args) {
    Random ran = new Random();
    int vettoreA[]  = new int[5];
    int vettoreB[] = new int[5];
    System.out.println("vettori generati");
    int vector = 4;
    for(int i = 0; i < 5; i++){
      vettoreA[i] = ran.nextInt();
      vettoreB[vector] = vettoreA[i];
      vector--;
    }
   
    // output
    System.out.println("normal output " + Arrays.toString(vettoreA));
    System.out.println("reversed output " + Arrays.toString(vettoreB));

  }
}
