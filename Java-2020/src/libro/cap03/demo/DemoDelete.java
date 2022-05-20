package libro.cap03.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DemoDelete 
{
	public static void main(String[] args) 
	{
		Connection con = null;
		PreparedStatement pstm = null;
		
		try 
		{
			//obtengo la conexión
			con = UConnection.getConnection();
			
			// seteo el autocommit en false
			con.setAutoCommit(false);
			
			// defino y ejecuto la sentencia DELETE
			String sql = "DELETE FROM emp WHERE empno = ? ";
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, 70);
			int rtdo = pstm.executeUpdate();
			
			// se afecto una sola fila como esperabamos
			if (rtdo == 1) {
				
				// todo OK entonces commiteo la operación
				con.commit();
			} else {
				throw new RuntimeException("Error...");
			}
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		finally
		{
			try 
			{
				// rollback "por si las dudas"
				if(con != null) con.rollback();
				if(pstm != null) pstm.close();
			} catch (Exception e2) {
				e2.printStackTrace();
				throw new RuntimeException(e2);
			}
		}
	}

}
