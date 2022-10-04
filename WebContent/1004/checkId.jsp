<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// 서블릿에서 저장된 데이터 꺼내기
String result = (String)request.getAttribute("userId");

if(result != null){%>

	{
	"flag" : "false"
	}
	
<%}else{%>

	{
	"flag" : "true"
	}
	
<%}%>