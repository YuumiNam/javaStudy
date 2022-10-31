package prob06;

public class Div extends Arith{
	// 메소드
	@Override
	public void setValue(int a, int b) {
		super.setValue(a, b);
	}

	@Override
	public int calculate() {
		return a / b;
	}
}
