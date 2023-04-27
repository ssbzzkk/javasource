package service;

import domain.memberDTO;
import persistence.MemberDAO;

public class MemberRegisterService {

	public boolean register(memberDTO registerDto) {
		MemberDAO dao = new MemberDAO();
		return dao.register(registerDto);
	}
	
}
