package libro.cap04;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Collection;
import java.util.Vector;

import libro.cap03.demo.UConnection;

public class EmpDAO {
	public Collection<EmpDTO> buscarXDept(int deptno) {
		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;

		try {
			con = UConnection.getConnection();
			String sql = "";
			sql += "SELECT empno, ename, hiredate, deptno ";
			sql += "FROM emp ";
			sql += "WHERE deptno = ?";

			pstm = con.prepareStatement(sql);
			pstm.setInt(1, deptno);
			rs = pstm.executeQuery();

			Vector<EmpDTO> ret = new Vector<EmpDTO>();
			EmpDTO dto = null;

			while (rs.next()) {
				dto = new EmpDTO();
				dto.setEmpno(rs.getInt("empno"));
				dto.setEname(rs.getString("ename"));
				dto.setHiredate(rs.getDate("hiredate"));
				dto.setDeptno(rs.getInt("deptno"));
				ret.add(dto);
			}
			return ret;

		} catch (Exception e) {

			e.printStackTrace();
			throw new RuntimeException();
		} finally {

			try {

				if (rs != null)
					rs.close();
				if (pstm != null)
					pstm.close();

			} catch (Exception e2) {
				e2.printStackTrace();
				throw new RuntimeException();
			}
		}
	}
}
