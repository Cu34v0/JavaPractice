package libro.cap03.demo;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class DemoSelect {
	public static void main(String[] args) {
		
		// parametros de la conexion
		String usr = "root";
		String pwd = "";
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/db_ejemplo";
		
		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		try {
			// -------------
			// ** PARTE 1 **
			// -------------
			
			// levanto el driver
			Class.forName(driver);
			
			// establezco la conexión
			con = DriverManager.getConnection(url, usr, pwd);
			
			// -------------
			// ** PARTE 2 **
			// -------------
			
			// defino un query
			String sql = "SELECT empno,ename,hiredate,deptno FROM emp";
			
			// preparo la sentencia que voy a ejecutar
			pstm = con.prepareStatement(sql);
			
			// ejecuto la sentencia y obtengo los resultados en rs
			rs = pstm.executeQuery();
			
			// itero los resultados (registros)
			while(rs.next()) {
				// muestro los campos del registro actual
				System.out.println(rs.getInt("empno") + ", ");
				System.out.println(rs.getString("ename") + ", ");
				System.out.println(rs.getDate("hiredate") + ", ");
				System.out.println(rs.getInt("deptno") + ", ");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally {
			try {
				// -------------
				// ** PARTE 3 **
				// -------------
				
				// cierro todos los recursos en orden inverso al que
				// fueron adquiridos
				if(rs != null) rs.close();
				if(pstm != null) pstm.close();
				if(con != null) con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
				throw new RuntimeException();
			}
		}
	}

}
