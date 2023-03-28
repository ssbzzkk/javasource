package shop2;
//인터페이스는 상수만 갖을수 있고
//기본적으로 모든 메소드는 추상이다
//public static abstract 자동으로 들어가 있음
public interface IShop {
	void setTitle(String title);
	void genUser();
	void genProduct( );
	void start( );
}
