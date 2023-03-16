package poly;

public class EmployeeEx {

	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.setName("홍길동");
		employee.setPosition("사원");
		workPrint(employee);

		//다양성 개념 적용
		//매소드가 오버라이딩 되었다면, 오버라이딩 된 메소드가 실행 됨
		//기본은 부모꺼.
		Employee employee2=new Ceo();
		employee2.setName("김동호");
		employee2.setPosition("CEO");
//		employee2.work();
		workPrint(employee2);
		
		Employee employee3=new AdminStrator();
		employee3.setName("정우성");
		employee3.setPosition("Admin");
//		employee3.work();
		workPrint(employee3);
		
		Employee employee4=new Parttime();
		employee4.setName("성춘향");
		employee4.setPosition("파트타임");
//		employee4.work();
		workPrint(employee4);


	}

	//메소드만들기
	static void workPrint(Employee employee) {
		employee.work();

	}
	
}











