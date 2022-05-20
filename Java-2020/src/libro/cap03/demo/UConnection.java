package libro.cap03.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;

public class UConnection {
	
	private static Connection con = null;
	
	public static Connection getConnection()
	{
		try {
			if (con == null) {
				
				// con esto determinamos cuando nalize el programa
				Runtime.getRuntime().addShutdownHook(new MiShDwnHook());
				
				ResourceBundle rb = ResourceBundle.getBundle("jdbc");
				String driver = rb.getString("driver");
				String url = rb.getString("url");
				String pwd = rb.getString("pwd");
				String usr = rb.getString("usr");
				
				Class.forName(driver);
				con = DriverManager.getConnection(url, usr, pwd);
			}
			return con;
		} catch (Exception e) {
			
			e.printStackTrace();
			throw new RuntimeException("Error al crear la conexión", e);
		}
	}
	
	static class MiShDwnHook extends Thread{
		
		// justo antes de nalizar el programa la JVM invocara
		// a este metodo donde podemos cerrar la conexion
		
		public void run() {
			try {
				Connection con = UConnection.getConnection();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
				throw new RuntimeException();
			}
		}
	}

}
