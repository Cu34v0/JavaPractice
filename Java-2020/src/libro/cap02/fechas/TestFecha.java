package libro.cap02.fechas;

public class TestFecha {
	public static void main(String[] args) {
		Fecha f = new Fecha(9,2,2000);
		f.setDia(2);
		f.setMes(10);
		f.setAnio(1970);
		
		System.out.println("Día: " + f.getDia());
		System.out.println("Mes: " + f.getMes());
		System.out.println("Anio: " + f.getAnio());
		
		System.out.println(f);
	}

}
