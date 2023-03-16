package poly;

public class ProductEx {

	public static void main(String[] args) {
		//구매자 인스턴스 생성
		Buyer buyer=new Buyer();  //1)
		
		//tv 구매하다
		Tv1 tv1=new Tv1();  //2)기본생성자 호출
		buyer.buy(tv1);
		//=>buyer.buy(new Tv1())
		
		
		//컴퓨터 구매하다
		Computer computer=new Computer();
		buyer.buy(computer);
		//=>buyer.buy(new Computer())
		
		System.out.println("현재 남은돈은" +buyer.money+"만원입니다");
		System.out.println("현재 보너스 점수는" +buyer.bonusPoint+"점입니다");
	}

}
