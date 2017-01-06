package dao;

import java.util.List;
import vo.Emp;

public interface EmpDao {
	List<Emp> selectList() throws Exception;
	int insertEmp(Emp emp) throws Exception;
	Emp selectName(Emp emp) throws Exception;
}
