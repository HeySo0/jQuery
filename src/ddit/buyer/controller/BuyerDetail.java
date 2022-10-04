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
@WebServlet("/BuyerDetail.do")
public class BuyerDetail extends HttpServlet{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuyerDetail() {
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 0. 클라이언트 요청시 전송되는 값을 받는다. = buyer_id
//		String id = request.getParameter("id");
		
		// 1. service 객체 얻기
		IBuyerService service = BuyerServiceImpl.getInstance();
		
		// 2. service메소드 호출 - 결과값 받기
//		BuyerVO vo = service.getBuyerDetail(id);
		BuyerVO vo = service.getBuyerDetail(request.getParameter("id"));
		
		// 3. request객체에 결과값 저장
		request.setAttribute("buyerDetail", vo);
		
		// 4. 결과값 출력 - view페이지로 이동
		// json데이터를 생성하여 클라이언트로 응답하기 위함
		RequestDispatcher rd = request.getRequestDispatcher("0928/buyerDetail.jsp");
		
		// html데이터를 생성하여 클라이언트로 응답하기 위함
//		RequestDispatcher rd = request.getRequestDispatcher("0929/buyerDetail.jsp");
		rd.forward(request, response);
	}

	
}
