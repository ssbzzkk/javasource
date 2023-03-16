package lang;

/* String 클래스 특징
 *   - 변경이 불가능한(immutable)클래스
 *   - equals() : 값 비교
 *   - equalsIgnoreCase : 대소문자 구별하지 말고 값 비교
 */  
 
public class StringEx {

	public static void main(String[] args) {
		//String 클래스의 동작 구현
		//String은 문자열을 다르는 일이 많기 때문에 new를 사용하지 않고도 객체(인스턴스)를 생성할 수 있도록 되어있음
		String str2="hello"; //1)문자열 리터럴 지정 : 문자열 재사용 함
		String str4="hello";
		String str=new String("안녕하세요");
		String str3=new String("안녕하세요");
		str2=str4+str;
	
		System.out.println(str.equals(str));
		
	//문자열 비교
	// String 클래스에 equals 오버라이딩(값 비교) 되어 있음
		System.out.println(str2.equals(str));
		System.out.println(str==str3);//a문자열 비교시에는 '==' 사용하지 말 것
		
		System.out.println(str2==str4); //true 주소가 같은거임
		System.out.println(str2.equalsIgnoreCase(str));

		
		
	}
}
