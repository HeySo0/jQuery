<%@page import="com.google.gson.Gson"%>
<%@page import="ddit.prod.vo.ProdVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	// servlet에서 저장된 결과값 꺼내기
	ProdVO prodVo = (ProdVO)request.getAttribute("prodDetail");
%>
{
	"PROD_ID" : "<%=prodVo.getProd_id()%>",
	"PROD_NAME" : "<%=prodVo.getProd_name()%>",
	"PROD_LGU" : "<%=prodVo.getProd_lgu()%>",
	"PROD_BUYER" : "<%=prodVo.getProd_buyer()%>",
	"PROD_COST" : "<%=prodVo.getProd_cost()%>",
	"PROD_PRICE" : "<%=prodVo.getProd_price()%>",
	"PROD_SALE" : "<%=prodVo.getProd_sale()%>",
	"PROD_OUTLINE" : "<%=prodVo.getProd_outline()%>"
}
