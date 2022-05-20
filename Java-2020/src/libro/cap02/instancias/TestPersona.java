package libro.cap02.instancias;

import libro.cap02.misclases.FechaDetallada;

public class TestPersona {
	public static void main(String[] args) {
		
		Persona p1 = new Persona("Juan"
								 , "21773823"
								 , new FechaDetallada(23, 3, 1971));
		
		Persona p2 = new Persona("Pablo"
								, "19234452"
								, new FechaDetallada(12, 6, 1968));
		
		System.out.println(p1);
		System.out.println(p1);
		System.out.println(p1);
		
		System.out.println("---");
		
		System.out.println(p2);
		System.out.println(p2);
		
		System.out.println("---");
		
		System.out.println(p1);
		System.out.println(p1);
	}

}
