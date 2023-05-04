package board.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import board.domain.BoardDTO;
import board.service.BoardSearchService;
import board.service.BoardWriteService;
import board.util.BoardUploadUtils;

public class BoardSearchAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		//get
				String keyword = request.getParameter("keyword");
				String criteria = request.getParameter("criteria");
				
				BoardSearchService service = new BoardSearchService();
				List<BoardDTO> list = service.search(criteria, keyword);
				
				
				request.setAttribute("list", list);
				
				
				return new ActionForward(false, "listForm.jsp");
	}

}
