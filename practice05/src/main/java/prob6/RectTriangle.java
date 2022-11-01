package prob6;

public class RectTriangle extends Shape {
	// 필드
	private double width;
	private double height;
	
	// 생성자
	public RectTriangle(double d, double h) {
		this.width = d;
		this.height = h;
	}
	
	
	// 메소드
	@Override
	public double getArea() {
		double area = (width * height) / 2;
		return area;
	}
	@Override
	public double getPerimeter() {
		double perimeter = width + height + Math.sqrt((width*width) + (height*height));
		return perimeter;
	}
}
