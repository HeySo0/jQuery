<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 클라이언트 요청시 전송데이터 받기
	String userId = request.getParameter("id");
	String userPass = request.getParameter("pass");
	
	
	
	// db를 이용하여 crud 처리
	// 처리결과값을 출력 - 텍스트 기반의 json object 데이터를 생성 - client로 전달
%>

{
	"tel" : "010-1111-1111",
	"email" : "aaa1111@naver.com",
	"addr" : "대전광역시"
}