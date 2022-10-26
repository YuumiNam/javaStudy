package paint;

public class ColorPoint extends Point {
	// 필드
	private String color;
	
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
