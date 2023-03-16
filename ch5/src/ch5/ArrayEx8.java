package ch5;

public class ArrayEx8 {

	public static void main(String[] args) {
		// 2차원 배열
		
		int [][] score=new int[4][3];   //<=[4][3] 4행 3열짜리 배열을 만든다는 소리
		int[] score2[]=new int[2][3];
		int score3[][]=new int[5][2];
		
		//[행번호][열번호]
		System.out.println(score2[0][0]);
		System.out.println(score2[1][2]);
		
		//2차원일때 길이는 "행"길이가 나온다
		System.out.println("행 길이 "+score2.length); 
		System.out.println("열 길이 "+score2[0].length); //<= 열길이를 구할때는 행을 주고 열을 물어봐야한다. 
		
		for (int i = 0; i < score2.length; i++) {
			for (int j = 0; j < score2[i].length; j++) {  //<== score2[i].length 열의 길이를 가져온것임.
				System.out.printf("%d\t",score[i][j]);
			}
			System.out.println();
		}

//		for (int i = 0; i < score2.length; i++) {
//		for (int j = 0; j < score2[i].length; j++) {  //<== score2[i].length 열의 길이를 가져온것임.
//			System.out.printf("%d\t",score[i][j]);
//		}
//		System.out.println();
//	}		
			
		//2차원 배열 선언, 생성, 초기화
		int[] score4[]={
				{10,11,12},
				{20,21,22}		
	};
		
		//향상된 for문 2차원 배열을 접근하는 방법(위의 주석명령문과 같은 방법)
		for(int arr[]:score4) {
			for(int j:arr) {
				System.out.printf("%d\t",j);
			}
			System.out.println();
		}
		
		
		
		
		}

}
