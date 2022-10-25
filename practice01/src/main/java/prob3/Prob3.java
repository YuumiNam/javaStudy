package prob3;

import java.util.Scanner;

public class Prob3 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		
		int input = sc.nextInt();
		int result = 0;
		
		if (input % 2 == 1) {
			for(int i = 1; i <= input ; i++) {
				if(i % 2 == 1) {
					result = result + i;
				}
			}
			System.out.println("결과 값 : " + result);
		} else {
			for(int i = 1; i <= input ; i++) {
				if(i % 2 == 0) {
					result = result + i;
				}
			}
			System.out.println("결과 값 : " + result);
		}
		
		
		
		
		
//		// 홀수를 넣었을 때의 합산값
//		for(int i = 1; i <= input ; i++) {
//			if(i % 2 == 1) {
//				result = result + i;
//			}
//		}
//		System.out.println("결과 값 : " + result);
		
		
//		// 짝수를 넣었을 때의 합산값
//		for(int i = 1; i <= input ; i++) {
//			if(i % 2 == 0) {
//				result = result + i;
//			}
//		}
//		System.out.println("결과 값 : " + result);
		
		
		sc.close();
	}
}
