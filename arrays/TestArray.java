public class TestArray 
{
  public static void main (String[] args){
    int listaNumeri[] = {1,2,3,4,1,1,7};
    System.out.println("Dimensione Array" + listaNumeri.length);

    for(int i = 0;i < listaNumeri.length;i++){
      System.out.println("elemento in posizione " + i + " è " + listaNumeri[i]);
    }
  }
}
