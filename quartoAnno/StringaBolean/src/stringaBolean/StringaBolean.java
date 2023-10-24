package stringaBolean;

public class StringaBolean {

	static String string(boolean scelta, String stringa) {
		if (scelta) {
			// pari
			String pariStr = "";
			for (int i = 0; i < stringa.length(); i+= 2) {
				pariStr += stringa.charAt(i);
			}
			return pariStr;
		}
		else {
			// dispari
			String dispariStr = "";
			for (int i = 1; i < stringa.length(); i+= 2) {
				dispariStr += stringa.charAt(i);
			}
			return dispariStr;
		}
	}
	
	public static void main(String[] args) {
		boolean bool = true;
		System.out.println(string(bool, "hello"));		
	}

}
