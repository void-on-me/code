


/*In una classe IV vi sono ragazzi di varie età. Realizzare un programma che, ricevuti in input le età degli
 * studenti, calcoli e stampi quanti sono gli studenti ancora minorenni.
 * */


import java.util.Scanner;
public class minorenni
{ public static void main (String [] args){
	Scanner scannerino = new Scanner(System.in);
	int minorenni = 0;
	int anni;
	int studenti = 0;
	System.out.println("quanti studenti ci sono nella classe?");
	studenti = scannerino.nextInt();
	int contatore = studenti;
	//chiedere età studenti
	 
	while(contatore > 0){
	System.out.println("quanti anni hai?");
	anni = scannerino.nextInt();
	contatore--;
	if(anni < 18){
	minorenni++;
	}
	}
	System.out.println("numero minorenni " + minorenni);
}
}





