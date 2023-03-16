package ch5;
/* 참조타입에서 특정한 값이 할당되지 않은 상태 : null
 * 
 * String : char 배열에 기능을 추가한 개념
 * 
 */

public class ArrayEx7 {
	public static void main(String[] args) {
		
		System.out.println(args[0]);
		
		//int numArr[]=new int[3];   앞에 int 를 썻으면 = new뒤쪽에 같은 타입의 int 사용
		String name[] = new String[3];     //<= String 처럼 대문자로 시작하면 참조타입이다.

//		System.out.println(name[0]); //null
		
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		
		//초기화 시키기
		name[0] = "Kim";
		name[1] = "Park";
		name[2] = "Yi";
		
		System.out.println(name[0]);
		System.out.println(name[0].charAt(1));  //=>문자1번째 것을 가져올 수 있다.
		
		String str = "ABCDE";
		
		System.out.println(str.charAt(3));   //=>문자3번째 것을 가져올 수 있다.
		System.out.println(str.charAt(4));
		
		//문자열 비교(String)비교 할 때는 ==(!) 을 사용하지 않음
		// 비교할때 equals(), equalsIgnorCase() 사용한다
		System.out.println(str.equals("abcde"));
		System.out.println(str.equalsIgnoreCase("abcde"));
		
		//삼항연산자를 프린트문에 집어넣음 => true일 때는 일치함을 나오게하고 false일 때는 일치하지 않음
		System.out.println(str.equals("abcde")?"일치함":"일치하지 않음");
		
		if (str.equals("abcde")) {
			System.out.println("일치함");
		}else  {
			System.out.println("일치하지 않음");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
