package generics;
/*
 *  Box2<T> : 지네릭 클래스, T Box2라고 읽는다.
 *  T : 타입변수 또는 타입 매개 변수
 *  Box2 : 원시타입 (raw type)
 */

import java.util.ArrayList;

public class Box3<T> {
	ArrayList<T> list=new ArrayList<>();
	void add(T item) {
		list.add(item);
	}
	T get(int i) {
		return list.get(i);
	}
	int size() {
		return list.size();
	}
	@Override
	public String toString() {
		return list.toString();
	}
	
	
	
}
