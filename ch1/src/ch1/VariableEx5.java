package ch1;

import java.util.Scanner;

/* 키보드에서 입력받기
 * 

*/
public class VariableEx5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// system.in : 키보드
		// sc.nextLine()  문자열로 입력받기
		// Integer.parseInt() : 괄호안에 들어있는 문자숫자를 숫자로 변환
		// Integer.parseInt("78") : 78
		
		System.out.print("두자리 정수를 입력해 주세요 ");
		
//		int num = Integer.parseInt(sc.nextLine());
		String input = sc.nextLine();
		int num = Integer.parseInt(input);
		
		System.out.printf("입력숫자 : %d", num);
		
		
	}

		
}








