package chapter03;

public class StringTest03 {
	public static void main(String[] args) {
		// String method 몇가지
		String s1 = "aBcAbcabCAbC";
		
		// length 글자길이
		System.out.println(s1.length());
		
		// chatAt n번째 글자 1개 구하기
		System.out.println(s1.charAt(1));
		
		// indexOf 원하는글자가 있는구간 구하기
		System.out.println(s1.indexOf("Ab"));
		System.out.println(s1.indexOf("Ab,3"));
		
		// substring 원하는구간에 있는글자 나타내기
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(3,5));
		
		String s2 = "   ab   cd   ";
		String s3 = "efg,hij,klm,nop,qrs";
		
		// concat 덧붙이기
		String s4 = s2.concat(s3);
		System.out.println(s4);
		
		// trim 양옆 공백지우기
		System.out.println("--" + s2.trim() + "--");
		
		// 원하는구간 바꾸기
		System.out.println("--" + s2.replaceAll(" ","") + "--");
		
		//split 쪼개기
		String[] tokens = s3.split(",");
		for(String s:tokens) {
			System.out.println(s);
		}
		
		//못자를경우 null을 리턴하지는 않는다
		String[] tokens2 = s3.split(" ");
		for(String s:tokens2) {
			System.out.println(s);
		}
	}
}
