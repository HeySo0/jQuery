package ddit.prod.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ddit.prod.service.IProdService;
import ddit.prod.service.ProdServiceImpl;
import ddit.prod.vo.ProdVO;

@WebServlet("/prodDetail.do")
public class ProdDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IProdService service = ProdServiceImpl.getInstance();
		
		ProdVO prodVo = service.selectProdDetail(request.getParameter("prod_id"));
		
		request.setAttribute("prodDetail", prodVo);
		
		RequestDispatcher rd = request.getRequestDispatcher("0930/prodDetail.jsp");
		
		rd.forward(request, response);
	}

}
