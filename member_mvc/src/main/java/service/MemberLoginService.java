package service;

import domain.memberDTO;
import persistence.MemberDAO;

public class MemberLoginService {
	public memberDTO login(String userid, String password) {
		MemberDAO dao = new MemberDAO();
		return dao.isLogin(userid, password);
	}
}
