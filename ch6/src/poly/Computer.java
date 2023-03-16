package poly;

public class Computer extends Product{
	public Computer() {
		super(200);
	}
	
	@Override
	public String toString() {//주소 대신 " " 문자가 나오게 하려고
		return "Computer";
	}
}
