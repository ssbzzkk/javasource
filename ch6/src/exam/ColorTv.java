package exam;

public class ColorTv extends Tv {

	private int color;
	public ColorTv(int size, int color) {
		super(size);
		this.setColor(color);
	}
	
	void printProperty(){
		System.out.println(super.getSize()+"인치, "+getColor()+"컬러");
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}
	
}
