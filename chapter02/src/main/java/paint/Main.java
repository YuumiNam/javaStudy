package paint;

public class Main {
	public static void main(String[] args) {
		Point pt1 = new Point(10, 50);
//		pt.setX(10);
//		pt.setY(50);
		
		drawPoint(pt1);
		// pt.disappear();
		pt1.show(false);
		
		
		// ColorPoint pt2 = new ColorPoint(); 이렇게 쓰지말고 부모를 레퍼런싱해라
		// 진정한 overriding = 부모를 참조하는것!
		Point pt2 = new ColorPoint(100, 200, "red");
		// pt2.setX(100);
		// pt2.setY(200);
		// ((ColorPoint)pt2).setColor("red");
		
//		drawColorPoint(pt2); 부모를 레퍼런싱했다면 쓸 필요가없었던 함수
		drawPoint(pt2);
	}
	
	// 이렇게 짜게되면 나중에 확장성이 문제가됨
	// color포인트를 짤때 또 따로 메소드를 만들어야하는 문제가생긴다.
	// 메소드를 추가한다는게 별 문제가 없어보이지만, 나중에 확장성에서 큰 문제가생긴다.
	// 다형성을 활용하려면 부모를 레퍼런싱해야한다.
	public static void drawPoint(Point pt) {
		pt.show();
	}
	
//	부모를 레퍼런싱했다면 추가할 필요가없었던 함수
//	public static void drawColorPoint(ColorPoint pt) {
//		pt.show();
//	}
}
