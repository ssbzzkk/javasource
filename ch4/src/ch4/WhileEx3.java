package ch4;

import java.util.Scanner;

//반복문
	//어떤 작업이 반복적으로 수행되도록 할 때 사용
	//종류 : for(주로사용됨),while,do-while
public class WhileEx3 {

	public static void main(String[] args) {
		//사용자로부터 숫자를 입력받기
		//숫자의 각 자리의 합 구하기
		//12345 ==>5+4+3+2+1
		
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자입력 : ");
		int num = Integer.parseInt(sc.nextLine());
		int sum =0;
		while (num!=0) {
			sum+=num%10;
			System.out.printf("sum=%-3d num=%d\n",sum,num);
			
			num = num/10;
		}
		System.out.println("각 자리수의 합 "+sum);
		
		
		
		
		
	}

}
