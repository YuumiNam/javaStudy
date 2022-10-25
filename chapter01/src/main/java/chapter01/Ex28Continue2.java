package chapter01;

public class Ex28Continue2 {
	public static void main(String[] args) {
//		forTest();
		whileTest();
	}
	
	
	public static void forTest() {
		for(int i = 0 ; i < 10 ; i++) {
			if (i % 2 != 0) {
				continue;
			}
			System.out.println(i);
		}
	}
	
	
	// while문에 continue를 쓸때에는 무한루프에 빠지지않게 continue와 i의증가값의 순서를 잘 설정해야함
	public static void whileTest() {
		int i = 0;
		while (i < 10) {
			if (i % 2 != 0) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
	}
}
