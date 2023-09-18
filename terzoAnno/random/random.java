import java.util.Random;
public class random {
  public static void main(String [] args){
    // Variables
    int [] randomNumbers = new int[5];
    int sum = 0;
    // Random
    Random ran = new Random();
    
    // Loop to fill the array with random numbers
    for (int i = 0; i < randomNumbers.length; i++){
      randomNumbers[i] = ran.nextInt();
      sum += randomNumbers[i];
    }
    
    // Final print
    System.out.println("sum of generated numbers: " + sum);
 }
}
