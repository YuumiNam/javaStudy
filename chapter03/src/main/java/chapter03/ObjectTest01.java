package chapter03;

public class ObjectTest01 {
	public static void main(String[] args) {
		Point p = new Point(10, 20);
		
		// 암시적으로 Object 클래스의 상속을 받는다는 것을 보여줌
		// Class klass = p.getClass();  upcasting의 개념이 아님
		System.out.println(p.getClass()); // reflection  System.out.println(klass);
		System.out.println(p.hashCode()); // address기반의 해싱값 (해싱 : int가 아닌 값들을 int값으로 넣어서 비교)
										  // address X, reference X
		System.out.println(p.toString()); // getClass() + "@" + hashCode()
		System.out.println(p);
	}
}
