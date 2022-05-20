package libro.cap02.colecciones;

public class TestPila {
	public static void main(String[] args) {
		
		// utilizaremos una pila de Integer
		MiPila<Integer> c = new MiPila<Integer>();
		
		c.apilar(1);
		c.apilar(2);
		c.apilar(3);
		
		System.out.println(c.desapilar()); // saca el 3
		System.out.println(c.desapilar()); // saca el 2
		
		c.apilar(4);
		
		System.out.println(c.desapilar()); // saca el 4
		System.out.println(c.desapilar()); // saca el 1
	}

}
