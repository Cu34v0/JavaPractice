package libro.cap02.excepciones;

public class TestLogin {
	public static void main(String[] args) {
		
		try {
			Aplicacion app = new Aplicacion();
			
			// intento el login
			Usuario u = app.login("juan", "juan123sito");
			
			// muestro el resultado
			System.out.println(u);
		} catch (ErrorFisicoException e) {
			// ocurrió un error
			
			System.out.println("Servicio temporalmente interrumpido");
			System.out.println(e.getMessage());
		}
	}

}
