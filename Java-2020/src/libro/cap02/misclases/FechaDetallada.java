package libro.cap02.misclases;
import libro.cap02.fechas.Fecha;

public class FechaDetallada extends Fecha{
	
	public FechaDetallada(int dia, int mes, int anio) {
		super(dia, mes, anio);
	}
	
	public FechaDetallada() {
		super(0, 0, 0);
	}
	
	public FechaDetallada(String s) {
		super(s);
	}
	
	private static String meses[] = { "Enero"
									  ,"Febrero"
									  ,"Marzo"
									  ,"Abril"
									  ,"Mayo"
									  ,"Junio"
									  ,"Julio"
									  ,"Agosto"
									  ,"Septiembre"
									  ,"Octubre"
									  ,"Noviembre"
									  ,"Diciembre"
	};
	
	public String toString() {
		return getDia() + " de " + meses[getMes()-1] + " del " + getAnio();
	}

}
