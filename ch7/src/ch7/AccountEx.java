package ch7;

public class AccountEx {

	public static void main(String[] args) {
		Account account=new Account("110-11", "홍길동", 100000);
		
		account.withdraw(500000);
			//Exception in thread "main" java.lang.RuntimeException: 잔액부족
//										BalanceInsufficientException : runtimeException 상속 받아서 만든것
			//Exception in thread "main" ch7.BalanceInsufficientException: 잔액부족
		
	}

}
