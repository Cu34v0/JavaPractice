package libro.cap02.misclases;

public class FechaHora extends FechaDetallada {

	private int hora;
	private int minuto;
	private int segundo;

	public FechaHora(String sFecha, int hora, int min, int seg) {
		super(sFecha);
		setHora(hora);
		setMinuto(min);
		setSegundo(seg);
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}

	public String toString() {
		return super.toString() + " (" + hora + ":" + minuto + ":" + segundo + ")";
	}

}
