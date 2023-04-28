package action;

import javax.servlet.http.HttpServletRequest;

import domain.memberDTO;
import service.MemberRegisterService;

public class MemberRegisterAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		
		String userid = request.getParameter("userid");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String email = request.getParameter("email");
		
		memberDTO registerDto = new memberDTO(userid, password, name, gender,email);
		
		//service
		MemberRegisterService service = new MemberRegisterService();
		boolean registerFlag = service.register(registerDto);
		
		//회원가입 성공시 로그인 페이지 
		String path ="";
		if(registerFlag) {
			path = "login.jsp";
		}else {
			path="register.jsp";
		}
		//ActionForward
		return new ActionForward(true,path);
	}

}
