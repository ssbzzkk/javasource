package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectOne {

	public static void main(String[] args) {
		
		Connection con=null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "TIGER";
			
			con = DriverManager.getConnection(url, user, password);
					
			//부서번호 10 조회
			String sql="select * from dept_temp where deptno=10";
			
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			//하나만 나올거라서 while대신 if씀
			if (rs.next()) {
				System.out.println(rs.getInt(1)+"\t"+rs.getString("dname")+"\t"+rs.getString("loc"));
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
