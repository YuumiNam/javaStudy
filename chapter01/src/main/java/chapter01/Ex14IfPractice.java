package chapter01;

public class Ex14IfPractice {
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 30;

		System.out.println("---초기값---");
		System.out.println("n1: " + n1);
		System.out.println("n2: " + n2);

		
		// Q1: n1값이 항상 큰 값이 되도록, 필요할 경우 n1과 n2를 교체하라.
		if (n1 < n2) {
			System.out.println();
			System.out.println("---결과값---");
			int n3 = n2;
			int n4 = n1;
			System.out.println("n1: " + n3);
			System.out.println("n2: " + n4);
		}
		else {
			System.out.println();
			System.out.println("---결과값---");
			System.out.println("n1: " + n1);
			System.out.println("n2: " + n2);
		}
		
	}
}
