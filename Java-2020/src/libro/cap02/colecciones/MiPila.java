package libro.cap02.colecciones;

public class MiPila <T>
{
	// la capacidad inicial la hardcodeamos en esta constante
	private static final int capacidadInicial = 5;
	
	// instancio la coleccion que mantendra los datos de la pila
	private MiColeccion<T> coll = new MiColeccion<T>(capacidadInicial);
	
	// el metodo apilar recibe un parametro de tipo T
	public void apilar(T elm) {
		
		coll.insertar(elm, 0);
	}
	
	// el metodo desapilar retorna un elemento de tipo T
	public T desapilar() {
		return coll.eliminar(0);
	}
	
	
}
