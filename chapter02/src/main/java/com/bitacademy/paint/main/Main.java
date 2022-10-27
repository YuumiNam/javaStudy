package com.bitacademy.paint.main;

import com.bitacademy.paint.i.Drawable;
import com.bitacademy.paint.point.ColorPoint;
import com.bitacademy.paint.point.Point;
import com.bitacademy.paint.shape.Circle;
import com.bitacademy.paint.shape.Rectangle;
import com.bitacademy.paint.shape.Shape;
import com.bitacademy.paint.shape.Triangle;
import com.bitacademy.paint.text.GraphicText;

public class Main {
	public static void main(String[] args) {
		// 흑백포인트
		Point pt1 = new Point(10, 50);
	    // pt.setX(10);
        // pt.setY(50);
		
		// drawPoint(pt1); 인터페이스를 썼다면 쓸 필요가없었던 함수
		draw(pt1);
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
		// drawPoint(pt2); 인터페이스를 썼다면 쓸 필요가없었던 함수
		draw(pt2);
		
		
		// 세모 그리기
		Triangle triangle = new Triangle();
		// drawShape(triangle); 인터페이스를 썼다면 쓸 필요가없었던 함수 // up casting 
		draw(triangle);
		
		// 네모 그리기
		Rectangle rectangle = new Rectangle();
		// drawShape(rectangle); 인터페이스를 썼다면 쓸 필요가없었던 함수
		draw(rectangle);
		
		// 원 그리기
		Circle circle = new Circle();
		// drawShape(circle); 인터페이스를 썼다면 쓸 필요가없었던 함수
		draw(circle);
		
		// 글씨쓰기
		GraphicText gt = new GraphicText("Hello World");
		draw(gt);
		
		// instanceof연산자
		System.out.println(circle instanceof Object);
		System.out.println(circle instanceof Shape);
		System.out.println(circle instanceof Circle);
		// 오류 : System.out.println(circle instanceof Rectangle); instanceof에서 class자리에는 상위와 하위만 쓸수있음
		
		// 하지만, interface는 상관없이 instanceof연산자를 사용가능 "상속이 됐냐 안됐냐가 아닌, 기능이 구현됐냐 안됐냐의 문제이기 때문"
		System.out.println(circle instanceof Drawable);
		System.out.println(circle instanceof Runnable);
	}
	
	

	// 정적 메소드
	public static void draw(Drawable drawble) {
		drawble.draw();
	}
	
	
//	인터페이스를 쓴다면 필요없는 메소드
//	public static void drawPoint(Point pt) {
//		pt.show();
//	}
	
	
//  이렇게 짜게되면 나중에 확장성이 문제가됨
//  다형성을 활용하려면 부모를 레퍼런싱해야한다.	
//	부모를 레퍼런싱했다면 추가할 필요가없었던 함수
//	public static void drawColorPoint(ColorPoint pt) {
//		pt.show();
//	}
	
	
//	인터페이스를 쓴다면 필요없는 메소드
//	public static void drawShape(Shape shape) {
//		shape.draw();
//	}
}
