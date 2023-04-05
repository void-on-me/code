import java.util.Scanner;
public class Bancomat
{
	public static void main(String[] args) {
	int banconoteDa50, ImportoVoluto, banconoteDa20, a;
	Scanner in = new Scanner(System.in);
	System.out.println("inserire l'importo voluto");	
		ImportoVoluto = in.nextInt();
	banconoteDa50 = ImportoVoluto / 50;
    a =  banconoteDa50 * 50;
    ImportoVoluto = ImportoVoluto - a;
    banconoteDa20 = ImportoVoluto / 20;
    System.out.println("banconote da 50 " + banconoteDa50);
    if(banconoteDa20 != 0){
    System.out.println("banconote da 20 " + banconoteDa20);   
        }
     }
}
