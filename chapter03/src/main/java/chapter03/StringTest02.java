package chapter03;

public class StringTest02 {
	public static void main(String[] args) {
		// 리터럴 String은 불변성
		String s1 = "abc";
		String s2 = "def";
		String s3 = s2;
		
		s2 = s1.toUpperCase();
		String s4 = s2.concat("??");
		String s5 = "!".concat(s2).concat("@");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		
		String s6 = null;
		System.out.println(equalHello(s6));
	}
	
	private static boolean equalHello(String s) {
		// return s.equals("Hello");
		return "Hello".equals(s);
	}
}
