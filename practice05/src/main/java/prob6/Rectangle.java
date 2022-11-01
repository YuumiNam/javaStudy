package prob6;

public class Rectangle extends Shape implements Resizable{
	// 필드
	private double width;
	private double height;
	
	// 생성자
	public Rectangle(double d, double h) {
		this.width = d;
		this.height = h;
	}
	
	// 메소드
	@Override
	public double getArea() {
		double area = width * height;
		return area;
	}
	@Override
	public double getPerimeter() {
		double perimeter = (width + height) * 2;
		return perimeter;
	}
	
	@Override
	public void resize(double s) {
		width = width * s;
		height = height *s;
	}
}
