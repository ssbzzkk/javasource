package shop2;

public class SmartTv extends Product{
	
	String resolution;	//해상도 정보
	public SmartTv(String name, int price,String resolution) {
		super(name, price);
		this.resolution=resolution;
	}

	
	//SmartTv의 이름과 가격 출력 메소드 필요=>부모 메소드 사용
	
	

	//해상도정보 출력 메소드 필요
	public void printExtra() {
		System.out.println("해상도 정보 "+resolution);
	}
}
