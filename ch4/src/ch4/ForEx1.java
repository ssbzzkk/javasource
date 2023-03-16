package ch4;
	//반복문
	//어떤 작업이 반복적으로 수행되도록 할 때 사용
	//종류 : for(주로사용됨),while,do-while
	//

import java.util.Iterator;

public class ForEx1 {

	public static void main(String[] args) {
		// 1) int i =0; 초기화  
		// 2) i < 10; 조건식(false 일때 반복문을 종료시킴)
		// 3) 조건식이 true 일 때 블럭안으로 진입 : 출력문 실행
		// 4) i++ 증감식 i=1
		// 5) i < 10; 
		// 6) 조건식이 true 일 때 블럭안으로 진입 : 출력문 실행
		// 7) i++ 증감식 i=2
		// 이런식으로 조건이 false가 될때까지 반복하게 됨
		for (int i = 0; i < 10; i++) {
			System.out.print(i+" /");
		}
		// System.out.println(i); i를 불러올 수 없음(for문 안에서만 유효함)	
		System.out.println();
		for (int i = 10; i >= 1; i--) {
			System.out.print(i+" /");
		}
		System.out.println();
		for (int i = 1; i <= 10; i++) {
			System.out.print(i+" /");
		}
		//i+=2 : i=i+2
		//sum=sum+3  : sum+=3 	sum+=i : 
		System.out.println();
		for (int i = 1; i <=10 ; i+=2) {
			System.out.print(i+" /");
		}
//		System.out.println("hello");
//		System.out.println("hello");
//		System.out.println("hello");
//		System.out.println("hello");
			System.out.println( );
		for (int i = 0; i < 3; i++) {
			System.out.println("hello");
		}
		
		
		for (int i = 1; i <= 100; i+=2) {
			System.out.print(i+" ");
		}
		
		//1~10까지 덧셈 결과 출력
		//1+2+3+4+5+6
		int sum = 0;
		for (int i = 1; i <=10; i++) {
			sum =sum+i; // sum+=i
		}
		System.out.println();
		System.out.println("1~10까지의 합 "+sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
