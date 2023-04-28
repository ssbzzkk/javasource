package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import domain.ChangeDTO;
import domain.memberDTO;
import service.MemberChangeService;
import service.MemberLoginService;

public class MemberChangeAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		// post 넘어오는 값 가져오기
		ChangeDTO dto = new ChangeDTO();
		dto.setUserid(request.getParameter("userid"));
		dto.setCurrentPssword(request.getParameter("current-password"));
		dto.setNewPssword(request.getParameter("new-password"));
		dto.setConfirmPssword(request.getParameter("confirm-password"));
			
		// service, userid와 현재비밀번호를 가지고 일치하는 회원이 있는지 확인(해당 서비스 호출)
		MemberLoginService loginService = new MemberLoginService();
		memberDTO info = loginService.login(dto.getUserid(), dto.getCurrentPssword());
		
		String path = "";
		if(info!=null) {
			// 일치한다면 비번변경 서비스 호출 => 성공 시 세션 해제 후 로그인 페이지로 이동
			MemberChangeService changeService = new MemberChangeService();
			if(changeService.changePwd(dto)) {
				HttpSession session = request.getSession();
				session.invalidate();
				path = "login.jsp";
			}
		}else {
			// 일치하지 않다면 비번 변경 페이지로 되돌아가기
			path="changePwd.jsp";
		}
	
		return new ActionForward(true, path);
	}

}
