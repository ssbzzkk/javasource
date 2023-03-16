package lang;
//Wraapper

/* 타입
 * 	1)기본형 : (소문자) byte, short, int, long, float, double, boolean, char
 * 	2)참조형 : (대문자) 배열, 클래스, 인터페이스

 *	Wraapper 클래스
 *	 - 8개의 기본형을 객체로 다룰 때 사용
 */


public class WrapperEx1 {

	public static void main(String[] args) {
		
		//정수형을 다룰 때 
		// ① 기본형
		int a=3;
		char ch='a';
		byte b=4;
		float f=4.15f;
		double d=4.5;
		boolean b3=true;
		long l=123l;
		
		// ② 참조형 : 클래스(인터페이스) 가 만들어져 있다=>(메소드를 사용할 수 있다)
//		Integer i=new Integer(3);
		Integer i2=3;
		Integer i3=3;
//		Character ch2=new Character(3);
		Character ch2='a';
		Byte b2=4;
		Float f2=4.15f;
		Double d2=4.5;
		Boolean b4=false;
		Long l2=122l;
		
		System.out.println(i2.equals(i3));  //true
		System.out.println(i2==i3);  //true
	
		System.out.println("문자형태의 숫자를 정수로 Integer.parseInt() "+Integer.parseInt("10")); //문자형태의 숫자를 정수로 
		System.out.println("문자형태의 숫자를 실수로 Double.parseDouble() "+Double.parseDouble("10")); //문자형태의 숫자를 실로 
		
		//기본형으로 선언된 변수를 참조형에 바로 대입 가능
		Integer i4=a;
		
		
	}
}
