package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

//사용자한테 부서번호 입력을 받아서 특정 행을 삭제
public class Delete2 {

	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		Scanner sc=new Scanner(System.in);
		
		
		try {
		
			Class.forName("oracle.jdbc.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "TIGER";
			
			con = DriverManager.getConnection(url, user, password);
			
			System.out.println("삭제할 부서번호 입력 >> ");
			int deptno = sc.nextInt();
			
			//사용자 입력한 deptno삭제
//			String sql = "delete dept_temp where deptno="+deptno;
			String sql = "delete dept_temp where deptno=?";
			
			pstmt = con.prepareStatement(sql);
			
			//? 셋팅
			pstmt.setInt(1, deptno); //1 은 물음표 첫번째 에 deptno를 넣어주세요, 2는 두번째 물음포에
			
			int result = pstmt.executeUpdate();
			
			if (result>0) {
				System.out.println("삭제 성공");
			}
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
