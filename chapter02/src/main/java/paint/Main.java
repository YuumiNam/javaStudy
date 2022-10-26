package paint;

public class Main {
	public static void main(String[] args) {
		Point pt1 = new Point(10, 50);
//		pt.setX(10);
//		pt.setY(50);
		
		drawPoint(pt1);
		// pt.disappear();
		pt1.show(false);
		
		
		ColorPoint pt2 = new ColorPoint();
		pt2.setX(100);
		pt2.setY(200);
		pt2.setColor("red");
		drawColorPoint(pt2);
	}
	
	// 이렇게 짜게되면 나중에 확장성이 문제가됨
	// color포인트를 짤때 또 따로 메소드를 만들어야하는 문제가생긴다.
	public static void drawPoint(Point pt) {
		pt.show();
	}
	public static void drawColorPoint(ColorPoint pt) {
		pt.show();
	}
}
