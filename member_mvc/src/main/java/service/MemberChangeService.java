package service;

import domain.ChangeDTO;
import domain.memberDTO;
import persistence.MemberDAO;

public class MemberChangeService {
	public boolean changePwd(ChangeDTO dto) {
		return new MemberDAO().update(dto);
		
	}
}
