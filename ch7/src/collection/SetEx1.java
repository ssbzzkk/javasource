package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class 		 {

	public static void main(String[] args) {

		Set<String> set=new HashSet<>();
		
		for (int i = 0; i < 10; i++) {
			set.add(String.valueOf(i)); // i가 int라서 string으로 바꾸기 위해 String.valueOf(i)
		}
		System.out.println(set); //[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]  , 순서는 없다.

		
		
		set.add("9"); //중복을 허용하지 않음
		
		//for / while
		Iterator<String>it=set.iterator(); //접근하는 방법에 대한 통일성
		while (it.hasNext()) { //hasNext : 다음요소가 존재하면 true
			System.out.println(it.next());
		}
		
	}

}
