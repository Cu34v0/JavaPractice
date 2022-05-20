package libro.cap02.interfaces.criterios;
import libro.cap02.interfaces.Alumno;

public class CriterioAlumNombre extends Criterio<Alumno>{
	
	public int comparar(Alumno a, Alumno b) {
		return a.getNombre().compareTo(b.getNombre());
	}

}
