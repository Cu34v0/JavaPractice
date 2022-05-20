package libro.cap02.fechas;

public class TestFecha2 {
	public static void main(String[] args) {
		Fecha f1 = new Fecha(25,10,1994);

		Fecha f2 = new Fecha("25/10/1996");

		if (f1.equals(f2)) {
			System.out.println("Son iguales!");
		} else {
			System.out.println("Son diferentes");
		}
	}

}
