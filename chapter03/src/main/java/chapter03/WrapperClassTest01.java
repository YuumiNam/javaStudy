package chapter03;

public class WrapperClassTest01 {
	public static void main(String[] args) {
		// 굳이 이렇게 wrapper할필요는 없음
		// 리터럴 String처럼 wrapper class도 불변성이 기본
		Integer i = new Integer(10);
		Character c = new Character('c');
		Boolean b = new Boolean(true);
		
		// Auto Boxing
		Integer i2 = 10;
		Character c2 = 'c';
		
		System.out.println(i2 == 10);
		System.out.println(i2.intValue() == 10); //auto unboxing
		
		System.out.println(i2.equals(10));
		System.out.println(i2.equals(new Integer(10))); //auto boxing
	}
}
