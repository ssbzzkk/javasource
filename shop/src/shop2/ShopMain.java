package shop2;

import java.util.Scanner;

public class ShopMain {

	public static void main(String[] args) {
		//왼쪽 부모, 오른쪽 자식
		MyShop2 shop=new MyShop2();
		
		//shop이름 지정
		shop.setTitle("MyShop");
		
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		
		while(flag) {
			System.out.println("-------------------------");
			System.out.println("1. user 생성");
			System.out.println("2. product 생성");
			System.out.println("3. 상점 open");
			System.out.println("4. 전체 user 조회");
			System.out.println("5. 종료");
			System.out.println("-------------------------");
			
			System.out.print("선택>>");
			int no = Integer.parseInt(sc.nextLine());
			
			switch (no) {
			case 1://user생성
				shop.genUser();
				break;
			case 2://product생성
				shop.genProduct();
				break;
			case 3://shop시작
				shop.start();
				break;
			case 4://전체 user조회
				shop.userList();
				
				break;
			case 5://종료
				flag = false;
				break;
			default:
				break;
			}	
		}	
	}
}
