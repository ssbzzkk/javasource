package thread;

public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	      //동기화 메소드
	public synchronized void setMemory(int memory) { 
		//동기화 : synchronized=>한 쓰레드가 집행중인 작업을 다른 쓰
		this.memory=memory; 
		try {
			Thread.sleep(2000); //2초
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName()+": "+this.memory);
	}
}
