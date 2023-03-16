package ch7;
/* 
 * 컴파일 에러 : 컴파일 시에 발생하는 에러
 * 			- 바로 빨간줄 가는것
 * 런타임 에러 : 실행 시에 발생하는 에러
 * 			- 빨간줄은 안갔는데 실행(run)했을때 에러나는것
 * 논리적 에러 : 실행은 되지만, 의도와 다르게 동작하는 것
 * 
 * 에러(error) : 코드에 의해서 수습될 수 없는 심각한 오류 ex) 메모리 부족, 스택오버플로우
 * 예외(exception) : 코드에 의해서 수습될 수 있는 미약한 오류
 * 
 * Exception
 *  1) Exception 클래스들 : 사용자의 실수와 같은 외적인 요인에 의해 발생하는 예외
 *  2) RuntimeException 클래스들 : 프로그래머의 실수로 발생하는 예외
 *  	- 배열 범위 벗어나기, NullPointerException, ClassCastException...
 * 
 * Exception 처리
 * 	try ~ catch 
 *  '예외가 발생하면 일단 프로그램 멈춤'
 */
public class ExceptionEx4 {

	public static void main(String[] args) {
		//런타임오류
				//java.lang.ArrayIndexOutOfBoundsException
				//'배열 인덱스 오류' 잘못지정했을때
//		System.out.println(args[0]); 
		// if 문으로 확인
//		if (args.length==1) {
//			System.out.println(args[0]);
//		}else {
//			System.out.println("실행방법 확인");
//		}
		//try catch 방법
		try {
			System.out.println(args[0]); //java.lang.ArrayIndexOutOfBoundsException
			System.out.println(3/0); //java.lang.ArithmeticException: / by zero
		
		} catch (ArrayIndexOutOfBoundsException e) { 
			System.out.println("실행방법 확인");
		
		}catch (ArithmeticException e) { //catch는 여러개 가능
			System.out.println("0으로 나눌수 없음");
		
		}catch (Exception e) { //catch는 여러개 가능
			System.out.println("오류발생");
			
		}
		
	}

}
