package libro.cap02.instancias;

import libro.cap02.fechas.Fecha;
import libro.cap02.misclases.FechaDetallada;

public class Persona {
	
	private String nombre;
	private String dni;
	private Fecha fechaNacimiento;
	
	private int cont = 0;
	
	public Persona(String nombre, String dni, Fecha fecNac) {
		this.nombre = nombre;
		this.dni = dni;
		this.fechaNacimiento = fecNac;
	}
	
	public String toString() {
		cont++;
		return nombre + ", DNI: " + dni
					  + ", nacido el: " + fechaNacimiento
					  + " (" + cont + ")";
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public Fecha getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public void setFechaNacimiento(Fecha fecNac) {
		this.fechaNacimiento = fecNac;
	}

}
