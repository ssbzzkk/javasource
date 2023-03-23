package database2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

// ~~~ DAO : DataBase 작업을 담당하는 클래스임 (개발자간 암묵적 약속)
public class DeptDao {
	
	private Connection con;
	private	PreparedStatement pstmt;
	private ResultSet rs;
	
	//커넥션을 위한 드라이버 로드(먼저해야함)
	static { //클래스가 시작하자마자 드라이버 로드됨
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//커넥션을 리턴하는 메소드
	public Connection getConnection() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "TIGER";
		
		
			try {
				con = DriverManager.getConnection(url, user, password);
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
			return con;
	}
	// close() : 자원닫기
	// 오버로딩 개념씀( 매소드 같은 이름)
	public void close(Connection con, PreparedStatement pstmt, ResultSet rs) { //resultset은 select를 했을때만
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
	
	
	// select - 하나
	public DeptDTO getRow(int deptno) {
		//커넥션 가져요기
		con = getConnection();
		
		// sql 구문 작성하기
		String sql = "select * from dept_temp where deptno=?";
		DeptDTO dto = null;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			rs = pstmt.executeQuery(); 
			
			if (rs.next()) {
				//System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
				//rs=> DeptDTO 에 담기
//				①
//				deptno = rs.getInt(1);
//				String dname = rs.getString(2);
//				String loc = rs.getString(3);
//				
//				 dto = new DeptDTO(deptno, dname, loc);	
//				②
//				return new DeptDTO(rs.getInt(1),rs.getString(2),rs.getNString(3));
				
//				③
				dto = new DeptDTO();
				dto.setDeptno(rs.getInt(1));
				dto.setDname(rs.getString(2));
				dto.setLoc(rs.getString(3));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}	
		return dto;
	}
	
	//select - all 개념
	public ArrayList<DeptDTO> getRows() {
		
		ArrayList<DeptDTO> list = new ArrayList<>();
		
		try {
			
			con = getConnection();
			
			String sql = "select * from dept_temp";
			
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
//				System.out.println(rs.getInt(1)+"\t"+rs.getString("dname")+"\t"+rs.getString("loc"));
//				①
//				int deptno = rs.getInt(1);
//				String dname = rs.getString(2);
//				String loc = rs.getString(3);
//				DeptDTO dto = new DeptDTO(deptno, dname, loc);
//				list.add(dto);
//				②
//				list.add(new DeptDTO(rs.getInt(1),rs.getString(2),rs.getString(3)));
//				③
				DeptDTO dto = new DeptDTO();
				dto.setDeptno(rs.getInt(1));
				dto.setDname(rs.getString(2));
				dto.setLoc(rs.getString(3));
				list.add(dto);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt, rs);
		}
		return list;
	}
	
}









