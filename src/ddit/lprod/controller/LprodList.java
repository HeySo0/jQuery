package ddit.lprod.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ddit.lprod.service.ILprodService;
import ddit.lprod.service.LprodServiceImpl;
import ddit.lprod.vo.LprodVO;

@WebServlet("/lprodList.do")
public class LprodList extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ILprodService service = LprodServiceImpl.getInstance();
		
		List<LprodVO> lprodVo = service.lprodList();
		
		request.setAttribute("lprodList", lprodVo);
		
		RequestDispatcher rd = request.getRequestDispatcher("0930/lprodList.jsp");
		
		rd.forward(request, response);
	}

}
