package poly;

public class Tv1 extends Product {
	public Tv1() {
		super(100);  //3)super() : 부모의 매개변수를 받는 생성자 호출
		
	}
	
	@Override
	public String toString() { //주소 대신 " " 문자가 나오게 하려고
		return "tv";
	}
}
