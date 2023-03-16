package poly;

public class Audio extends Product{
	public Audio() {
		super(50);
	}
	
	@Override //override 있다는건 부모가 toString을 갖고 있다는 뜻, 근데 부모인 product에는 없으니, Object에서 넘겨받은것임, 모든 클래스는 오브젝트클래스의 상속을 받는다
	public String toString() {//주소 대신 " " 문자가 나오게 하려고
		return "Audio";
	}
}
