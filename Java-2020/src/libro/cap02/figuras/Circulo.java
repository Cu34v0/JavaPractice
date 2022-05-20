package libro.cap02.figuras;

public class Circulo extends FiguraGeometrica{
	
	private int radio;
	
	public Circulo(int r) {
		super("Circulo");
		radio = r;
	}
	
	public double area() {
		return Math.PI*Math.pow(radio, 2);
	}

}
