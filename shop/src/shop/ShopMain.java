package shop;

public class ShopMain {

	public static void main(String[] args) {
		//왼쪽 부모, 오른쪽 자식
		IShop shop=new MyShop();
		
		//shop이름 지정
		shop.setTitle("MyShop");
		//user생성
		shop.genUser();
		//product 생성
		shop.genProduct();
		//shop시작
		shop.start();
	}

}
