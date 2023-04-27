package action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import domain.BookDTO;
import domain.SearchDTO;
import service.BookSearchService;

public class BookSearchAction implements BookAction {

	@Override
	public BookActionForward execute(HttpServletRequest request) throws Exception {
		//get
		String keyword = request.getParameter("keyword");
		String criteria = request.getParameter("criteria");
		
		BookSearchService service = new BookSearchService();
		List<BookDTO> list = service.list(keyword, criteria);
		
		SearchDTO searchDTO = new SearchDTO(keyword, criteria);
		
		//request.setAttribute("criteria", criteria);
		//request.setAttribute("keyword", keyword);
		request.setAttribute("searchDTO", searchDTO);
		request.setAttribute("list", list);
		
		
		return new BookActionForward(false, "list.jsp");
	}

}
