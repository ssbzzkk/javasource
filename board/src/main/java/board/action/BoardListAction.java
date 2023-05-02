package board.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import board.domain.BoardDTO;
import board.service.BoardListService;

public class BoardListAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		// service작업만 (get이나 post 넘어오는게 없으니)
		BoardListService service = new BoardListService();
		List<BoardDTO> list = service.getList();
		
		request.setAttribute("list", list);
		// ActionForward : listForm.jsp
		
		return new ActionForward(false, "listForm.jsp");
	}

}
