package collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
	public static void main(String[] args) {
		Set<String> s = new HashSet<>();
		
		String s1 = new String("도우너");
		String s2 = new String("도우너");
		
		s.add("둘리");
		s.add("마이콜");
		s.add("또치");
		s.add(s1);
//		s.add(s2); // 객체가 달라도 값이 다르면 중복됨!!! 자료구조는 무조건 값이 중요... 객체의동일성 필요없음
		
		System.out.println(s.size());
		System.out.println(s.contains(s2)); // s1을 넣었지만 s2와 내용이 동일하므로 같은것으로 생각!!
		
		// 순회
		// Set도 내부적으로 Iterator가 적용되어 for each문을 지원해줌
		for(String str : s) {
			System.out.println(str);
		}
	}
}
