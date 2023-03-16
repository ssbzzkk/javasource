package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* 컬렉션 프레임웍
 * 컬렉션 : 여러 데이터들을 모아 놓은 것
 * framework : 표준화, 정형화된 프로그래밍 방식
 * 
 * 라이브러리 : 공통으로 사용될만한 유용한 기능을 모듈화
 * 	
 * 	   Collection
 *   (부모 인터페이스)
 * 	List		Set
 * (자식)        (자식)   
 * 	
 *  Map(별개)
 * 
 * (모두 외우기)
 *  List 인터페이스 : 순서가 존재함, 데이터 중복을 허용, 
 * 		구현클래스(자식클래스) : ArrayList, LinkedList, Stack, Queue, Vector...
 *  	배열과 비슷하지만 개선된 버전, 비어있는 공간 알아서 채워넣음
 *  
 *  Set 인터페이스 : 순서를 유지하지 않음, 데이터 중복 허용하지 않음
 *  	구현클래스 : HashSet, TreeSet...
 *  
 *  Map 인터페이스 : key, value의 쌍으로 이루어진 데이터 집합
 *  			  순서를 유지하지 않음, key는 중복 안되고 value는 중복 허용
 *  	구현클래스 : HashMap, Treemap, Hashtable, Properties...
 *  
 *  
 *  <E> or <T> , <K,V> : 지네릭스 개념 ==> '타입을 지정해줘라~'
 *  E : element 타입 지정해라 (기본타입은 못씀)
 *  
 *  타입 : 참조 타입만 지정 가능, (기본타입은 못씀)
 *  
 *  
 */

public class ListEx1 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();

		System.out.println("size(): "+list.size()); //배열의 length와 같은 개념
		System.out.println("isEmpty(): "+list.isEmpty());
		
		// add() : 요소 추가
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
	
		list2.add("자바");
		list2.add("html");
		list2.add("script");
		list2.add("서블릿");

		System.out.println(list); //[1, 2, 3, 4, 5]
		System.out.println(list2); //[자바, html, script, 서블릿]
	
		
		String fruits[]= {"사과","포도","메론","딸기","바나나"};
		//배열 =>리스트로 변환(추가할 내용이 없다면)
		List<String> list3=Arrays.asList(fruits);
		System.out.println(list3); //[사과, 포도, 메론, 딸기, 바나나]

		//list3.add("참외"); //runtime Exception 뜸 'java.lang.UnsupportedOperationException'
		//배열에 추가 담는건 안됨
		
		//배열 =>리스트로 변환(추가할 내용이 있다면)
		List<String> list4=new ArrayList<>(Arrays.asList(fruits));
		list4.add("참외");
		System.out.println(list4); //[사과, 포도, 메론, 딸기, 바나나, 참외]
		
		
		//add(int index, 요소)
		list.add(3, 6);
		System.out.println("특정 위치에 추가후 "+list); //[1, 2, 3, 6, 4, 5]
		
		
		//set()
		list.set(3, 7);
		System.out.println("특정 위치에 요소변경 "+list); // [1, 2, 3, 7, 4, 5]
		
		
		//remove(int index)
		list2.remove(2);
		System.out.println("특정위치 요소 제거 후: "+list2); //[자바, html, 서블릿]
		
		//remove(Object o) 다 받을수 있음
		list4.remove("바나나");
		System.out.println("특정위치 요소 제거 후: "+list4); //[사과, 포도, 메론, 딸기, 참외]
		
		//get()
		System.out.println("특정위치요소 가져오기:"+list2.get(0)); //자바
		
		//indexOf()
		System.out.println("특정요소의 위치 가져오기: "+list2.indexOf("서블릿")); //2
		
		//Collections.sort() : 오름차순 기본, 내림차순을 원할 때는 기준 제공
		Collections.sort(list4);// 오름차순 ㄱ ㄴ ㄷ ...  
			//return type이 void일때는 호출만 됨, 출력 안됨
		System.out.println("오름차순 정렬후: "+list4); // [딸기, 메론, 사과, 참외, 포도]
		
		
		// 내림차순  list에도 들어있음
		// Comparator.naturalOrder() : 오름차순, Comparator.reverseOrder():내맃마순
		list.sort(Comparator.reverseOrder());
		System.out.println("내림차순 정렬후: "+list); //[7, 5, 4, 3, 2, 1]

		
		
		
	}
}



























