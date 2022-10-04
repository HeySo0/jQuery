<%@page import="ddit.buyer.vo.BuyerVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// servlet에서 저장된 결과값 꺼내기
	BuyerVO vo = (BuyerVO)request.getAttribute("buyerDetail");
%>

<table>
	<tr>
		<td>BUYER_ID</td>
		<td><%=vo.getBuyer_id()%></td>
	</tr>
	<tr>
		<td>BUYER_NAME</td>
		<td><%=vo.getBuyer_name()%></td>
	</tr>
	<tr>
		<td>BUYER_BANK</td>
		<td><%=vo.getBuyer_bank()%></td>
	<tr>
		<td>BUYER_BANKNO</td>
		<td><%=vo.getBuyer_bankno()%></td>
	</tr>
	<tr>
		<td>BUYER_BANKNAME</td>
		<td><%=vo.getBuyer_bankname()%></td>
	</tr>
	<tr>
		<td>BUYER_ZIP</td>
		<td><%=vo.getBuyer_zip()%></td>
	</tr>
	<tr>
		<td>BUYER_ADD1</td>
		<td><%=vo.getBuyer_add1()%></td>
	</tr>
	<tr>
		<td>BUYER_ADD2</td>
		<td><%=vo.getBuyer_add2()%></td>
	</tr>
	<tr>
		<td>BUYER_COMTEL</td>
		<td><%=vo.getBuyer_comtel()%></td>
	</tr>
	<tr>
		<td>BUYER_MAIL</td>
		<td><%=vo.getBuyer_mail()%></td>
	</tr>
</table>

