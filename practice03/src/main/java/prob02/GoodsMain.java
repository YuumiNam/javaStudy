package prob02;

import java.util.Arrays;
import java.util.Scanner;

public class GoodsMain {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Goods[] goods = new Goods[COUNT_GOODS];

		// 상품 입력
		for(int i = 0; i < COUNT_GOODS ; i++) {
		String line = sc.nextLine();
		String[] info = line.split(" ");
		
		String name = info[0];
		int price = Integer.parseInt(info[1]);
		int countStock = Integer.parseInt(info[2]);
		
		goods[i] = new Goods(name, price, countStock);
		}
		for(int i = 0; i < goods.length; i++) {
			goods[i].showInfo();
		}
		
		sc.close();
	}
}
