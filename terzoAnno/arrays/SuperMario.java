import java.util.Scanner;
public class SuperMario {
   public static void main(String[] args) {
   // Oggetti
   Scanner in = new Scanner(System.in);
   
   // Dati iniziali 
   System.out.println("inserisci la capacità del lavandino");
   double capacità = in.nextDouble();
   System.out.println("inserisci quanti cl al secondo il lavandino scarica l'acqua");
   double scarico = in.nextDouble();
   System.out.println("inserisci quanti cl di acqua fa cadere il rubinetto nel lavandino");
   double rubinetto = in.nextDouble(); 
   System.out.println("inserisci quanta acqua è già presente nel lavandino");
   double acquaPresente = in.nextDouble();
   System.out.println("━━━━━━ ◦❖◦ ━━━━━━");
   
   // Andamento
   int secondo = 1;
   for (int i = 0; i <  20; i++) {
      if (acquaPresente > capacità) {
         System.out.println("stai allagando casa!!");
         System.out.println("l'acqua ha strabordato");
         break;
      }
      else if (acquaPresente <= 0) {
        System.out.println("il lavandino è vuoto!");
        break; 
      } 
      else {
         if (i % 3 == 0 && i != 0) {
            acquaPresente += 3;
            System.out.println("il rubinetto gocciola");
         }
         acquaPresente -= scarico;
         System.out.println("il rubinetto scarica");
         if (acquaPresente > 0) {
            System.out.println("acqua presente nel lavandino: " + acquaPresente + "cl");
         }
         System.out.println("━━━━━━ ◦" + secondo + "◦ ━━━━━━");
         secondo++;
      }
   }

   } 
}
