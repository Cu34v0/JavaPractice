package libro.cap01.cadenas;

public class Cadenas5 {
	public static void main(String[] args) {
		String s = "Un buen libro de Java, un buen material";
		
		int pos1 = s.indexOf("buen");
		int pos2 = s.lastIndexOf("buen");
		
		System.out.println(pos1);
		System.out.println(pos2);
	}

}
