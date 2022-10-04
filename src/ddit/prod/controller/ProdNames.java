package ddit.prod.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ddit.prod.service.IProdService;
import ddit.prod.service.ProdServiceImpl;
import ddit.prod.vo.ProdVO;

@WebServlet("/prodNames.do")
public class ProdNames extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IProdService service = ProdServiceImpl.getInstance();
		
		List<ProdVO> prodList = service.selectProdNames(request.getParameter("lprod_gu"));
		
		request.setAttribute("prodNames", prodList);
		
		RequestDispatcher rd = request.getRequestDispatcher("0930/prodNames.jsp");
		
		rd.forward(request, response);
	}


}
