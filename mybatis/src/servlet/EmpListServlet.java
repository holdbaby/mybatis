package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.OracleEmpDao;

@WebServlet("/list")
public class EmpListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		OracleEmpDao oracleEmpDao = new OracleEmpDao();
		
		// request에 직원 목록 데이터 보관
		try {
			request.setAttribute("empList", oracleEmpDao.selectList());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		// JSP로 출력을 요청
		request.setAttribute("viewUrl", "/emp/EmpList.jsp");
		
	}
}