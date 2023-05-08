package board.action;

import javax.servlet.http.HttpServletRequest;

import board.domain.BoardDTO;
import board.domain.PageDTO;
import board.service.BoardReadService;

public class BoardReadAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		//get 넘어오는거 가져오기
		int bno =Integer.parseInt(request.getParameter("bno"));
		
		//페이지 나누기 정보
				String criteria=request.getParameter("criteria");
				String keyword =request.getParameter("keyword");
				int page=Integer.parseInt(request.getParameter("page"));
				int amount  =Integer.parseInt(request.getParameter("amount"));
				PageDTO pageDTO = new PageDTO(criteria, keyword, page,amount);
		
		//service작업
		BoardReadService service = new BoardReadService();
		BoardDTO dto = service.read(bno);
		
		request.setAttribute("dto", dto);
		request.setAttribute("pageDTO", pageDTO);

		//ActionForward , readForm.jsp로
		return new ActionForward(false, "readForm.jsp");
	}
}
