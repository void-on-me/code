import java.util.Scanner;
import java.io.File;

public class codiceFiscale {
public static void main (String[] args){
	Scanner in = new Scanner(System.in);
	String nome, anno, codiceCatastale, comune;
	String codiceFiscale = "";
	String sgiorno = "Z";
	int mese = 0;
	int giorno = 0;
	char sesso;
	
	// dati comune	
	System.out.println("inserisci il comune");
	comune = in.nextLine().toUpperCase();

	// codifica nome
	System.out.println("inserisci il tuo nome: ");
	nome = in.nextLine().toUpperCase();
	String codiceNome = "";
	for (int i = 0; i < nome.length();i++){
		char c = nome.charAt(i);
		if (c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U') {
			codiceNome += c;
			if (codiceNome.length() == 3) {
			 break;
		}
	}
}

	if (codiceNome.length() < 3) {
	    for (int i = 0; i < nome.length(); i++) {
		char c = nome.charAt(i);
		if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
		    codiceNome += c;
		if (codiceNome.length() == 3) {
		break;
		}
	}
}
	int len = codiceNome.length();
		for (int i = len; i < 3; i++) {
    		codiceNome += "X";
	}
}
	// codifica cognome
	 System.out.println("inserisci il tuo cognome: ");
	 String cognome = in.nextLine().toUpperCase();
	 String codiceCognome = "";
         for (int i = 0; i < cognome.length(); i++) {
             char c = cognome.charAt(i);
             if (c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U') {
                 codiceCognome += c;
                 if (codiceCognome.length() == 3) {
                     break;
                 }
             }
         }
         if (codiceCognome.length() < 3) {
             for (int i = 0; i < cognome.length(); i++) {
                 char c = cognome.charAt(i);
                 if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                     codiceCognome += c;
                     if (codiceCognome.length() == 3) {
                         break;
                     }
                 }
             }
             int len = codiceCognome.length();
             for (int i = len; i < 3; i++) {
                 codiceCognome += "X";
             }
         }

	// sesso
	System.out.println("Inserisci il tuo sesso (M/F): ");
	sesso = in.nextLine().toUpperCase().charAt(0);
	
	// anno
	System.out.println("Inserisci il tuo anno di nascita: ");	
	anno = in.nextLine();
	
	// mese
	System.out.println("Inserisci il tuo mese di nascita (in formato numerico): ");
	mese = in.nextInt();
	String final_mese = "";
	switch (mese) {
	case 1:
		final_mese = "A";
		break;
	case 2:
		final_mese = "B";
		break;
	case 3:
		final_mese = "C";
		break;
	case 4:
		final_mese = "D";
		break;
	case 5:
		final_mese = "E";
		break;
	case 6:
		final_mese = "H";
		break;
	case 7:
		final_mese = "L";
		break;
	case 8:
        	final_mese = "M";
        	break;
	case 9:
        	final_mese = "P";
        	break;
	case 10:
        	final_mese = "R";
        	break;
	case 11:
		final_mese = "S";
		break;
	case 12:
		final_mese = "T";
		break;
	default:
		System.out.println("inserisci un mese valido");
}

	// giorno
	System.out.println("Inserisci il tuo giorno di nascita: ");
	giorno = in.nextInt();
	if (sesso == 'F'){
		giorno += 40;
	}	
	else if (sesso == 'M' && giorno < 10){
		sgiorno = '0' + Integer.toString(giorno);
	}
	
	// codice catastale 
	String codCat="";
	try {
		Scanner fileScanner = new Scanner(new File("comuni.txt"));
		fileScanner.useDelimiter("\r\n");
		while(fileScanner.hasNext()) {
			String s1 = fileScanner.nextLine();
			String s2 = s1.substring(0, s1.indexOf('-') - 1);
			if(s2.equalsIgnoreCase(comune)) {
				codCat = s1.substring(s1.lastIndexOf(' ') + 1);		 
				break;
			}
		}
		fileScanner.close();
	} catch(Exception ex) {
		ex.printStackTrace();
	}

	// codice fiscale
	if (sgiorno == "Z"){
	codiceFiscale += codiceCognome + codiceNome + anno.substring(2) + final_mese + giorno + codCat;
	}
	else{
	codiceFiscale += codiceCognome + codiceNome + anno.substring(2) + final_mese + sgiorno + codCat;
	}
	
	// codice di controllo

	// caratteri pari
	String pari = "";
	for (int i = 0; i < codiceFiscale.length(); i++) {
    		if((i + 1) % 2 == 0) {
        	pari += Character.toString(codiceFiscale.charAt(i));
    		}
	}

	// caratteri dispari
	String dispari = "";
	for (int i = 0; i < codiceFiscale.length(); i++) {
    		if ((i + 1) % 2 == 1) {
        	dispari += Character.toString(codiceFiscale.charAt(i));
    		}
	}
	
	// conversione valore dispari
	int rDispari = 0;

	        for (int i = 0; i < dispari.length(); i++) {
            char c = dispari.charAt(i);
            switch (c) {
                case '0':
                case 'A':
                    rDispari += 1;
                    break;
                case '1':
                case 'B':
                    rDispari += 0;
                    break;
                case '2':
                case 'C':
                    rDispari += 5;
                    break;
                case '3':
                case 'D':
                    rDispari += 7;
                    break;
                 case '4':
                 case 'E':
                     rDispari += 9;
                     break;
                 case '5':
                 case 'F':
                     rDispari += 13;
                     break;
                 case '6':
                 case 'G':
                     rDispari += 15;
                     break;
                 case '7':
                 case 'H':
                     rDispari += 17;
                     break;
                 case '8':
                 case 'I':
                     rDispari += 19;
                     break;
                 case '9':
                 case 'J':
                     rDispari += 21;
                     break;
                 case 'K':
                     rDispari += 2;
                     break;
                 case 'L':
                     rDispari += 4;
                     break;
                 case 'M':
                     rDispari += 18;
                     break;
                 case 'N':
                     rDispari += 20;
                     break;
                 case 'O':
                     rDispari += 11;
                     break;
                 case 'P':
                     rDispari += 3;
                     break;
                 case 'Q':
                     rDispari += 6;
                     break;
                 case 'R':
                     rDispari += 8;
                     break;
                 case 'S':
                     rDispari += 12;
                     break;
                 case 'T':
                     rDispari += 14;
                     break;
                 case 'U':
                     rDispari += 16;
                     break;
                 case 'V':
                     rDispari += 10;
                     break;
                 case 'W':
                     rDispari += 22;
                     break;
                 case 'X':
                     rDispari += 25;
                     break;
                 case 'Y':
                     rDispari += 24;
                     break;
                 case 'Z':
                     rDispari += 23;
                     break;
             }
         }

	// conversione valori pari
	int rPari = 0;

         for (int i = 0; i < pari.length(); i++) {
             char c = pari.charAt(i);
             int n = Character.getNumericValue(c);

             if (Character.isLetter(c)) {
                 n = c - 65;
                 rPari += n;
             } else {
                 rPari += n;
             }
         }

	// somma
	int somma = rDispari + rPari;
	int resto = (int) somma % 26;
	char restoConv = (char) (resto + 65);
	codiceFiscale += Character.toString(restoConv);





	System.out.println("il tuo codice fiscale è: " + codiceFiscale);
}
} 
