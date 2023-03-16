package lang;

import java.util.Arrays;
import java.util.Iterator;

public class StringEx2 {

	public static void main(String[] args) {

		// String 생성자
		
		char c[]= {'H','e','l','l','o'};
//		
//		// new String(char value[])
//		String str1=new String(c);
//		System.out.println(c);
//				
//		//charAt(int index) : char => charAt 호출 시 int 매개변수를 넣어서 호출하고 결과(return)값은 char로 받는다.
//		// 리턴값이 있다면 1) sysout하던지, 2) 변수에 받던지
//		System.out.println(str1.charAt(0));
//		System.out.println(str1.charAt(1));
//	
//		//length() : 
//		System.out.println(str1.length());
//
		String str2="Hello";
//		
		String str3="자바 프로그래밍";
//		//str3 문자열에 '프' 문자가 들어있는지 확인하고 싶음
//		// charAt, length 만 사용해서
//		
//		
//		
//		for (int j = 0; j < str3.length()	; j++) {
//			if (str3.charAt(j)=='프') {
//				System.out.println("프가 들어있음");
//				break;
//			}
//		}
//		
//		
//		//indexOf() : 주어진 문자 ch가 문자열에 들어있는지 확인하고 위치를 리턴(못찾으면 -1 리턴)
//		System.out.println("indexOf(int ch): "+str2.indexOf('o'));
//		System.out.println("indexOf(String str): "+str2.indexOf("ell")); //시작하는 위치가 리턴
//		System.out.println("indexOf(int ch, int fromIndex): "+str2.indexOf('o',2)); //시작하는 위치가 리턴
//		System.out.println("indexOf(int ch, int fromIndex): "+str2.indexOf('h',2)); //시작하는 위치가 리턴
//
//		//lastIndexOf() : 위치를 찾을때 오른쪽 끝부터 찾음
//		System.out.println("indexOf(int ch): "+str2.lastIndexOf('e'));
//		
//		// 프 들어있는지 찾기, indexOf 사용해서
//		
//		System.out.println(str3.indexOf('프')>-1?"프가 들어있음":"");
//		
//		//subString() : 범위에 해당하는 문자열 얻기
//		String ssn="0123456789";
//		//subString(int beginIndex)
//		String result= ssn.substring(3); //메소드가 void가 아닐때 return타입이 아니면 변수에 담든지, 
//		System.out.println(result);
//		//subString(int beginIndex, int endIndex)
//		System.out.println("subString(int beginIndex, int endIndex : "+ssn.substring(3,8));
//		
//	
//		//concat() : +와 같은 역할
//		String result2=str2.concat("안녕하세요");
//		System.out.println(result2); //hello안녕하세요
//	
//		//startsWith() : " " 로 시작하니?
		String str4="java.lang.Object";
//		System.out.println(str4.startsWith("java.lang.Object"));
//		System.out.println(str4.startsWith("java.lang."));
//		System.out.println(str4.startsWith("lang."));
//		System.out.println(str4.startsWith("a", 3));
//		
//		//endsWith()
//		System.out.println("endsWith "+str4.endsWith("Object"));
//		System.out.println("endsWith "+str4.endsWith("ct"));
//		System.out.println("endsWith "+str4.endsWith("Obj"));
//		
		//contains()
		System.out.println("contains "+str2.contains("he"));
		System.out.println("contains "+str2.contains("el"));
		System.out.println("contains "+str2.contains("le"));
//
//		//replace()
		String str5="자바는 객체지향 언어입니다. 자바는 풍부한 API를 제공합니다.";
//		
//		System.out.println("replace: "+str5.replace("자바", "123")); //replace() 결과를 새로운 문자열로 리턴만 한것
//		str5=str5.replace("자바", "java");
//		System.out.println("replace: "+str5); // string은 변경 불가 라는 특징, 원본이 안바뀜
//		
//		System.out.println("replaceFirst: "+str5.replaceFirst("java", "자바")); //첫번째 것만 바꾸기
//		System.out.println("replaceAll: "+str5.replaceAll("java", "자바")); //전체 바꾸기
//
//		
		//trim()
		//공백도 문자다 : 양쪽 공백 제거 (중간 공백 제거 x), 
		String str6 = "  Hello World  ";
//		System.out.println(str6.trim());
//		System.out.println(str6);
//		System.out.println("str6 trimLength : "+str6.trim().length());
//		System.out.println("str6 length : "+str6.length());
//		System.out.println(str6.equals("Hello World"));
		
		
		//문자열로 변경하는 방법 1.
		// static 불러올때는 ==> 클래스이름.메소드명, 클래스이름.상수
		// static String valueOf() : (static 매소드) 지정된 값을 문자열로 변환하여 반환
		System.out.println(String.valueOf(true)); //==> "true"
		System.out.println(String.valueOf('c')); //==> "c"
		System.out.println(String.valueOf(100)); //==> "100"
		// 다시 숫자로 돌리기
		System.out.println("Integer.parseInt(\"100\") :"+Integer.parseInt("100")); //==> 100

		
		//문자열로 변경하는 방법 2.
			//a를 문자열로 변경
		int a=100;
		String b=a+"";
		System.out.println(b);
		
		
		// toLowerCase() : 모두소문자로 변경 / toUpperCase() : 모두 대문자로 변경
		System.out.println("toLowerCase() :"+str2.toLowerCase());
		System.out.println("toUpperCase() :"+str2.toUpperCase());
		
		
		// split() : 문자열에서 분리
		String animals = "dog,cat,bear";
		// regex : Regular expression (정규 표현식)
		String[] arr = animals.split(",");
		System.out.println(arr); //=>[Ljava.lang.String;@762efe5d

		System.out.println(Arrays.toString(arr)); //[dog, cat, bear] <== 확인용
		
		//for 로 해결하기
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		//for문 출력
//		dog
//		cat
//		bear
	
		// split(String regex, int limit) : regenx로 나누되, limit로 나누기
		arr=animals.split(",", 2);
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);	
		}
		
		// compareTo() : str과 문자열 비교(사전순서)
		// 같으면 0, 사전 순으로 이전이면 음수, 이후면 양수
		System.out.println("aaa".compareTo("aaa")); //0
		System.out.println("aaa".compareTo("bbb")); //-1,  a=97, b=98
		System.out.println("A".compareTo("a")); //-32,  a=97, A=65
		System.out.println("bbb".compareTo("aaa")); //1
		System.out.println("aab".compareTo("aaa")); //1
		
		
		// split() : 나누는것 <==> join() : 결합하는것
		// join() : static임
		arr=animals.split(",");
		System.out.println(Arrays.toString(arr));
		String str8=String.join("-", arr);
		System.out.println(str8);
		
		
	}
}

