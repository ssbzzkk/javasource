package lang;

public class Card {
	String kind;
	int number;
	
	
	public Card() {
		this("SPADE",1);
		// 인스턴스 생성할때 생성자 이용
		// Card 라는 인스턴스 생성
		// 기본생성자, 매개인수를 받는 생성자
		// Card card1=new Card();
		// Card card1=new Card("HEART",7);
	}
	
	public Card(String kind, int number) {
		super();
		this.kind=kind;
		this.number=number;
	}
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return "kind : " +kind+ ", number: " +number;
//	}
	
}
