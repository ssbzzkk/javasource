package generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 클래스 파일 하나에 여러 개의 클래스를 작성하는 것이 가능
 * 단, public class 는 하나만 존재해야 함
 */

class Product{}
class Tv extends Product{}
class Audio extends Product{}


public class GenericsEx2 {

	public static void main(String[] args) {
		ArrayList<Product> productList=new ArrayList<>(); // <> 안에는 왼쪽 <product>와 같으면 생략 가능, 넣어도 됨
		ArrayList<Tv> tvList=new ArrayList<>();
		// ? : 와일드 카드
		// <? super T> : 'T와 그 조상들만 가능하다'
		// <? extends T> : 'T와 그 자손들만 가능하다'
		// <? extends Product> : 'product와 그 자손들만 가능하다'
		ArrayList<? extends Product> tvList2=new ArrayList<Tv>();
		ArrayList<Product> tvList3=new ArrayList<>();
		
		//ArrayList<Product> : ArrayList에 Product 타입만 추가하겠다 는 의미
		//부모-자식 관계의 객체들은 부모타입으로 선언된 상태여도 자식 객체를 담는 것이 가능
		productList.add(new Product());
		productList.add(new Tv());
		productList.add(new Audio());
		
		tvList.add(new Tv());
		tvList.add(new Tv());
		tvList.add(new Tv());
//		tvList.add(new Product()); (x) //부모는 못담음
		
		printAll(productList);
		
		//지네릭 메서드
//		Collections.sort(List<T> list, Comparator<? super T>c);
		
	}
	static void printAll(ArrayList<Product> list) {
		for (Product product : list) {
			System.out.println(product);
		}
	}
	
}
