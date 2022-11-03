package prob01;

public class Printer {
	// 메소드
//	public void println(int i) {
//		System.out.println(i);
//	}
//	
//	public void println(boolean b) {
//		System.out.println(b);
//	}
//	
//	public void println(double d) {
//		System.out.println(d);
//	}
//	
//	public void println(String s) {
//		System.out.println(s);
//	}
	
	// 제너릭 메소드 + 가변 파라미터  "하지만, 제너릭과 가변파라미터는 자바의 특징인 오버로딩을 무시하는결과를 낳아버림"
	public <T> void println(T... ts) {
		for(T t : ts) {
			System.out.println(t);
		}
	}
	
	
	// 제너릭 메소드 : 메소드가 생성될 때 타입을 결정하겠다는 뜻
	public <T> void println(T t) {
		System.out.println(t);
	}
	
	// 가변 파라미터 : 파라미터의 개수를 정하지않고 여러개 넣고싶을때
	public int sum(int... nums) {
		int sum = 0;
		for(int i : nums) {
			sum += i;
		}
		return sum;
	}
}
