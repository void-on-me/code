 import java.util.Scanner;
 public class Popolazione {
    public static void main(String[] args) {
       // Oggetti
        Scanner in = new Scanner(System.in);
       
        // Valore iniziale && valore finale 
        System.out.println("inserisci il valore iniziale della popolazione");
        int valoreIni = in.nextInt();
        System.out.println("inserisci valore finale popolazione");
        int valoreFin = in.nextInt();

        // Calcolo
        int anni = 0; 
        for (int i = 0;valoreIni < valoreFin; i++) {
           // Simulo il primo anno e moltiplico per raddoppiare
            valoreIni *= 2;
            anni++;
           
            // Fermo il programma se il valore raddoppiato basta
            if (valoreIni >= valoreFin) {
                break;
            }
           
            // simulo il secondo anno dividendo il valore raddoppiato 
            valoreIni -= valoreIni / 3;
            anni++;
        }
        
        System.out.println("Anni necessari per raggiungere il numero della popolazione stabilito è " + anni);
       
    }
    
 }