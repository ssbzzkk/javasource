package poly;

public class Product {
	int price;
	int bonusPoint;
	
	//price만 생성자 생성
	public Product(int price) {  //4) tv super()로 넘어감
		super();
		this.price = price;
		bonusPoint=(int)(price/10.0); //보너스 점수는 제품가격의 10%
	}
}
