package libro.cap03.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	
	public static final String CONTROLADOR = "com.mysql.cj.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/db_ejemplo";
	public static final String USUARIO = "root";
	public static final String CLAVE = "";
	
	static {
		try {
			Class.forName(CONTROLADOR);
			
		} catch (ClassNotFoundException e) {

			System.out.println("Error al cargar el controlador");
			e.printStackTrace();
		}
	}
	
	public Connection conectar() {
		
		Connection conexion = null;
		
		try {
			

			conexion = DriverManager.getConnection(URL, USUARIO, CLAVE);
			
			System.out.println("Conexión OK");
			
		} catch (SQLException e) {
			System.out.println("Error en la conexión");
			e.printStackTrace();
		}
		
		return conexion;
	}
}
