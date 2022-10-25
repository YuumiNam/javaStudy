package chapter01;

// 리터럴(literal) : 프로그램에 직접적으로 표현되는 상수
 
public class Ex02Literal {
	public static void main(String[] args) {
		float f = 3.14f;
		double d = 3.14;
		
		short s = 1; // 값이 작은 수를 표시
		int i = 1;
		long l = 1234567890L; // 값이 큰 수를 표시
		
		char c = 'A';
		byte b = 65;
		
		boolean bool = true;
		
		System.out.println(f);
		System.out.println(d);
		
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		
		System.out.println(c);
		System.out.println(b);
		System.out.println((char)b);
		
		System.out.println(bool);
	}
}
