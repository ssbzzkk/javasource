package abstr;
//부모 만들기
public abstract class Unit {
	int x,y;
	abstract void move(int x, int y);
	void stop() {
		//자손 클래스에서 해야 하는일이 동일하다면 
		//구현해서 상속시키기
		System.out.println("정지한다");
	}
	
}
