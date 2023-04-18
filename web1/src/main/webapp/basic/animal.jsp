<<<<<<< HEAD
<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- jsp 주석, jsp 파일에선 안보임, java코드도 안보임 --%>
<!-- html주석 ,jsp파일 안 소스보기에서 보임-->
<%
	request.setCharacterEncoding("utf-8");
	//String animals = request.getParameter("animal");
	//getParameter는 맨앞 하나만 가져옴
	String animals[] = request.getParameterValues("animal");
	
	out.print("<h3>"+Arrays.toString(animals)+"</h3>");
	//브라우저에 보여주기 <%= %, out.print( );
%>
<%--
<h3><%=Arrays.toString(animals)%></h3>
	//배열 주소가 아닌 값 나오게 하기=>Arrays.toString, 싫으면 for문 
--%>
   


</body>
</html>