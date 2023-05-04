package board.service;

import board.domain.BoardDTO;
import board.persistence.BoardDAO;

public class BoardReplyService {

	public boolean reply(BoardDTO boardDTO) {
		return new BoardDAO().reply(boardDTO);
	}
}
