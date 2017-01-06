package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.OracleEmpDao;
import vo.Emp;

@WebServlet("/add")
public class EmpAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("viewUrl", "/emp/EmpAdd.jsp");
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			
			OracleEmpDao oracleEmpDao = new OracleEmpDao();
			
			Emp emp = (Emp) request.getAttribute("emp");
System.out.println(emp);
System.out.println(request.getAttribute("empno"));
			oracleEmpDao.insertEmp(emp);
			
			request.setAttribute("viewUrl", "redirect:list.do");
		}catch(Exception e){
			throw new ServletException(e);
		}
	}
}