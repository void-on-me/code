import java.util.Scanner;
public class città{
public static void main (String [] args){
	Scanner in = new Scanner(System.in);
	int palermo = 923;
	int firenze = 277; 
	int milano = 574;
	int scelta;
	int tempo = 0;
	System.out.println("inserire la destinazione da Roma a Firennze(1), Palermo(2), Milano(3).");
	scelta = in.nextInt();
	switch(scelta){
	case 1:
		tempo = firenze / 120;
		break;
	case 2:
		tempo = palermo / 120;
		break;
	case 3:
		tempo = milano / 120;
		break;
	default:
		System.out.println("errore :/ riprova");
	}

	System.out.println("tempo stimato " + tempo + "h");
}
}
