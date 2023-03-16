package ch3;

import java.util.Scanner;

public class IfEx4 {

	public static void main(String[] args) {
		
		//근무시간 입력받기
		//8시간 근무시 시간당 9800, 초과근무시 1.5배 지급 
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("근무시간을 입력해주세요");
//		int hours = Integer.parseInt(sc.nextLine());
//		int rate=9800;
//		int pay=0;
//		if(hours>8) {
//			pay = (int)((hours-8)*1.5*rate + rate*8);
//		} else { 
//			pay = hours*rate;
//		}
//		System.out.println("하루 일당 : "+pay);
		
		
		// 키, 몸무게 입력받기
		// 저체중, 표준, 과체중 출력하는 프로그램 작성
		// (키-100)*0.9 < 몸무게 : 과체중
		// (키-100)*0.9 == 몸무게 : 표준
		// (키-100)*0.9 > 몸무게 : 저체중
		
//		System.out.println("키를 입력해주세요");
//		int height = Integer.parseInt(sc.nextLine());
//		System.out.println("몸무게를 입력해주세요");
//		int weight = Integer.parseInt(sc.nextLine());
//		double x=(height-100)*0.9;
//		String result;
//		if(x<weight) {
//			result="과체중";
//		} else if(x==weight) {
//			result="표준";
//		} else {
//			result="저체중";
//		} 
//		System.out.println("당신은 지금 "+ result);
		

//		System.out.println("키를 입력해주세요");
//		int height = Integer.parseInt(sc.nextLine());
//		System.out.println("몸무게를 입력해주세요");
//		int weight = Integer.parseInt(sc.nextLine());
////		double weight = Double.parseDouble(sc.nextLine()); 더블로 담는다면 
//		
//		double result=(height-100)*0.9;
//		
//		if(result<weight) {
//			System.out.println("과체중");
//		} else if(result==weight) {
//			System.out.println("표준");
//		} else {
//			System.out.println("저체중");
//		} 
//		
		
//		//윤년, 평년 구하기
//		int year=2023; 
//		//윤년 : 연도를 4로 나눈 나머지가 0이고, 연도를 100으로 나눈 나머지가 0이 아니거나 연도를 400으로 나눈 나머지가 0 
//		
//		if(year%4==0 && year%100!=0 || year%400==0) {
//			System.out.println("윤년");
//		} else {
//			System.out.println("평년");
//		}
		
		
		
		//임의의 숫자 3개 입력받기
		//입력받은 3개의 숫자 중 가장 작은 수 출력하기
		
		
		System.out.println("숫자1을 입력하세요");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.println("숫자2를 입력하세요");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.println("숫자3을 입력하세요");
		int num3 = Integer.parseInt(sc.nextLine());
		
//		if (a<b && a<c) {
//			System.out.println(a);
//		} else if (b<a && b<c) {
//			System.out.println(b);
//		} else if (c<a && c<b) {
//			System.out.println(c);
//		}
		
		int min=num1;
		if(min>num2) {
			min=num2;
		} 
		if(min>num3) {
			min=num3;
		}
		System.out.println("가장 작은 수 "+min);
		
		
		int max=num1;
		if(max<num2) {
			max=num2;
		}
		if(max<num3) {
			max=num3;
		}
		System.out.println("가장 큰 수 "+max);

		
		
		
		
		
		
		
		
		
		
	}

}








