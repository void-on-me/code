import java.util.Scanner;
public class torino 
{	public static void main (String [] args){
		Scanner in = new Scanner(System.in);
		double nStudenti, comune;
		double torino = 0;
		System.out.println("inserire quanti alunni");
			nStudenti = in.nextDouble();
		for(double x = nStudenti; x != 0; x--){
		System.out.println("inserire 1 per torino e 0 per altro");
		        comune = in.nextDouble();
		if(comune == 1){
		torino++; 
	}
}
	System.out.println("totale studenti " + nStudenti);
	System.out.println( "abitanti di torino " + torino);
	double perc = (nStudenti * torino) / 100;
	System.out.println("percentuale dei torinesi sul totale " + perc);
	
	

}
}
