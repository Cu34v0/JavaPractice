package libro.cap02.fechas;

public class Fecha {
	private int dia;
	private int mes;
	private int anio;

	private int fechaToDias() {
		return anio * 360 + mes * 30 + dia;
	}

	private void diasToFecha(int i) {

		// dividimos por 360 y obtenemos el año
		anio = (int) i / 360;

		// del resto de la division anterior
		// podremos obtener el mes y el dia
		int resto = i % 360;

		// el mes es el resto dividido 30
		mes = (int) resto / 30;

		// el resto de la division anterior son los dias
		dia = resto % 30;

		// ajuste por si dia quedo en cero
		if (dia == 0) {
			dia = 30;
			mes--;
		}

		// ajuste por si el mes quedo en cero
		if (mes == 0) {
			mes = 12;
			anio--;
		}
	}
	
	public void addDias(int d) {
		
		//convierto la fecha en días y le sumo 'd'
		int sum=fechaToDias()+d;
		
		// la fecha resultante (sum) la separo en dia, mes y anio
		diasToFecha(sum);
	}

	public Fecha(int d, int m, int a) {
		setDia(d);
		setMes(m);
		setAnio(a);
	}

	public Fecha() {

	}

	public Fecha(String s) {

		int pos1 = s.indexOf('/');
		int pos2 = s.lastIndexOf('/');

		String sDia = s.substring(0, pos1);
		dia = Integer.parseInt(sDia);

		String sMes = s.substring((pos1 + 1), pos2);
		mes = Integer.parseInt(sMes);

		String sAnio = s.substring(pos2 + 1);
		anio = Integer.parseInt(sAnio);

	}

	public boolean equals(Object o) {
		Fecha otra = (Fecha) o;
		return (dia == otra.dia) && (mes == otra.mes) && (anio == otra.anio);
	}

	public String toString() {
		return dia + "/" + mes + "/" + anio;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

}
