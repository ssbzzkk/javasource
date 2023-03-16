package thread;

import javax.swing.JOptionPane;

// 두 쓰레드가 서루 다른 자원을 사용하는 작업의 경우에는
// 멀티쓰레드 프로세스가 더 효율적임

public class SingleThread {

	public static void main(String[] args) throws InterruptedException {
		String input = JOptionPane.showInputDialog("아무값이나 입력하세요");
		System.out.println("입력하신 값은"+input+" 입니다.");

		for(int i=10; i>0;i--) {
			System.out.println(i);
			Thread.sleep(1000); //1초간 시간 지연
		}
	}

}
