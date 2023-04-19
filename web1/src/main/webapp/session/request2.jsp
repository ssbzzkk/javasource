<%@page import="user.domain.LoginDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>request2</h2>
	<%= session.getAttribute("name") %>
	<%--request1.jsp 가 받은 name 사용하고 싶음 : HttpSession 객체 사용
	
		1) 사용할 값을 담는다(값을 가져올수 있는곳에서) : setAttribute("키",담아놓을 값)  
		2) 필요한 페이지에서 꺼내 쓴다 : getAttribute("키")
	 --%>
	 
	 <%
	 	
	 	LoginDTO loginDTO = (LoginDTO)session.getAttribute("loginDTO");
	 
	 %>
	 
	 <h3>로그인 정보</h3>
	 <ul>
	 <%-- <li> 아이디 :<%= session.getAttribute("id") %> </li>
	 	  <li> 비밀번호 :<%= session.getAttribute("pwd") %> </li>--%>
	 	  <li> 아이디 :<%= loginDTO.getUserId() %> </li>	
	 	  <li> 비밀번호 :<%= loginDTO.getPassword() %> </li>	
	 </ul>
	
</body>
</html>