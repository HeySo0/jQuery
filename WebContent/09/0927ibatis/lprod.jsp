<%@page import="ddit.lprod.vo.LprodVO"%>
<%@page import="java.util.List"%>
<%@page import="ddit.ibatis.config.sqlMapClientFactory"%>
<%@page import="com.ibatis.sqlmap.client.SqlMapClient"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 클라이언트 요청시 전송데이터 받기

// db를 이용하여 crud 처리

// SqlMapClient객체를 얻어온다
SqlMapClient smc = sqlMapClientFactory.getSqlMapClient();
// sql문 실행
List<LprodVO> lprodList = smc.queryForList("lprod.lprodList");
//
%>

[
	<%for(int i = 0; i <lprodList.size(); i ++) {
		LprodVO lprodVo = lprodList.get(i);
		if(i>0) out.print(",");
	%>
	{
		"id" : "<%=lprodVo.getLprod_id() %>",
		"gu" : "<%=lprodVo.getLprod_gu() %>",
		"nm" : "<%=lprodVo.getLprod_nm() %>"
	}
	<%} %>


]

