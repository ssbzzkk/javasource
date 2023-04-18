<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- JSP : Java Server Page
		   html 작성하기 편하게 되어 있음
		   자바 코드를 사용할 수 있음
		   
		   http://localhost:8080/web1/basic/hello.html
		   
		   프로젝트명 제거
		   http://localhost:8080/basic/hello.html
		   
		    http://localhost:8080 : 나중에 도메인명으로 변경될 부분
		      localhost == 127.0.0.1 == 내컴퓨터
		      8080 포트번호 ==>변경가능
		      
		    /web1 : 프로젝트명
		    /basic : webapp 폴더 아래에 생성한 폴더명
		    /hello.html : 파일명
 -->
 <%
 	// 자바코드 작성
 	//HttpServletRequest 객체 이용해서 사용자의 요청 가져오기 
 	// method=”post” 일때 한글은 깨짐, get으로 하면 안깨지고 주소줄에 따라감
 	
 	// 한글 안깨지게 데이터 가저오기 전에 제일 먼저 코딩(외우기)
 	request.setCharacterEncoding("utf-8"); 
 %>
 <h3>이름</h3>
 <%=request.getParameter("name")%>
 <%=request.getParameter("age")%>
 
 
 

</body>
</html>