import java.util.Scanner;

public class test {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        String nome, cognome;
        System.out.println("nome");
	nome = in.nextLine().toUpperCase();
        // codifica nome
        String codiceNome = "";
        for (int i = 0; i < nome.length(); i++) {
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
        System.out.println(codiceNome);
    }
}

