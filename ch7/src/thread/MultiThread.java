package thread;

import javax.swing.JOptionPane;

public class MultiThread {

	public static void main(String[] args) throws InterruptedException {

		ThreadEx6 t1=new ThreadEx6();
		t1.start(); //실행 대기열에 저장되어 자신의 차례가 올때까지 기다림
		
		String input = JOptionPane.showInputDialog("아무값이나 입력하세요");
		System.out.println("입력하신 값은"+input+" 입니다.");
	}

}
