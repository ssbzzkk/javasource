package poly;

public class EmployeeEx2 {

	public static void main(String[] args) {
//		Employee employee=new Employee();
//		employee.setName("홍길동");
//		employee.setPosition("사원");
//		workPrint(employee);

		//다양성 개념 적용(x)
		Ceo employee2=new Ceo();
		employee2.setName("김동호");
		employee2.setPosition("CEO");
//		employee2.work();
		workPrint(employee2);
		
		AdminStrator employee3=new AdminStrator();
		employee3.setName("정우성");
		employee3.setPosition("Admin");
//		employee3.work();
		workPrint(employee3);
		
		Parttime employee4=new Parttime();
		employee4.setName("성춘향");
		employee4.setPosition("파트타임");
//		employee4.work();
		workPrint(employee4);


	}

	//메소드만들기
	//Employee employee=new Ceo()
	//Employee employee=new AdminStrator()
	//Employee employee=new Parttime()
	//
	static void workPrint(Employee employee) { //매개변수의 다양성
		employee.work();

	}
	
}











