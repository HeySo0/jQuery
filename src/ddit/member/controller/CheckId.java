package ddit.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ddit.member.service.IMemberService;
import ddit.member.service.MemberServiceImpl;

@WebServlet("/idCheck.do")
public class CheckId extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		IMemberService service = MemberServiceImpl.getInstance();
		
		String result = service.searchId((String) request.getAttribute("userId"));
		
		request.setAttribute("userId", result);
		
		request.getRequestDispatcher("1004/checkId.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
