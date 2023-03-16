package ch2;

import java.util.Scanner;

/* 연산자
 * 1) 단항연산자 : +(양수), -(음수), ++, --, ~, !
 * 2) 이항연산자
 * 		산술: +, -, *, /, %, <<, >>, >>>
 * 		비교: >, <, >=, <=, ==(값이 같은가?), !=(값이 같지 않다면)
 * 		논리: &&(and), ||(or), ^(xor), &(and), |(or)
 * 3) 삼항연산자 : ? :
 * 4) 대입연산자 : =  ex) a=4;
 * 
 *  연산자 우선순위 
 */
public class OperatorEx5 {
	public static void main(String[] args) {
		
		//문1) 534자루의 연필을 30명의 학생들에게 똑같은 개수로 나눌 때, 학생 한 명당 몇 개를 가질 수 있고 연필의 나머지는 몇개인지 출력
		
		int p=534, s=30; 
		System.out.println("학생 한명당="+(p/s));
		System.out.println("남은 연필 수="+(p%s));
		
		//문2) 사다리꼴 너비 윗변5, 아랫변10, 높이7 소수자릿수까지
//		double x=5, y=10, h=7;
//		System.out.println("사다리꼴 너비="+((x+y)*h/2));
		int top=5, bottom=10, height=7;
		double area = (double)(top+bottom)*height/2;
		System.out.println("사다리꼴 너비="+area);
				
		
		
		//문3) 한달월급을 10년동안 저축할때 최종 저축금액
		Scanner sc = new Scanner(System.in);
		System.out.println("한달 월급을 입력해 주세요 ");	//입력받기
		int salary = Integer.parseInt(sc.nextLine());
		int deposit = salary*12*10;
		System.out.println("10년 저축 금액="+deposit);
		
		
		//문4) 화씨 온도를 섭씨 온도로 변경하기. 화씨온도가 100도일때
		int fahr = 100;
		double cels = 5/(double)9 * (fahr-32);
		System.out.println("섭씨온도: "+cels);
		
		//문5) 삼항연산자 2개 이용, int num=10일때 num이 양수인지 음수인지 0인지 출력
		int num=10;
		String result = num > 0 ? "양수" : (num < 0 ? "음수" : "0");
		System.out.println(result);
		
		//문6) 삼항연산자 1개이용 숫자를 입력받아 짝수인지 홀수인지 출력하기
		System.out.println("숫자를 입력해주세요");
		int input = Integer.parseInt(sc.nextLine());
		result = input%2==0 ? "짝수" : "홀수";
		System.out.println(result);
		
				
		
		
	
		
		

	}

}
