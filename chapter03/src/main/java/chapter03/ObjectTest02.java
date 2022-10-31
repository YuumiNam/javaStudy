package chapter03;

public class ObjectTest02 {
	public static void main(String[] args) {
		Point p1 = new Point(10, 20);
		Point p2 = new Point(10, 20);
		Point p3 = p2;
		
		// == : 두 객체의 동일성
		System.out.println(p1 == p2);
		System.out.println(p2 == p3);
		
		// equals : 두 객체의 동질성 (내용비교)
		System.out.println(p1.equals(p2)); // 하지만 결과적으로는 동일성비교가 되어버림
										   // object의 equals()메소드를 만든사람은 지금 우리가 뭔 객체를 비교할지를 모르기때문에 기본 리턴값을 동일성(==)비교로 설정했다.
										   // 그러므로 여기서 내용비교 equals()를 쓰려면 Point 클래스에 equals()메소드를 override를 한다음 써야함
		System.out.println(p2.equals(p3));
	}
}
