package dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import vo.Emp;

public class OracleEmpDao implements EmpDao{
	
	SqlSession sqlSession;
	
	public SqlSessionFactory getSessionFactory() throws IOException{

		InputStream inputStream = Resources.getResourceAsStream("dao/mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory;

		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
		return sqlSessionFactory;
	}
	
	public List<Emp> selectList() throws Exception{

		try{
			sqlSession = getSessionFactory().openSession();
			return sqlSession.selectList("EmpDao.selectAllList");
		}finally{
			sqlSession.close();
		}
	}
	
	public Emp selectName(Emp emp) throws Exception{
		try{
			sqlSession = getSessionFactory().openSession();
			return sqlSession.selectOne("EmpDao.selectName", emp);
		}finally{
			sqlSession.close();
		}
	}
	
	public int insertEmp(Emp emp) throws Exception{
		try{
			sqlSession = getSessionFactory().openSession();
			return sqlSession.insert("EmpDao.insertEmp", emp);
		}finally{
			sqlSession.close();
		}
	}

}
