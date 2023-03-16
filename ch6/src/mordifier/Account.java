package mordifier;

public class Account {
	// 속성(인스턴스변수=멤버변수) ==> private 로 막아버린다
	// 외부에서는 속성에 직접적으로 접근 불가
	// 속성(인스턴스변수)값을 얻어내거나 변경하고 싶으면? ==>메소드로 처리
	// getter /setter 메소드 활용

	private String ano;

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}
	
	
}
