package chapter03;

public class WrapperClassTest02 {
	public static void main(String[] args) {
		// 문자를 숫자로 바꾸고싶을때
		// wrapper class로 접근해서 parseInt() 메소드 호출
		String s1 = "123456";
		int i = Integer.parseInt(s1);
		
		// 반대로
		String s2 = String.valueOf(i);
		
		// 반대로2
		String s3 = "" + i;
		
		System.out.println(i);
		System.out.println(s1 + ":" + s2 + ":" + s3);
		
		
		char c = 'A';
		int i2 = Character.getNumericValue(c);
		System.out.println(i2);
		
		
		// 2진수
		String s4 = Integer.toBinaryString(15);
		System.out.println(s4);
		
		// 16진수
		String s5 = Integer.toHexString(15);
		System.out.println(s5);
	}
}
