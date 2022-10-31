package chapter03;

public class ObjectTest03 {
	public static void main(String[] args) {
//		원래라면 객체는 무조건 heap에 저장된다.
//		하지만 리터럴을 했을때는 heap이 아닌 ConstantPool에 저장이되고, 레퍼런스 값을 참조할때만 heap에 저장이 된다("Hello"는 heap에 저장)
//		그리고 그 레퍼런스 값은 s3와 s4가 모두 공유한다.
//
//		"String이 객체임에도 불구하고 왜 new를 쓰지않는가??"
//		리터럴은 객체끼리의 구분이 필요한것이 아니라 "s3와 s4의 내용이 같은가"가 중요하기때문에 객체를 공유시켜야한다.
//		ex) s3와 s4가 같은 객체라면 s3를 함부로 변하지못하게함. s4에서 문제가 생길수 있기 때문
//
//		결론 : String은 new로 만들었을때와 리터럴로 만들었을때는 다르다.
		
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		
		System.out.println(s1 == s2); // 동일성비교
		System.out.println(s1.equals(s2)); // 동질성비교
		System.out.println(s1.hashCode() + ":" + s2.hashCode()); // equals()와 같이쓰는 내용기반의 해시값
		System.out.println(System.identityHashCode(s1) + ":" + System.identityHashCode(s2)); // 주소기반의 해시값
		
		System.out.println();
		
		String s3 = "Hello";
		String s4 = "Hello";
		
		System.out.println(s3 == s4); // "왜 동일성이 같다고 나올까??"
		System.out.println(s3.equals(s4));
		System.out.println(s3.hashCode() + ":" + s4.hashCode()); // equals()와 같이쓰는 내용기반의 해시값
		System.out.println(System.identityHashCode(s3) + ":" + System.identityHashCode(s4)); // 주소기반의 해시값
	}
}
