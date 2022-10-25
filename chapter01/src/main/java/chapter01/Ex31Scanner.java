package chapter01;

import java.util.Scanner;

public class Ex31Scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//정수 입력받기
//		System.out.print("숫자를 하나 입력하세요 : ");
//		int number = sc.nextInt();
//		
//		System.out.println(number);
		
		 
		//응용
		System.out.println("상품 정보를 입력하세요.");
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		System.out.print("재고량 : ");
		int countStock = sc.nextInt();
		
		System.out.println(name + "," + price + "," + countStock);
		sc.close();
	}
}
