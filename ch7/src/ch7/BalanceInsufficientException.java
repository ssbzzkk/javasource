package ch7;

public class BalanceInsufficientException extends RuntimeException {
	//생성자 (superclass), 기본이랑 string만 생성하기 
 
	public BalanceInsufficientException() {
		super();
	}

	public BalanceInsufficientException(String message) {
		super(message);
	}
	
}
