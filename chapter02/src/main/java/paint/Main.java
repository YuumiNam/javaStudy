package paint;

public class Main {
	public static void main(String[] args) {
		// 흑백포인트
		Point pt1 = new Point(10, 50);
	    // pt.setX(10);
        // pt.setY(50);
		
		drawPoint(pt1);
		// pt.disappear();
		pt1.show(false);
		
		
		// 컬러포인트
		// ColorPoint pt2 = new ColorPoint(); 이렇게 쓰지말고 부모를 레퍼런싱해라
		// 진정한 overriding = 부모를 참조하는것!
		Point pt2 = new ColorPoint(100, 200, "red"); // up casting
		// pt2.setX(100);
		// pt2.setY(200);
		// ((ColorPoint)pt2).setColor("red");
		
		// drawColorPoint(pt2); 부모를 레퍼런싱했다면 쓸 필요가없었던 함수
		drawPoint(pt2);
		
		
		// 세모 그리기
		Triangle triangle = new Triangle();
		drawShape(triangle); // up casting
		
		
		// 네모 그리기
		Rectangle rectangle = new Rectangle();
		drawShape(rectangle);
		
		
		// 원 그리기
		Circle circle = new Circle();
		drawShape(circle);
	}
	
	
	// 정적 메소드
	
//	public static void draw(IDrawable drawble) {
//		
//	}
	
	public static void drawPoint(Point pt) {
		pt.show();
	}
	
	
//  이렇게 짜게되면 나중에 확장성이 문제가됨
//  다형성을 활용하려면 부모를 레퍼런싱해야한다.	
//	부모를 레퍼런싱했다면 추가할 필요가없었던 함수
//	public static void drawColorPoint(ColorPoint pt) {
//		pt.show();
//	}
	
	
	public static void drawShape(Shape shape) {
		shape.draw();
	}
}
