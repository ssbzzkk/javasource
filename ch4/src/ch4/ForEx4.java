package ch4;

import java.util.Iterator;
import java.util.Scanner;

public class ForEx4 {
	public static void main(String[] args) {
		//중첩 for
		//for문 안에 for문 포함
		
		
		for (int i = 1; i < 6; i++) {
			System.out.println("************");
		}
		
		System.out.println();
		//1) 바깥 for int i =1;
		//2) i < 6 조건비교
		//3) 안쪽 for int j =0;
		//4) j < 10 조건비교
		//5) System.out.print("*");
		//6) 10번 반복
		//7) System.out.println(); 실행
		//8) 바깥 for int i++ (i=2)
		//9) i < 6 조건비교
		//10)안쪽 for int j== (j=2)
		//11)안쪽 for문 10번 실행
		//12)계속 반복되다가 i가 6이 되는 순간 for문 종료
		//출력된 가로줄:안쪽for 
		//	   세로줄:바깥for   (안쪽은 print(ln이없음))
		for (int i = 1; i < 6; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		//*
		//**
		//***
		//****
		//*****
		String star="*";
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <= i*3; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		//4x+5y=60 의 모든 해 구하기
		//단 x,y는 10 이하의 자연수
		//4*1+5*3=60?
		//4*2+5*3=60?
		//4*3+5*3=60?
		//60이 나오는 x,y 출력
		//4 , 5 , 60
		
		for (int i = 1; i <=10; i++) {
			
			for (int j = 1; j <=10; j++) {
			if (4*i+5*j==60) {
				System.out.println(i+j);
			}	
			}
		}
		
		
		
		//break;
		//자신이 포함된 가장 가까운 반복문 벗어나게 됨(주로 if와 같이 사용됨)
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i==5) {
			
			
			//continue;
			//반복문 내에서만 사용
			//반복이 진행되는 도중에 continue 문을 만나면 반복문의 끝으로 이동하여 다음
			//반복으로 넘어감
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
				
				for (int i1 = 0; i1 <= 10; i1++) {
					if(i1%3==0) continue;
					System.out.println(i1);
				}
				
				
			}
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		for (int i1 = 0; i1 <= 10; i1++) {
			if(i1%3==0) continue;
			System.out.println(i1);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
