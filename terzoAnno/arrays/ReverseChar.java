import java.util.Scanner;
public class ReverseChar {
  public static void main(String[] args) {
    System.out.println("inserisci una stringa");
    Scanner in = new Scanner(System.in);

    String txt = in.nextLine();
    char[] arr = txt.toCharArray();
    for (int i = arr.length; i > 0; i--){
      System.out.print(arr[i - 1]);
    }
  }
}
