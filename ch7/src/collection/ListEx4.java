package collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ListEx4 {

	public static void main(String[] args) {
		Stack<String>stack=new Stack<>();
		Queue<String>queue=new LinkedList<>();
		
		//스택 삽입
		stack.push("0");
		stack.push("1");
		stack.push("2");
		stack.push("3");
				
		//큐 삽입
		queue.offer("0");
		queue.offer("1");
		queue.offer("2");
		queue.offer("3");
		
		System.out.println("====Stack====");  // 3 2 1 0
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
		System.out.println("====Queue====");
		while (!queue.isEmpty()) {
			System.out.println(queue.poll()); // 0 1 2 3
		}
		
	}

}
