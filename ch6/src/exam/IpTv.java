package exam;

public class IpTv extends ColorTv {
	private String adress;
	public IpTv(int size, int color, String adress) {
		super(size, color);
		this.adress=adress;
	}
	@Override
	void printProperty(){
		System.out.println("나의 IpTv는 "+getSize()+"인치, "+getColor()+"컬러, 주소는 "+adress+"입니다.");
		
	
	}
}
