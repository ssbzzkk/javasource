package lang;

public class StringEx4 {

	public static void main(String[] args) {
		String names[]= {"Queen","Tod","park","Kim","Hong"};
		
		System.out.println(findKim(names));
		//출력결과
		//김씨성은 4번째에 있다
	}
	
	public static String findKim(String[] seoul) {
		
		//리턴 구문의 형태는 출력문과 동일
		int index=0; //kim 있는 위치 저장할 변수
		
		//kim 찾기
		for (int i = 0; i < seoul.length; i++) {
			if (seoul[i].equals("kim")) {
				index=i;
				break;
			}
		}
				
		return "김씨 성은" + index+1 + "번째에 있다.";
		
	}
	
}
