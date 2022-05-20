package libro.cap02.figuras;

public class Triangulo extends FiguraGeometrica{
	
	private double base;
	private double altura;
	
	public Triangulo(int b, int h) {
		super("Triangulo");
		base = b;
		altura = h;
	}
	
	public double area() {
		return base*altura/2;
	}

}
