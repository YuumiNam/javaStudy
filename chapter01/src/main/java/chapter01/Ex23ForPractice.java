package chapter01;

public class Ex23ForPractice {
	// 2의 n제곱의 값 구하기
	public static void main(String[] args) {
		int result = 1;
		final int COUNT = 10;
		
		for(int i = 0 ; i < COUNT ; i++) {
			result *= 2;
		}
		System.out.println("2의 " + COUNT + "제곱은 " + result + "입니다.");
	}
}