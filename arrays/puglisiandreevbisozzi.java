import java.util.Scanner;
public class puglisiandreevbisozzi {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        int[] arrayA = new int[s.nextInt()];
        int[] arrayB = new int[arrayA.length];
        for(int i =0; i < arrayA.length; i++){
            System.out.println("inserisci elementi nell array");
            arrayA[i]= s.nextInt();
            if(arrayA[i] < 0){
                arrayB[i] = arrayA[i] - 10;
            }
            else if(arrayA[i] > 0){
                arrayB[i] = arrayA[i] + 10;
            }
            else{
                arrayB[i] = arrayA[i];
            }
            }

        for(int i = 0 ; i < arrayB.length; i++){
            System.out.println("valore secondo array: " + arrayB[i]);
        }
        
    }
}
