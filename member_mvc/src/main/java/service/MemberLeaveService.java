package service;

import domain.memberDTO;
import persistence.MemberDAO;

public class MemberLeaveService {
	public boolean leave(memberDTO dto) {
		return new MemberDAO().delete(dto);
	}
}
