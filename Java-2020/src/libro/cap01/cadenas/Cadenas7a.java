package libro.cap01.cadenas;

public class Cadenas7a {
	public static void main(String[] args) {
		String s = "Juan|Marcos|Carlos|Matias";
		String[] tokens = s.split("[|]");
		
		for (int i = 0; i < tokens.length; i++) {
			System.out.println(tokens[i]);
			
		}
	}

}
