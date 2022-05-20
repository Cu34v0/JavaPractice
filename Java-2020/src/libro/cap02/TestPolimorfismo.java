package libro.cap02;
import libro.cap02.fechas.Fecha;
import libro.cap02.misclases.FechaDetallada;

public class TestPolimorfismo {
	public static void main(String[] args) {
		
		Fecha fec = new FechaDetallada("25/02/2009");
		
		Object obj = new FechaDetallada("3/12/2008");
		
		System.out.println("fec = " + fec);
		System.out.println("obj = " + obj);
	}

}
