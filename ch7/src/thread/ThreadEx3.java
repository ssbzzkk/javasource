package thread;

//싱글 쓰레드 : 
public class ThreadEx3 {

	public static void main(String[] args) {
		long start=System.currentTimeMillis();
		for(int i=0; i<300; i++) {
			System.out.printf("%s",new String("-"));
		}
		long end=System.currentTimeMillis();
		
		System.out.println("소요시간1"+(end-start));
		
		for(int i=0; i<300; i++) {
			System.out.printf("%s",new String("!"));
		}
		
		end=System.currentTimeMillis();
		System.out.println("소요시간 2"+(end-start));
	}

}
