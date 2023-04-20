<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//cookie2에서 사용자가 선택한 값을 쿠키에 저장한 후 응답헤더에 
	//쿠키 붙여서 보내기
	
	Cookie cookie = new Cookie("language", request.getParameter("language"));
	//쿠키 만료 시간 (시간 미지정시 세션과 같은 개념(브라우저 열고 닫을때까지))
	cookie.setMaxAge(60*60*24);
	//사용자한테 응답 시 쿠키 전송
	response.addCookie(cookie);
	response.sendRedirect("cookie2.jsp");

%>