package service;

import java.util.List;

import domain.BookDTO;
import persistence.BookDAO;

//~~ service : 비즈니스 로직 처리
//				insert, update, delete, select 처리를 위한 메소드 호출

public class BookListService {
	//BookDAO 의 getList 호출해야함
	//메소드 마음대로 만들기
	public List<BookDTO> list() {
		BookDAO dao = new BookDAO();
		List<BookDTO> list=dao.getList();
		
		return list;
	}
}
