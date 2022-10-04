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

@WebServlet("/prodList.do")
public class ProdList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//ProdDetail
		IProdService service = ProdServiceImpl.getInstance();
		
		ProdVO prodVo = service.selectProdDetail(request.getParameter("prod_id"));
		
		request.setAttribute("prodDetail", prodVo);
		
		RequestDispatcher rd = request.getRequestDispatcher("0930/prodDetail.jsp");
		
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//ProdNames
		IProdService service = ProdServiceImpl.getInstance();
		
		List<ProdVO> prodList = service.selectProdNames(request.getParameter("lprod_gu"));
		
		request.setAttribute("prodNames", prodList);
		
		RequestDispatcher rd = request.getRequestDispatcher("0930/prodNames.jsp");
		
		rd.forward(request, response);
	}

}
