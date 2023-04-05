import java.util.Random;
public class SommaPrecedenti {
  public static void main(String[] args) {
    // dichiaro alcune variabili
    final int length = 10;
    int[] array = new int[length];
    String check = "false";

    Random ran = new Random();

    // genera randomicamente degli interi da 0 a 100 per non essagerare
    for(int i = 0; i < length; i++){
      array[i] = ran.nextInt(100); 
    }

    // fa il controllo delle somme che vengono calcolate a ogni index 
    for(int i = 0; i < length; i++){
      int contatore = length - 1;
      int sum = 0;
      while (contatore == i++) {
        sum += array[contatore];
        contatore--;
      }
      if (array[i] > sum) {
        check = "true";
      }
      else{
        check = "false";
      }
    }

    // lo switch statement non funziona con il boolean per questo uso String 
    switch (check) {
      case "false":
        System.out.println("ogni valore presente nell’array è minore della somma dei numeri presenti");
        break;

      default:
        System.out.println("non tutti i valori sono sono minori della somma dei numeri che lo precedono");
        break;
    }
  }
}
