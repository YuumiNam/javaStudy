package chapter02;

public class SwapTest02 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println(a + " : " + b);
		
		
		swap(a, b);
	
		
		System.out.println(a + " : " + b);
		// 이렇게 쓴것은 a와 b가 실제 값에 저장되는 것이기 때문에 레퍼런스 변수를 전달하는것과는 관계가 없기 때문에 안변함
	}
	
	public static void swap(int m, int n) {
		int temp = m;
		m = n;
		n = temp;
	}
}

