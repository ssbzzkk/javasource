package exam;

public class Odd extends OddDetector {

	public Odd(int n) {
		super(n);
	}

	public boolean isOdd() {
		//홀수면 true리턴, 짝수면 false리턴
		if (getN()%2==1) {
			return true;
		}
		return false;
	}

}
