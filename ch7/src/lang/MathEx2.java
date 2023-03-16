package lang;

import static java.lang.Math.*; // 모든 메서드, 필드들이 static이라면 import를 static으로 처리, 앞쪽의 math 때어낼수 있음
// Math클래스 : 기본적인 수학계산에 유용한 메서드로 구성
// 생성자가 없음 => new가 안됨 => 인스턴스 생성을 못한다 => 모든 메서드, 필드들이 static임
public class MathEx2 {

	public static void main(String[] args) {
//		Math math=new Math(); (x) //The constructor Math() is not visible , 생성자가 없음
//		Math math;
		System.out.println(E);
		System.out.println(PI);
		
		// 반올림, 올림, 버림
		double val=90.7552;
		// rount() : 반올림
		System.out.println("round("+val+")="+round(val)); //91
		
		val *=100;
		System.out.println("round("+val+")="+round(val)); //9076
		System.out.println("round("+val+")/100="+round(val)/100); //90
		System.out.println("round("+val+")/100.0="+round(val)/100.0); //90
		System.out.println();
		
		//실수 : %f,  %3.1f : 출력시 전체 자릿수는 3자리, 소수점은 첫째자리까지 보여주세요
		//ceil() : 올림
		System.out.printf("ceil(%3.1f)=%3.1f\n", 1.1,ceil(1.1));
		//floor() : 버림
		System.out.printf("floor(%3.1f)=%3.1f\n", 1.1,floor(1.5));

		// max() : 두개중에 뭐가 더 큰지, min() : 작은지
		System.out.println(max(5, 3));
		System.out.println(min(5, 3));
		
		
		
		
		
		
	}

}
