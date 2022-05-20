package libro.cap02.estaticas;

public class TestNumero {
	public static void main(String[] args) {
		
		double d = Numero.sumar(2, 3);
		System.out.println(d);
		
		Numero n1 = new Numero(5);
		n1.sumar(4);
		
		System.out.println(n1);
		
		n1.sumar(4).sumar(6).sumar(8).sumar(1);
		System.out.println(n1);
	}

}
