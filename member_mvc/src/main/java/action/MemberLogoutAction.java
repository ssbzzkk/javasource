package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class MemberLogoutAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		// get/post 없음
		// service 필요없음(DB작업 없음)
		
		// session해제하는 작업만 하면 됨
		HttpSession session = request.getSession();
		session.removeAttribute("loginDto"); // or 세션 다날리려면 session.invalidate();
		//ActionForward :index.jsp로 
		return new ActionForward(true, "index.jsp");
	}

}
