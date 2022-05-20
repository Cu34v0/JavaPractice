package libro.cap02.colecciones;
import java.util.Collection;

public class TestVector {
	public static void main(String[] args) {
		
		Collection<String> coll =  UNombres.obtenerLista();
		
		for(String nom: coll)
		{
			System.out.println(nom);
		}
	}

}
