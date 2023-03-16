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
 *  *  '예외가 발생하면 일단 프로그램 멈춤'
 * Exception 처리
 * 	try ~ catch 
 * 
 */
public class ExceptionEx3 {

	public static void main(String[] args) {
		//참조형 초기화 'null'
		// null : '아직 값이 할당되지 않았음'
		
		String data=null;		// String data="hello"
		Account account=null;	// Account account=new Account();
		int[] arr=null;			// int arr[]=new int[5];
		
		System.out.println(data);
		System.out.println(account);
		System.out.println(arr);
		
		System.out.println(arr[0]); //java.lang.NullPointerException
//		System.out.println(data.length()); //java.lang.NullPointerException
		//'참조변수가 가리키고 있는 곳을 접근하기 시작하면 NullPointerException 나오기 시작'
			//-배열 시작하거나 '.' 찍고 가면
		// stack 이라는 메모리에 data라는 이름으로 변수가 공간이 잡혔고, 거기에 null 이 들어가 있음
		// . 을 찍으면 heap에 가서 길이를 읽어오라는것, null이기 때문에 가리키고 있는곳이 없음 =>할당을 안했구나 => '=' 다음에 뭘 안했구나
		// 할당까지 하려면 'int arr[]=new int[5];'
		//				Account account=new Account();
		
		
	}

}
