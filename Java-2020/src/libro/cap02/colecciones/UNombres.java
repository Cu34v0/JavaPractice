package libro.cap02.colecciones;
import java.util.Collection;
import java.util.Vector;

public class UNombres {
	
	public static Collection<String> obtenerLista()
	{
		Vector<String> v = new Vector<String>();
		v.add("Pablo");
		v.add("Juan");
		v.add("Carlos");
		return v;
	}

}
