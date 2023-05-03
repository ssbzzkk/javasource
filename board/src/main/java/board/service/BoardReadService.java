package board.service;

import board.domain.BoardDTO;
import board.persistence.BoardDAO;

public class BoardReadService {
	public BoardDTO read(int bno) {
		
		//조회수 증가하는 dao매소드 부르기
		BoardDAO dao = new BoardDAO();		
		return dao.getRow(bno);
	}
}
