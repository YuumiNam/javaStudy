package chapter02;

public class GoodsApp {
	public static void main(String[] args) {
		Goods camera = new Goods();
		
//		camera.name = "nikon";    <<<    Goods클래스가 필드의 접근제어자를 private로 만들었기 때문에 직접 필드를 참조할수는 없음
//		camera.price = 400000;           참조하기 위해서는 따로 setter와 getter메소드를 만들어서 접근을 해준다
//		camera.countStock = 30;
//		camera.countSold = 50;
		
		camera.setName("nikon");
		camera.setPrice(400000);
		camera.setCountStock(30);
		camera.setCountSold(50);
		
		
		System.out.println(camera); // goods클래스에 가서 source - generate to string해주면 우리가 아는 문자열로 나옴
		
//		System.out.println(camera.name);   <<<   마찬가지로 필드의 접근제어자를 private로 만들었기 때문에 직접 참조할수는 없음
//		System.out.println(camera.price);
//		System.out.println(camera.countStock);
//		System.out.println(camera.countSold);
		
		System.out.println(camera.getName());
		System.out.println(camera.getPrice());
		System.out.println(camera.getCountStock());
		System.out.println(camera.getCountSold());
		
	
		System.out.println(Goods.countOfGoods);
		
		// return값과 파라미터가 모두 필요한 메소드를 짜보자
		// 메소드를 만들기전에 일단 있다고 생각하고 코드를 짜보자
		int discountPrice = camera.calcDiscountPrice(0.5);
		System.out.println("Discout Price : " + discountPrice);
		
		
		Goods g4 = new Goods("TV", 10000, 10, 0);
		System.out.println(g4);
		System.out.println(Goods.countOfGoods);
	}
}
