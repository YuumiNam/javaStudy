package chapter02;

public class Goods {
	// 접근제어자 private : 클래스 내부에서만 쓸 수 있도록함. 정보를 은닉시켜 외부로부터 보호함
	// 정보를 보호하고싶은마음은 그렇다치고 다른 클래스에서 참조를 하고 싶다면?? 따로 setter와 getter를 만들어서 참조하는방식으로 한다
	
	// (static)클래스 변수(필드)
	public static int countOfGoods = 0;
	
	// 필드 (private를 많이씀)
	private String name;
	private int price;
	private int countStock;
	private int countSold;
	
	// 생성자 (생성자를 개발자가 한개도 안만들어준다면 기본생성자가 만들어짐)
	public Goods() {
		countOfGoods++;
	}
	
	// 메소드 (public을 많이씀)
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getCountStock() {
		return countStock;
	}
	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}
	
	public int getCountSold() {
		return countSold;
	}
	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}
	
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", countStock=" + countStock + ", countSold=" + countSold
				+ "]";
	}
}
