package chapter02;

public class SwapTest03 {
	public static void main(String[] args) {
		SwapValue a = new SwapValue(10);
		SwapValue b = new SwapValue(20);
		
		System.out.println(a.value + " : " + b.value);
		
		swap(a, b);
		// 이렇게해주면 SwapValue a = new SwapValue(10); , SwapValue b = new SwapValue(20); 를 해줬기때문에 reference변수에 저장이된거임.
		// swap(m, n)에 있는 m과 n이 가리키고 있는 객체의 값이 온전히 a, b가 저장된 값으로 찾아감
		
		System.out.println(a.value + " : " + b.value);
		
	}
	
	// 정적 메소드
	public static void swap(SwapValue m, SwapValue n) {
		int temp = m.value;
		m.value = n.value;
		n.value = temp;
	}
}
