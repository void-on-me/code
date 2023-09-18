import java.util.Scanner;
import java.net.URL;
import java.io.File;

class scaricaFile  {
    public static void main(String[] args) {
       String meb;
        try{
        URL percorso = new URL("https://www.google.it/");
       
        
        Scanner in = new Scanner(percorso.openStream());
        
        while (in.hasNextLine()){
        meb = in.nextLine();
        System.out.println("meb:"+meb);
        
            
        }
        
        in.close();    
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
        
    }
}
