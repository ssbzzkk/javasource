package action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import domain.BookDTO;
import service.BookListService;

public class BookListAction implements BookAction {

	@Override
	public BookActionForward execute(HttpServletRequest request) throws Exception {
		// get/post 가져오기 (list는 이 작없이 없어서 안함)
		// service에게 DB작업 부탁
		BookListService service = new BookListService();
		List<BookDTO> list = service.list();
		
		request.setAttribute("list",list); //=>forward
		
		return new BookActionForward(false, "list.jsp");
		
		
	}

}











