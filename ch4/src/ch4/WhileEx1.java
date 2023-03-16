package ch4;
	//반복문
	//어떤 작업이 반복적으로 수행되도록 할 때 사용
	//종류 : for(주로사용됨),while,do-while
public class WhileEx1 {

	public static void main(String[] args) {
		
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i%3==0 && i%9!=0) {
				sum+=i;
			}
				
				
			
		}
		System.out.println("3의 배수의 합(단 9의 배수 아님)"+sum);
		
		sum=0;
		int i=1;
		while (i <= 100) {
			if (i%3==0 && i%9!=0) {
				sum+=i;}
			i++;
		}
		
		System.out.println("3의 배수의 합(단 9의 배수 아님)"+sum);
		
		i=1;
		while (i < 10) {
			System.out.print(i+" /"); i++;
		}
		
		System.out.println();
		i=1;
		while (i >= 1) {
			System.out.print(i+" /");i--;
		}
		System.out.println();
		i=1;
		while (i <= 10) {
			System.out.print(i+" /");i++;
		}
		System.out.println();
		i=1;
		while (i <=10) {
			System.out.print(i+" /");i+=2;
		}
			System.out.println( );
			i=1;	
		while (i < 3) {
			System.out.println("hello");i++;
		}
		i=1;
		while (i <= 100) {
			System.out.print(i+" ");i+=2;
		}
		i=1;
		int sum1=0;
		while (i <=10) {
			sum1 =sum1+i; 
			i++;
		}
		System.out.println();
		System.out.println("1~10까지의 합 "+sum1);
		
		
		
	}

}
