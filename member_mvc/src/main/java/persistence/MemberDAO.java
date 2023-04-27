package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import domain.memberDTO;

public class MemberDAO {
	
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
	
	//로그인
	//아이디와 비밀번호 일치하면 아이디와 이름만 추출
	// select userid, name from membertbl where userid=? and password=?
	// 결과가 하나만 나오면 됨
	//메소드명 isLogin(){}
	
	public memberDTO isLogin(String userid, String password) {
		memberDTO dto = null;
		try {
			con = getConnection();
			
			String sql = "select userid, name from membertbl where userid=? and password=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userid);
			pstmt.setString(2, password);
			
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				dto = new memberDTO();
				dto.setUserid(rs.getString("userid"));
				dto.setName(rs.getString("name"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			close(con, pstmt, rs);;
		}
		return dto;
	}
	
	//회원가입
	public boolean register(memberDTO registerDto) {
		boolean registerFlag=false;
		try {
			con = getConnection();
			
			String sql = "insert into membertbl values(?,?,?,?,?)";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, registerDto.getUserid());
			pstmt.setString(2, registerDto.getPassword());
			pstmt.setString(3, registerDto.getName());
			pstmt.setString(4, registerDto.getGender());
			pstmt.setString(5, registerDto.getEmail());
			
			int result = pstmt.executeUpdate();
			
			if(result>0) {
				registerFlag=true;
				commit(con);
			}
			
		} catch (Exception e) {
			rollback(con);
			e.printStackTrace();
		}
		finally {
			close(con, pstmt);
		}
		return registerFlag;
	}
	
	
}






































