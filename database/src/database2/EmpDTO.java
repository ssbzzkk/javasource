package database2;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// table 칼럼과 동일하게 작성
// getter/setter 메소드, 생성자, toString()작성
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class EmpDTO {

		private int empno;
		private String ename;
		private String job;
		private int mgr;
		private Date hiredate;
		private int sal;
		private int comm;
		private int deptno;
}
