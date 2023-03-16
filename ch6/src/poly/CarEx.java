package poly;

public class CarEx {
	public static void main(String[] args) {
//		Car car1=new FireEngine();
//		Car car2=new Ambulance();
		
		Car car=null;
		
		FireEngine fireEngine=new FireEngine();
		FireEngine fireEngine2=null;
		
		fireEngine.water();
		car=fireEngine; // Car car=new FireEngine();
							//water가 안보임
		fireEngine2=(FireEngine) car; //강제형변환(캐스팅)
		fireEngine2.water();
		
//		FireEngine fe=(FireEngine) new Car(); //안됨
//		fe.drive(); CastException뜸
		
//		FireEngine fe=new Ambulance(); //관계없는것도 안됨
		//되는건 왼쪽 부모, 오른쪽 자식일 경우만 됨
	}
}
