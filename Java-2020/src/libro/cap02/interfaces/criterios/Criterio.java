package libro.cap02.interfaces.criterios;

public abstract class Criterio<T> {
	
	public abstract int comparar(T a, T b);

}
