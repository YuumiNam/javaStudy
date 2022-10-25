package chapter01;

public class Ex26Continue {
	//1부터 20까지의 정수중 3의배수를 빼고 출력하라
	public static void main(String[] args) {
		for(int i = 0 ; i < 20 ; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i);
			
//			if (i %2 != 0) {
//				System.out.println(i);
//			}
		}
	}
}
