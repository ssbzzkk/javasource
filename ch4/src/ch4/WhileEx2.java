package ch4;
	//반복문
	//어떤 작업이 반복적으로 수행되도록 할 때 사용
	//종류 : for(주로사용됨),while,do-while
public class WhileEx2 {

	public static void main(String[] args) {
		
		//구구단 출력
		//6단 출력
		int i=1;
		while (i<10) {
			System.out.printf("6*%d=%d\n",i,(6*i));
			i++;
		}
		
		int sum=0,j=0;
		
		while (true) {
			if(sum>100) break;
			++j;
			sum+=j;
		}
		System.out.println("j="+j);
		System.out.println("sum="+sum);
	}

}
