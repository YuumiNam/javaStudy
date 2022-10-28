package chapter03;

public class ObjectTest01 {
	public static void main(String[] args) {
		Point p = new Point(10, 20);
		
		// 암시적으로 Object 클래스의 상속을 받는다는 것을 보여줌
		System.out.println(p.getClass());
		System.out.println(p.hashCode());
		System.out.println(p.toString());
	}
}
