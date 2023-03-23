package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Update2 {

	public static void main(String[] args) {
		
		Connection con=null;
		PreparedStatement pstmt = null;
		Scanner sc=new Scanner(System.in);
		
		try {
			
			Class.forName("oracle.jdbc.OracleDriver");
			
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="scott";
			String password="TIGER";
			
			con=DriverManager.getConnection(url, user, password);
			
			System.out.println("부서 코드 입력>>");
			int deptno=sc.nextInt();  //next로 가려면 다음 코드로 가야함 : int deptno=Integer.parseInt(sc.nextLine())
			
			//sc.nextLine() : 줄단위로 읽기(엔터포함), sc.next() : 엔터 직전까지 읽기 -->String 입력 처리
			//sc.nextInt() : 엔터 직전까지만 읽기
			System.out.println("변경할 부서명 입력>>");
			String dname= sc.next(); //60 다음에 엔터를 읽어옴
									
			//특정 부서의 부서명 변경
			String sql = "update dept_temp set dname=? where deptno=?";
								
			pstmt = con.prepareStatement(sql);
			
			//?에 대한 처리 : ? 왼쪽부터 1, 2, 3...
			pstmt.setString(1, dname);
			pstmt.setInt(2, deptno);
			
			
			int result = pstmt.executeUpdate();
			
			if (result>0) {
				System.out.println("업데이트 성공");
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
