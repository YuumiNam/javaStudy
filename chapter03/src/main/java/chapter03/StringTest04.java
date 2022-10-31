package chapter03;

public class StringTest04 {
	public static void main(String[] args) {
		// 이게 되는이유는?
		String s1 = "Hello " + "World " + "Java " + 12;
		System.out.println(s1);
		
		// 내부적으로는 이렇게 StringBuffer를 씀
		String s2 = new StringBuffer("Hello ").append("World ").append("Java ").append(12).toString();
		System.out.println(s2);
		
		
		// 이 코드는 i 값이 커질수록 문제가 생김 연산이 엄청 느림
		// for문 안에서 new 연산이 계속 일어나기때문
		// String '+'연산을 오래하는경우는 좋지않음
//		String s3 = "";
//		for(int i = 0 ; i < 100000; i++) {
//			s3 += i;
//		}
//		System.out.println(s3);
		
		// 이럴때 명시적으로
		// StringBuffer를 쓴다
		StringBuffer sb3 = new StringBuffer("");
		for(int i = 0; i < 100000; i++) {
			sb3.append(i);
		}
		String s3 = sb3.toString();
		System.out.println(s3.length());
	}
}
