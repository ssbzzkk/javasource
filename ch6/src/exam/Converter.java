package exam;

import java.util.Scanner;

public abstract class Converter {
	private double ration;
	
	public abstract double convert(double src); //자식클래스에서 src/1200
	public abstract String getSrcString(); // return "원"
	public abstract String getdestString(); // return "달러"
	
	public double getRation() {
		return ration;
	}
	
	public void run() {
		Scanner sc=new Scanner(System.in);
		System.out.println(getSrcString()+" 을(를)"+getdestString()+"로 바꿉니다.");
		System.out.println(getSrcString()+" 을(를) 입력하세요>>");
		double val=sc.nextDouble(); //한국돈입력
		double res=convert(val);
		System.out.println("변환결과: "+res+getdestString()+" 입니다.");
	}
}
