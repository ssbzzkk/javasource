package service;

import java.util.List;

import domain.BookDTO;
import persistence.BookDAO;

public class BookSearchService {

		public List<BookDTO> list(String keyword, String criteria){
			
			
			
			BookDAO dao = new BookDAO();
			List<BookDTO> list=dao.getSearchList( criteria, keyword);
			
			return list;
		}
		
		
}
