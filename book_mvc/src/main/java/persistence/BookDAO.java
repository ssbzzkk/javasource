package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import domain.BookDTO;

public class BookDAO {
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	//드라이버 로드
	
	
	//DB서버 연결
	public Connection getConnection() {
		
		try {
			Context ctx = new InitialContext();
			
			DataSource ds = (DataSource)ctx.lookup("java:comp/env/jdbc/myoracle");
			Connection con = ds.getConnection();
			//DML 실행 시 트랜잭션 관리를 직접 하겠음
			con.setAutoCommit(false);
			return con;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	//자원해제
	public void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		try {
			rs.close();
			pstmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void close(Connection con, PreparedStatement pstmt) {
		try {
			pstmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void commit(Connection con) {
		try {
			con.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void rollback(Connection con) {
		try {
			con.rollback();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//도서목록 조회
	public List<BookDTO> getList(){
		List<BookDTO> list = new ArrayList<>();
		
		try {
			con = getConnection();
			String sql = "select code, title, writer, price from booktbl order by code "; //desc 붙이면 내림차순
			pstmt = con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while (rs.next()) {
//				int code = rs.getInt("code");
//				String title = rs.getString("title");
//				String writer = rs.getString("writer");
//				int price = rs.getInt("price");
				
				//list.add(new BookDTO(code, title, writer, price));
				
				BookDTO dto = new BookDTO();
				dto.setCode(rs.getInt("code"));
				dto.setTitle(rs.getString("title"));
				dto.setWriter(rs.getString("writer"));
				dto.setPrice(rs.getInt("price"));
				list.add(dto);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
		 close(con, pstmt, rs);	
		}
		return list;
	}
	
	//도서 상세 조회
	//select*from booktbl where code=?
	
	public BookDTO getRow(int code) {
		BookDTO dto = null;
		
		try {
			con = getConnection();
			
			String sql = "select*from booktbl where code=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, code);
			
			rs=pstmt.executeQuery();
			
			if (rs.next()) {
				code = rs.getInt("code");
				String title=rs.getString("title");
				String writer=rs.getString("writer");
				int price=rs.getInt("price");
				String description = rs.getString("description"); 
				 dto = new BookDTO(code, title, writer, price, description);
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt, rs);;
		}
		return dto;
	}


	//도서정보 입력
	//insert into booktbl(code, title, writer, price) values(1001, '이것이 자바다', '신용균', 25000);
	// values(?,?,?,?,?)
	
	public boolean insert(BookDTO insertDto) {
		boolean flag=false;
		
		try {
			con=getConnection();
			String sql = "insert into booktbl(code, title, writer, price, description) ";
			sql += "values(?,?,?,?,?)";

			//sql구문 먼저 보내서 실행계획 세우기
			pstmt=con.prepareStatement(sql);
			//?해결
			pstmt.setInt(1,insertDto.getCode());
			pstmt.setString(2,insertDto.getTitle());
			pstmt.setString(3,insertDto.getWriter());
			pstmt.setInt(4,insertDto.getPrice());
			pstmt.setString(5,insertDto.getDescription());
			
			int result = pstmt.executeUpdate();
			
			if (result>0) {
				flag=true;
				commit(con);
			}
		} catch (Exception e) {
			rollback(con);
			e.printStackTrace();
		} finally {
			close(con, pstmt);
		}
		return flag;
	}
	
	//도서정보 수정(가격만)
	//update booktbl set price=? where code=?
	
	public boolean update(int code, int price) {
		boolean flag = false;
		try {
			con=getConnection();
			String sql="update booktbl set price=? where code=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, price);
			pstmt.setInt(2, code );
			int result = pstmt.executeUpdate();
			if(result>0) {
				flag=true;
				commit(con);
			}
		} catch (Exception e) {
			rollback(con);
			e.printStackTrace();
		}finally {
			close(con, pstmt);
		}
		return flag;
	}
	
	//도서정보 삭제
	// sql : delete from booktbl where code=?
	public boolean delete(int code) {
		boolean flag = false;
		try {
			con=getConnection();
			String sql="delete from booktbl where code=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, code);
			
			int result = pstmt.executeUpdate();
			if(result>0) {
				flag=true;
				commit(con);
			}
		} catch (Exception e) {
			rollback(con);
			e.printStackTrace();
		}finally {
			close(con, pstmt);
		}
		return flag;
	}
	
	//도서 검색
	public List<BookDTO> getSearchList(String criteria, String keyword ) {
		List<BookDTO> list = new ArrayList<>();	
		
		try {
			con = getConnection();
			//criteria value => writer or title
			String sql="select code,title,writer,price from booktbl where ";
			if(criteria.equals("writer")) {
				sql += "writer like ?";
			}else {
				sql += "title like ?";
			}
			
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, "%"+keyword+"%");
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				BookDTO dto = new BookDTO();
				dto.setCode(rs.getInt("code"));
				dto.setTitle(rs.getString("title"));
				dto.setWriter(rs.getString("writer"));
				dto.setPrice(rs.getInt("price"));
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt, rs);;
		}
		return list;
	}
}
	

	



















