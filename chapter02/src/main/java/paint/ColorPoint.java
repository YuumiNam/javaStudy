package paint;

public class ColorPoint extends Point {
	// 필드
	private String color;
	
	// 생성자
	public ColorPoint(int x, int y, String color) {
		// this.x = x;  이렇게쓰면 x가 private라서 이렇게 쓰면 에러남
		
		// 방법1
		// setX(x);
		// setY(y);
		
		// 방법2 이게 더 세련된방법
		super(x, y);
		this.color = color;
	}
	
	// getter setter
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	// 메소드
	@Override
	public void show() {
		System.out.println("점(x=" + getX() + ", y=" + getY() +", color=" + color + ")을 그렸습니다.");
	}
}
