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
 *  예외 던지기 : main 메소드를 호출하는 곳(jvm)에서 처리
 */
public class ExceptionEx5 {

	public static void main(String[] args) throws ClassNotFoundException {
//		//컴파일러 체크 exception
//		try {
//			//'예외가 발생할 수 있는 구문' 
//			Class.forName(""); //만약 예외가 안나면 catch는 실행되지 않음
//		} catch (ClassNotFoundException e) {
//			//'예외가 발생 했을 때 처리하기 위한 구문'
//			e.printStackTrace();
//		}
		
		Class.forName("");
		//예외 던지기 'throws ClassNotFoundException'
	}

}
