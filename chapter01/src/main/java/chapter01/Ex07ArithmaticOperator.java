package chapter01;

public class Ex07ArithmaticOperator {
	public static void main(String[] args) {
		int a = 3;
		int b = 7;
		
		// binary operator
		System.out.println(a + b); // 10
		System.out.println(a - b); // -4
		System.out.println(a * b); // 21
		System.out.println(a / b); // 0
		System.out.println(a % b); // 3
		
		
		// unary operator
		System.out.println(-a);  // -3
		
		
		System.out.println(++a); // 4 (a = a+1 , a += 1와 같음) 
		System.out.println(a++); // 4 일단은 출력하고 이후에 a에 1을 더하라는뜻 (연산을 다 하고나서 변수 a에 1을 더하라는 뜻)
		System.out.println(a); // 5 위에서 a++이기 때문에 a에 1을 더해준 숫자로 바뀜
		
		
		System.out.println();
		int k = 10 + a++;
		System.out.println(k); // 15
		System.out.println(a); // 6
		
	}
}
