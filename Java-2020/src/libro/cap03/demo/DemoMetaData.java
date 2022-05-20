package libro.cap03.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;


public class DemoMetaData 
{
	public static void main(String[] args) 
	{
		Connection con = null;
		ResultSet rs = null;
		PreparedStatement pstm = null;
		
		try 
		{
			// obtengo la conexión
			con = UConnection.getConnection();
			
			String sql = "";
			sql+="SELECT e.empno AS empno";
			sql+="     , e.ename AS ename";
			sql+="	   , e.hiredate AS fecha";
			sql+="	   , e.deptno AS deptno";
			sql+="	   , d.dname AS dname";
			sql+="	   , d.loc AS loc ";
			sql+="FROM emp e, dept d ";
			sql+="WHERE e.deptno = d.deptno";
			
			pstm = con.prepareStatement(sql);
			rs = pstm.executeQuery();
			
			ResultSetMetaData md = rs.getMetaData();
			// muestro la metadata
			_mostrarMetaData(md);
			
			// muestro las filas del result set
			_mostrarData(rs);
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	private static void _mostrarMetaData(ResultSetMetaData md) throws Exception
	{
		// cantidad de columnas del resultset
		int cantCols = md.getColumnCount();
		
		System.out.println(cantCols + " columnas obtenidas");
		System.out.println();
		
		for(int i=1; i<=cantCols; i++)
		{
			System.out.print("Columna Nro. " + i + ", ");
			
			// label (alias o nombre ) de la i-esima columna
			System.out.print("Label: " + md.getColumnLabel(i)+ ", ");
			
			// código de tipo de dato de la i-esima columna
			System.out.println("Type: " + md.getColumnType(i));
			
			// nombre del tipo de datos de la i-esima columna
			System.out.println(md.getColumnTypeName(i) + "), ");
			
			// presición del tipo de datos de la i-esima columna
			System.out.println("Precisión: " + md.getPrecision(i));
		}
		System.out.println();
	}
	
	private static void _mostrarData(ResultSet rs) throws Exception
	{
		int cantCols = rs.getMetaData().getColumnCount();
		while(rs.next()) 
		{
			for(int i=1; i<=cantCols;i++)
			{
				System.out.println( rs.getString(i));
				System.out.println( i<cantCols?" ,":" ");
			}
			System.out.println();
		}
		
	}
}
