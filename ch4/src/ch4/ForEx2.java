package ch4;

import java.util.Iterator;
import java.util.Scanner;

public class ForEx2 {
	public static void main(String[] args) {
		//주사위 5번 던지기
		
		
//		
//		for (int i = 0; i < 5; i++) {
//			int dice=(int)(Math.random()*6)+1;
//			System.out.println(dice);
//		}
//		
//		//구구단 출력
//		// 5*1=5
//		// 5*2=10
//		// 5*3=15
//
//			System.out.println();
//		
//		Scanner sc=new Scanner(System.in);
//		
//		System.out.println("출력을 원하는 단을 입력하시오");
//		int xx=Integer.parseInt(sc.nextLine());
//		
//		
//		for (int i = 1; i <= 9; i++) {
//			System.out.printf("%d*%d=%d\n",xx,i,(xx*i));
//		}
//		
		
		//3의 배수와 5의 배수 합 구하기 ( 단 1~100 사이의 숫자 )
		//3과 5의 %(나머지)가 0인 수를 찾기
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i%3==0 && i%9!=0) {
				sum+=i;
			}
				
				
			
		}
		System.out.println("3의 배수의 합(단 9의 배수 아님)"+sum);
		
		//3의 배수 합(단, 9의 배수는 빼기)
		//sum변수는 그대로 사용
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
