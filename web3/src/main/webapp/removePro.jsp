
<%@page import="user.persistence.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	// 사용자 보는 페이지 아님
	//no 값 가져오기
	int no = Integer.parseInt(request.getParameter("no"));

	UserDAO dao = new UserDAO();
		
	String path="";
	if(dao.remove(no)){
		path="listPro.jsp";
	}else{
		path = "getPro.jsp?no="+no;
	}
	
	response.sendRedirect(path);
%>
	
	
	



