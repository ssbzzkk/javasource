package exam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import user.domain.LoginDTO;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");

		String userid=request.getParameter("userid");
		String password=request.getParameter("password");
		
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		out.print("<h4>"+"아이디 : "+userid+ "</h4>");
		out.print("<h4>"+"비밀번호 : "+password+ "</h4>");
		
		//세션 저장
		HttpSession session = request.getSession();
		session.setAttribute("loginDTO", new LoginDTO(userid,password));
		
		//페이지 이동 코드
		out.print("<h4><a href=\"session/request2.jsp\">이동</a></h4>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		doGet(request, response);
	}

}
