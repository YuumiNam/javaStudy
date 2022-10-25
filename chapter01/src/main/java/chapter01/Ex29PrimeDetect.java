package chapter01;

public class Ex29PrimeDetect {
	public static void main(String[] args) {
		// 2 ~ 1000 까지의 정수중 소수를 화면에 출력하세요.
 
		//	boolean isPrime = true; << 밖에다 넣으면 안풀림 왜인지는 생각을해보자....
		for(int num = 2; num <= 1000 ; num++) {
			boolean isPrime = true;
			for(int i = 2; i < num; i++) {
				if(num % i == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				System.out.println(num);
			}
		}	
	}
}	

