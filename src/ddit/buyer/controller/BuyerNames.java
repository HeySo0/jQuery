package ddit.buyer.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ddit.buyer.service.BuyerServiceImpl;
import ddit.buyer.service.IBuyerService;
import ddit.buyer.vo.BuyerVO;

/**
 * Servlet implementation class BuyerNames
 */
@WebServlet("/BuyerNames.do")
public class BuyerNames extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuyerNames() {
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 0. 클라이언트 요청시 전송되는 데이터 받기
		
		// 1. service 객체 얻기
		IBuyerService service = BuyerServiceImpl.getInstance();
		
		// 2. service메소드 호출
		List<BuyerVO> buyerList = service.getBuyerNames();
		
		// 3. request객체에 결과값 저장
		request.setAttribute("buyerList", buyerList);
		
		// 4. 결과값 출력 - view페이지로 이동
		RequestDispatcher rd = request.getRequestDispatcher("0928/buyerNames.jsp");
		rd.forward(request, response);
	}

}
