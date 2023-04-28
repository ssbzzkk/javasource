package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import domain.memberDTO;
import service.MemberLeaveService;

public class MemberLeaveAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		memberDTO dto = new memberDTO();
		
		dto.setUserid(request.getParameter("userid"));
		dto.setPassword(request.getParameter("password"));
		
		MemberLeaveService service = new MemberLeaveService();
		boolean leaveFlag = service.leave(dto);

		//탈퇴 성공시 세션 해제 index.jsp
		String path = "";
		if(leaveFlag) {
			HttpSession session = request.getSession();
			session.invalidate();
			path = "index.jsp";
			
		}else{
			path="leave.jsp";
	}
		return new ActionForward(true, path);
		
	}
}
