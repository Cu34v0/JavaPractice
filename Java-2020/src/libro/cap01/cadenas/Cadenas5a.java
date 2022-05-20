package libro.cap01.cadenas;

public class Cadenas5a {
	public static void main(String[] args) {
		//obtengo los milisegundos actual
		long hi = System.currentTimeMillis();
		
		//instancio un StringBuffer inicialmente vacio
		StringBuffer sb = new StringBuffer();
		
		//voy a concatenar n caracteres
		int n = 100000;
		
		char c;
		for (int i = 0; i < n; i++) {
			
			//obtengo un caracter entre 'A' y 'Z'
			c = (char)('A' + i%('Z' - 'A' + 1));
			sb.append(c);
		}
		
		//obtengo el milisegundo actual
		long hf = System.currentTimeMillis();
		
		//muestro la cadena resultante
		System.out.println(sb.toString());
		
		//muestro la cantidad de milisegundos insumidos
		System.out.println((hf - hi) + " milisegundos");
	}

}
