package prob06;

public abstract class Arith {
	// 필드
	protected int a;
	protected int b;
	
	// 메소드
	public void setValue(int a2, int b2) {
		this.a = a2;
		this.b = b2;
	}
	
	public abstract int calculate();

}
