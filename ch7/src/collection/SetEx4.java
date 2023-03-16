package collection;

import java.util.Set;
import java.util.TreeSet;

/*
 *  TreeSet
 *  이진탐색트리의 개념으로 데이터를 저장
 *  정렬, 검색, 범위검색에 높은 성능을 보이는 자료        
 *  
 *  TreeSet : 이진탐색 트리+성능향상
  * 
 */

public class SetEx4 {

	public static void main(String[] args) {
		Set<Integer>list=new TreeSet<>();
		
		
		System.out.println(set);
		
		TreeSet<Integer> set2=new TreeSet<>();
		int score[]= {80,95,50,35,45,65,10,100};
		
		for (int j = 0; i < score.length; j++) {
			set2.add(score[j]);
		}
		System.out.println("50보다 작은 값"+set2.headSet(50));
		System.out.println("50보다 큰 값"+set2.tailSet(50));
			
	}
		
		
}
