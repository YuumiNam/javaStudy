package prob02;

import java.util.Arrays;
import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Goods[] goods = new Goods[COUNT_GOODS];

		// 상품 입력
		for(int i = 0; i < COUNT_GOODS ; i++) {
		String line = sc.nextLine();
		String[] info = line.split(" ");
		
		System.out.println(Arrays.toString(info));
		
		String name = info[0];
		int price = Integer.parseInt(info[1]);
		int countStock = Integer.parseInt(info[2]);
		
		Goods gi = new Goods(name, price, countStock);
		gi.showInfo();
		// 자원정리
		sc.close();
		}
	}
}
