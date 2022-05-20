package libro.cap01.cadenas;

public class Cadenas2 {
	public static void main(String[] args) {
		String s = "Esto Es Una Cadena de caracteres";
		
		int pos1 = s.indexOf('C');
		int pos2 = s.lastIndexOf('C');
		int pos3 = s.indexOf('x');
		
		System.out.println(pos1);
		System.out.println(pos2);
		System.out.println(pos3);
	}

}
