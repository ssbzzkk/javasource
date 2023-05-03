package board.action;

import javax.servlet.http.HttpServletRequest;

import board.domain.BoardDTO;
import board.service.BoardReadService;

public class BoardReadAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		//get 넘어오는거 가져오기
		int bno =Integer.parseInt(request.getParameter("bno"));
		
		//service작업
		BoardReadService service = new BoardReadService();
		BoardDTO dto = service.read(bno);
		
		request.setAttribute("dto", dto);

		//ActionForward , readForm.jsp로
		return new ActionForward(false, "readForm.jsp");
	}

}
