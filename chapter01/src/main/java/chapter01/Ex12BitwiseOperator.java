package chapter01;

public class Ex12BitwiseOperator {
	public static void main(String[] args) {
		int a = 0x0f; //16진수와 2진수
		int b = 0xf0;
		
		System.out.println(a);
		System.out.println(b);
		
		
		// 비트 논리 연산자 AND(&), OR(|), XOR(^), NOT(~)
		// 비트 이동 연산자 우측으로 n비트 이동(>>n) 좌측으로 n비트 이동(<<n)
		System.out.println();
		System.out.println(a & b);
		System.out.println(a | b);
		System.out.println(a ^ b);
		System.out.println(~a);
		System.out.println(a >> 3);
		System.out.println(a << 3);
		
	}
}
