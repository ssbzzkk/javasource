package ch4;

public class WhileEx4 {

	public static void main(String[] args) {
		//
		
		
		
		
		
		
		
		
		while (true) {
			int dice1=(int)(Math.random()*6)+1;
			int dice2=(int)(Math.random()*6)+1;
			
			
			System.out.printf("(%d,%d)\n",dice1,dice2);
			
			if(dice1+dice2==5) break;
		}
		
//		for,while,if 수행할 문장이 하나라면 블럭을 생략할 수 있음
		
		if(true)
			System.out.println("true");
			System.out.println("123");
			//위의 if문은 묶어야 두개의 출력이 if문에 속하는 걸로 표현
			//묶지않으면 true문구만 if문에 속함
//		if (조건) {
//			//수행할문장
//		}
		
		
		
		
		
		
		
		

	}

}
