package libro.cap02;
import libro.cap02.fechas.Fecha;
import libro.cap02.misclases.FechaDetallada;

public class TestMuestraConjunto {
	public static void main(String[] args) {
		
		Object[] arr = { new Fecha(2, 10, 1970)
						, new FechaDetallada("23/12/1948")
						, new String("Esto es una cadena")
						, new Integer(34)};
		
		MuestraConjunto.mostrar(arr);
	}
}
