package prob02;

public class Goods {
	// 필드
	private String name;
	private int price;
	private int countStock;
	
	// 생성자
	public Goods() {
		
	}
	public Goods(String name, int price, int countStock) {
		this.name = name;
		this.price = price;
		this.countStock = countStock;
	}
	
	// 메소드
	public void showInfo() {
		System.out.println(name + "(가격:" + price + ")이 " + countStock + "개 입고 되었습니다.");
	}
}
