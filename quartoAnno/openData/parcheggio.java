package parcheggioRoma;

import java.util.Scanner;
import java.net.URL;
import java.io.File;
import java.io.IOException;

public class parcheggio {

	public static void main(String[] args) {
		String parcheggi;
		
		try {
			URL strisceBlu = new URL ("https://dati.comune.roma.it/catalog/dataset/6b48fdc5-fa88-41bd-92b9-47588e26f0df/resource/709d9d71-512a-4aa2-81ca-2b6064d50102/download/strisce_blu.csv");
			Scanner scan = new Scanner(strisceBlu.openStream());
			
			while (scan.hasNextLine()) {
				parcheggi = scan.nextLine();
				
				System.out.println(parcheggi);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
