package chapter02;

import goods2.Goods2;

public class Goods2Discount extends Goods2 {
	private float discountRate = 0.3f;
	
	public int getDiscountPrice() {
		// 필드 price는 접근제어자가 protected로 되어있기때문에 자식접근이 가능.
		return (int)(discountRate * price);
	}
}
