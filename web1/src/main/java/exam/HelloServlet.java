package exam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
<<<<<<< HEAD
 * 
 * jsp == servlet : 하는 일이(할수 있는 일 = 사용자 요청 처리하는것) 같음
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

		//기능이 정해져 있는 메소드 2개 꼭 받아야 함, 
	 	// Form에서 action get으로 줄때, 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		
		//화면에 보여주기?
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<h3> 이름 : "+name+"</h3>");
		out.print("<h3> 나이 : "+age+"</h3>");
	}

	//action 을 post로 줄때
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		doGet(request, response);
		
	}

}
