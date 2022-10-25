package chapter01;

public class Ex20WhilePractice2 {
	//2의 10제곱의 결과값 구하기
	public static void main(String[] args) {
		final int POWER = 10;
		int result = 1;
		
		int i = 0;
		while (i < POWER) {
			result *= 2;
			i += 1;
		}
		System.out.println("2의 " + POWER + "제곱은 " + result + "입니다.");
	}
}
