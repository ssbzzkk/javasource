package ch3;

public class SwitchEx1 {

	public static void main(String[] args) {
		// switch : if~else if~else 대신 사용
		
//		switch (key) {
//		case value:
//		
//			break;
//
//		default:
//			break;
//		}
		
		int month=4;
		
		switch (month) {
		case 3: //month==3
		case 4:
		case 5:
			System.out.println("현재 계절은 봄");
			break;
		case 6: case 7: case 8: 
			System.out.println("현재 계절은 여름");
			break;
		case 9: case 10: case 11:
			System.out.println("현재 계절은 가을");
			break;
		case 12: case 1: case 2:
			System.out.println("현재 계절은 겨울");
			break;
		}
		//break를 만나면 break가 속한 블럭을 빠져나감
		
		
		if(month==3||month==4||month==5) {
			System.out.println("현재 계절은 봄");
		} else if(month==6||month==7||month==8) {
			System.out.println("현재 계절은 여름");
		} else if(month==9||month==10||month==11) {
			System.out.println("현재 계절은 가을");
		} else {
			System.out.println("현재 계절은 겨울");
		}
		
					
		
		
		
		
	}

}
