<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	 <%
	 	request.setCharacterEncoding("utf-8"); 
		String name = request.getParameter("name");
	 
		//다른 페이지에서 사용할 수 있도록 name값을 session에 담는다
	 	// HttpSession session 내장 객체로 가지고 있기 때문에
	 	session.setAttribute("name",name); //파란색 name은 마음대로 써도됌
		
	 %>
	 <ul>
	 	<li>사용자 이름 : <%=request.getParameter("name") %></li>
	 </ul>
	 <a href="request2.jsp">이동</a>
</body>
</html>