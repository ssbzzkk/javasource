package ch1;

public class VariableEx3 {

	public static void main(String[] args) {
//		*변수명 규칙
//		대소문자 구별
//		길이에 제한은 없음
//		예약어 사용 불가 ex) int true; int short;
//		숫자로 시작하면 안됨
//		특수문자는 _, $만 허용
//		변수의 첫글자는 항상 소문자
//		여러 단어로 이루어진 이름은 단어의 첫글자를 대문자로 한다 ex) lastIndexOf
		
		
		
//	두 변수의 값 교환하는 법
		int x=10, y=20;
		
//		비어있는 공간 작성
		int temp=0;
		
//		둘 중의 하나의 값 옮기기
		temp=x; //temp라는 공간에 x값을 담는다
		
//		나머지 값 옮기기
		x=y;
		y=temp;
		
//		출력
		System.out.println("x = "+x+", y = "+y);
//		"" + : 앞의 문자열과 연결해서 출력하기

		System.out.print("x = " + x);
		System.out.print("y = " + y);
		

	}

}
