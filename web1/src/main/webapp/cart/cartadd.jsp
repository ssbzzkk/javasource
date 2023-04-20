<%@page import="java.util.ArrayList"%>
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
<%
	//cart.html에서 사용자가 선택한 자동차 가져오기
	String product = request.getParameter("product");

	// 가져온 자동차 정보를 session 에 저장
	// session에 ArrayList사용	
	// 자동차를 추가하기 전에 이미 생성된 List session 이 존재하는지 확인
	
	ArrayList<String> products = (ArrayList<String>)session.getAttribute("products");
	
	if(products ==null){
		products = new ArrayList<>();
		products.add(product);
		session.setAttribute("products", products);
	}else{
	// 존재한다면 해당 session에 선택한 자동차 추가
		products.add(product);		
	}
	
	//session.setAttribute("product", product);

	
	//배열 : 같은 타입의 데이터를 여러개 담아서 하나로 처리
	//   == List 
	//		순서 ==> index로 접근 가능
%>
	<h3>장바구니 저장</h3>
	<h4><a href="cartlist.jsp">장바구니 보기</a></h4>
</body>
</html>