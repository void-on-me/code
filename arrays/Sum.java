import java.util.Random;
public class Sum {
    public static void main(String[] args) {
        Random r = new Random();
        int [][] matrix = new int [3][3];
        int sum = 0; 
        for(int i = 0; i < 3; i++){
            for(int c = 0; c < 3; c++){
                matrix[i][c] = r.nextInt(50);
                sum += matrix[i][c]; 
            }
        }
        System.out.println("somma di tutti gli elementi " + sum);
    }
    
}