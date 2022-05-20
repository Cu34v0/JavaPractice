package libro.cap04;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Collection;
import java.util.Vector;

import libro.cap03.demo.UConnection;

public class DeptDAO {
	
	public Collection<DeptDTO> buscarTodos(){
		
		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		try {
			
			con = UConnection.getConnection();
			String sql = "SELECT * FROM dept";
			
			pstm = con.prepareStatement(sql);
			
			rs = pstm.executeQuery();
			
			Vector<DeptDTO> ret = new Vector<DeptDTO>();
			DeptDTO dto = null;
			
			while (rs.next()) {
				
				dto = new DeptDTO();
				dto.setDeptno(rs.getInt("deptno"));
				dto.setDname(rs.getString("dname"));
				dto.setLoc(rs.getString("loc"));
				ret.add(dto);
			}
			
			return ret;
			
		} catch (Exception e) {
			
			e.printStackTrace();
			throw new RuntimeException();
		} finally {
			try {
				
				if( rs!=null ) rs.close();
				if( pstm!=null ) pstm.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
				throw new RuntimeException();
			}
		}
		
		
	}

}
