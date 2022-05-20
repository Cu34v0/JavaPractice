package libro.cap04;

import java.util.Collection;

public class Facade 
{
	public Collection<DeptDTO> obtenerDepartamentos()
	{
		DeptDAO deptDao = new DeptDAO();
		return deptDao.buscarTodos();
	}
	
	public Collection<EmpDTO> obtenerEmpleados(int deptno)
	{
		EmpDAO empDao = new EmpDAO();
		return empDao.buscarXDept(deptno);
	}
}
