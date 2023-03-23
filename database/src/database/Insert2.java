package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Insert2 {

	public static void main(String[] args) {
		
		//insert, update, delete 작업시 두개의 객체만 사용
		//DML 작업 시 성공한 행의 개수만 전달받게 되기 때문에 ResultSet 은 필요없음
		Connection con=null;
		PreparedStatement pstmt=null;
		Scanner sc=new Scanner(System.in);
		
		try {
			
			//드라이버 로드
			Class.forName("oracle.jdbc.OracleDriver");
			//연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "TIGER";
			
			con=DriverManager.getConnection(url, user, password); //자바에서 하는건 바로 commit됨
			
			System.out.println("부서번호 >>");
			int deptno = sc.nextInt();
			System.out.println("부서명 >>");
			String dname=sc.next();
			System.out.println("부서위치 >>");
			String loc=sc.next();
			
			
			//sql 문 작성
			String sql="insert into dept_temp(deptno, dname, loc) values(?,?,?)";
			
			pstmt=con.prepareStatement(sql);
			//?처리
			pstmt.setInt(1, deptno);
			pstmt.setString(2, dname);
			pstmt.setString(3, loc);
			
			//select : executeQuery(), DML : executeUpdate()
			int count=pstmt.executeUpdate();
			
			if(count>0 ) {
				System.out.println("입력 성공");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				con.close(); //가장 마지막에 닫아야함
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
