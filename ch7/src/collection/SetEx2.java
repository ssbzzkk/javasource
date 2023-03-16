package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SetEx2 {

	public static void main(String[] args) {
		Set<Integer>set=new HashSet<>();
		
		for(int i=0; set.size()<6; i++) {
			int num=(int)(Math.random()*45)+1;
			set.add(num);
		}
		System.out.println(set);
		
		//sort(List<T> list) : ()안에는 List인터페이스가 처리 가능한 객체(구현클래스)가 넘어와야 함
		// 구현클래스 : ArrayList, LinkedList, Stack, Queue, Vector
		
		//set=>list로
		List<Integer>list=new ArrayList<>(set);
		Collections.sort(list);
		System.out.println(list);
		
	}
}
