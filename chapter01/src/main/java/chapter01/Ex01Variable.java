package chapter01;

public class Ex01Variable {
	public static void main(String[] args) {
		// 변수설정
		int i = 1000; 
		String s = "Hello World";
							
		System.out.println(i);
		System.out.println(s);
		System.out.println();
				
				
		System.out.println("변수 변경");
		i = 2000;
		s = "Hello Again";
				
		System.out.println(i);
		System.out.println(s);
		System.out.println();
				
				
		// 상수
		final double PI = 3.14; // final = 다음에 pi를 다른숫자로 넣어줄수없다.
		System.out.println(PI);
				
		// 오류
		// final이 붙은 변수는 다시 대입값을 넣어줄수 없음
		// pi = 5.68;
	}
}
