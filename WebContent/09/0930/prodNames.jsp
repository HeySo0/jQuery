<%@page import="com.google.gson.JsonElement"%>
<%@page import="com.google.gson.JsonObject"%>
<%@page import="com.google.gson.Gson"%>
<%@page import="ddit.prod.vo.ProdVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%-- 
<%
	List<ProdVO> prodList = (List<ProdVO>)request.getAttribute("prodNames");
%>
[
	<% 
	if(prodList!=null&&prodList.size()>0){
	for(int i =0; i<prodList.size(); i++){
		if(i>0) out.print(",");
	%>
	{
		"prod_id" : "<%=prodList.get(i).getProd_id()%>",
		"prod_name" : "<%=prodList.get(i).getProd_name()%>"
	}
	<%} }%>
]
--%>

<%--
<%
	List<ProdVO> prodList = (List<ProdVO>)request.getAttribute("prodNames");

	if(prodList!=null&&prodList.size()>0){
	Gson gson = new Gson();
	String result = gson.toJson(prodList);
	
	out.print(result);
	}
%>
--%>

<%-- --%>
<%
	List<ProdVO> prodList = (List<ProdVO>)request.getAttribute("prodNames");

	JsonObject obj = new JsonObject();

	if(prodList!=null&&prodList.size()>0){
		obj.addProperty("check","ok");
		Gson gson = new Gson();
		JsonElement jse = gson.toJsonTree(prodList);
		
		obj.add("prodList", jse);
	}else{
		obj.addProperty("check","no");
	}
	
	out.println(obj);
%>
<%-- --%>