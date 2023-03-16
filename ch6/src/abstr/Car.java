package abstr;
//추상메소드를 가지는 경우 무조건 추상클래스가 되어야 함

public abstract class Car { //자식한테 너네가 완성해라 라고 넘기는것
	//추상 메소드는 구현부 '{}' 가 없음
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	public void stopCar() {
		System.out.println("시동을 끕니다.");
	}
	final public void run() { //final 은 오버라이딩 금지
		startCar();
		drive();
		stop();
		stopCar();
	}
}
