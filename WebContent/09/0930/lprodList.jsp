<%@page import="com.google.gson.Gson"%>
<%@page import="ddit.lprod.vo.LprodVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%-- 
<%
	List<LprodVO> lprodList = (List<LprodVO>)request.getAttribute("lprodList");
%>
[
	<%for(int i = 0; i <lprodList.size(); i++){
		LprodVO lprodVo = lprodList.get(i);
		if(i>0) out.print(",");
		%>
		{
			"lprod_gu" : "<%=lprodVo.getLprod_gu()%>",
			"lprod_nm" : "<%=lprodVo.getLprod_nm()%>"
		}
	<%} %>
]
--%>
<%
	// 서블릿에서 저장한 데이터 꺼내기
	List<LprodVO> lprodList = (List<LprodVO>)request.getAttribute("lprodList");
	
	Gson gson = new Gson();
	String result = gson.toJson(lprodList);
	
	out.print(result);
%>