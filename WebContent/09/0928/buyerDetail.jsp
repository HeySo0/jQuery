<%@page import="ddit.buyer.vo.BuyerVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// servlet에서 저장된 결과값 꺼내기
	BuyerVO vo = (BuyerVO)request.getAttribute("buyerDetail");
%>
{
	"BUYER_ID" : "<%=vo.getBuyer_id()%>",
	"BUYER_NAME" : "<%=vo.getBuyer_name()%>",
	"BUYER_LGU" : "<%=vo.getBuyer_lgu()%>",
	"BUYER_BANK" : "<%=vo.getBuyer_bank()%>",
	"BUYER_BANKNO" : "<%=vo.getBuyer_bankno()%>",
	"BUYER_BANKNAME" : "<%=vo.getBuyer_bankname()%>",
	"BUYER_ZIP" : "<%=vo.getBuyer_zip()%>",
	"BUYER_ADD1" : "<%=vo.getBuyer_add1()%>",
	"BUYER_ADD2" : "<%=vo.getBuyer_add2()%>",
	"BUYER_COMTEL" : "<%=vo.getBuyer_comtel()%>",
	"BUYER_MAIL" : "<%=vo.getBuyer_mail()%>"
}
