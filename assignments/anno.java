import java.util.Scanner;

public class anno
{
	public static void main (String [] args){
		double anno, risultato;
		Scanner in = new Scanner(System.in);
		System.out.println("inserire l'anno");
			anno = in.nextDouble();
		if( anno % 4 == 0 && anno % 400 == 0){
			System.out.println("anno bisestile");
		}		
		else {
			System.out.println("anno secolare");
		}
	}

}


