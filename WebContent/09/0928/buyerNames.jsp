<%@page import="ddit.buyer.vo.BuyerVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	// servlet에서 저장된 결과값 꺼내기
	List<BuyerVO> buyerList = (List<BuyerVO>)request.getAttribute("buyerList");
%>
[
	<%for(int i = 0; i<buyerList.size(); i++){
			BuyerVO vo = buyerList.get(i);
			if(i>0) out.print(",");
	%>
	{
		"id" : "<%=vo.getBuyer_id()%>",
		"name" : "<%=vo.getBuyer_name()%>"
	}

	<%} %>
]