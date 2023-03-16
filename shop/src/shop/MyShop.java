package shop;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MyShop implements IShop{
	//쇼핑몰 이름
	private String title;
	//User정보 저장 배열 생성
	ArrayList<User> users=new ArrayList<>();
	
	ArrayList<Product> products=new ArrayList<>();

	//구매한 제품을 저장 배열(cart)
	ArrayList<Product> carts=new ArrayList<>();
	
	
	// 결제방법, 변수선언하기
	// 선택된 user 저장
	private int selUser;
	
	
	Scanner sc=new Scanner(System.in);

	
	@Override
	public void setTitle(String title) {
		this.title=title;
	}

	@Override
	public void genUser() {
		//User 2명 생성후 배열에 저장
		users.add(new User("홍길동", PayType.CARD)); 
		users.add(new User("성춘향", PayType.CASH)); 
	}

	@Override
	public void genProduct() {
		//Product 4개 생성 후 배열에 저장
		//추상클래스와 인터페이스는 new를 못함, 자식클래스가 있어야 의미가 있음 'CellPhone, SmartTv'
		products.add(new CellPhone("삼성", 10000, "LG"));
		products.add(new CellPhone("애플", 30000, "KT"));
		products.add(new SmartTv("삼성TV", 500000, "QHD"));
		products.add(new SmartTv("엘지TV", 700000, "4K"));
	}

	@Override
	public void start() {
		System.out.println(title+": 메인화면-계정 선택");
		System.out.println("=============================");
//		System.out.println("[0]"+users[0].getName()+"("+PayType.CARD+")");
//		System.out.println("[1]"+users[1].getName()+"("+PayType.CASH+")");
		
		int i=0;
		for (User user : users) {
			System.out.println("["+i+"]"+user.getName()+"("+user.getPayType()+")");	
		}
		
		
		System.out.println("[x]종 료");
		System.out.println("선택 :");
		String sel=sc.nextLine();
		System.out.println("## "+sel+"선택 ##");
		
		//0.1-->productList() 호출
		switch (sel) {
		case "x": case"X":
			System.exit(0);//프로그램 종료
			break;
		
		case "0": case"1":
			selUser=Integer.parseInt(sel);
			productList();
			break;
		default:
			System.out.println("메뉴를 확인해 주세요\n");
			start();
			break;
		}
		
		}
	public void productList() {
		
		System.out.println();
		System.out.println(title+" : 상품목록");
		
		int i=0;
		for (Product product : products) {
			System.out.printf("[%d]",i++);
			product.printDetail();
			product.printExtra();
		}
		
		System.out.println("=================");
		System.out.println("[h] 메인 화면");
		System.out.println("[c] 체크 아웃");
		System.out.println("선택 : ");
		String sel=sc.nextLine();
		
		
		//상품선택시 0~3 ->cart제품 추가, productList()호출
		//h=> start메소드 호출, c=> checkOut()호출
		switch (sel) {
		case "h": case"H":
			start();
			break;
		case "c": case"C":
			checkOut();
			break;
		case "0":case"1":case"2":case"3":
			
			for (Product cart : carts) {
				if (cart==null) {
					// integer.parseInt("0")==>0
					carts.add(products.get(Integer.parseInt(sel)));
					break;
				}
			productList();
			break;
			}
		}
				
		
		}
	public void checkOut() {
		System.out.println(title+"체크아웃");
		System.out.println("==============");
		//장바구니에 담겨있는 상품 목록 출력
		int total=0; //제품 가격 합계
		int i=0;
	
		for (Product cart : carts) {
			if (cart!=null) {
				System.out.printf("[%d] %s (%d)\n",i++,cart.getName(),cart.getPrice());
				total+=cart.getPrice();
			
			}
		}
		
		
		
					
		System.out.println("=====================");
		//결제 방법 : card 
		System.out.println("결제 방법: "+users.get(selUser).getPayType());
		//가격 합계 구하기
		//결제금액 : 50000
		System.out.println("결제 금액 :"+total);
		//[p]이전, [q]결제완료
		System.out.println("[p] 이전, [q] 결제완료");
		System.out.println("선택: ");
		String sel=sc.nextLine();
		
		//p일때 productList() 호출
		switch (sel) {
		case "p": case "P":
			productList();
			break;
			//q일때 결제가 완료되었습니다. 프로그램 종료
		case "q": case "Q":
			System.out.println("결제가 완료되었습니다");
			System.exit(0);
			//잘못입력시 checkOut()호출
			break;
		default: 
			checkOut();
			break;
		}
		
		
	}
	
}
