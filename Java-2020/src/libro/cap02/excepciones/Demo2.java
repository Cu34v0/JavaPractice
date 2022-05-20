package libro.cap02.excepciones;

public class Demo2 {
	public static void main(String[] args) {
		
		try {
			int i = Integer.parseInt("no es una cadena numérica...");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Entré al catch...");
		} finally {
			System.out.println("Esto sale siempre");
		}
	}

}
