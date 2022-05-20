package libro.cap02.interfaces.criterios;

import libro.cap02.interfaces.Alumno;

public class CriterioAlumNotaProm extends Criterio<Alumno>{
	
	public int comparar(Alumno a, Alumno b) {
		double diff = a.getNotaPromedio()-b.getNotaPromedio();
		return diff>0 ? 1: diff<0 ? -1 : 0;
	}

}
