package ch5;

public class ArrayEx3 {
	public static void main(String[] args) {
		
		
		//int[] sore= {100,88,100,90};  대괄호[]의 위치는 타입 앞에와도 되고 타입 뒤에와도 된다.
		//[] : 대괄호 1개는 1차원 배열
		//[][] : 대괄호 2개는 2차원 배열(행,열)
		//[][][] : 3차원 배열...
		int score[]= {100,88,100,100,90};
		
		//배열 총합과 평균
		int sum=0;
		float average=0f;
	    
		for (int i = 0; i < score.length; i++) {
			sum+=score[i];
	    }
		// 478/5 = 95로 float를 사용하지 않으면 나머지가 나오지 않는다.
		// 478/5.0 =95.6 (float)를 사용해야 이렇게 나머지가 나온다.
		average = sum / (float)score.length;
		
		System.out.println("총합 : "+sum);
		System.out.println("평균 : "+average);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
