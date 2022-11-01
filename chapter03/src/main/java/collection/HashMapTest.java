package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<>();
		
		// (key, value) key값은 불변으로 쓰도록
		m.put("one", 1); // auto boxing
		m.put("two", 2);
		m.put("three", 3);
		
		int i = m.get("one"); // auto unboxing
		int j = m.get(new String("two"));
		System.out.println(i + ":" + j);
		
		m.put("three", 3333);
		System.out.println(m.get("three")); // 에러가 안뜨고 원래의 3이 3333으로 바뀜
		
		// 순회
		Set<String> s = m.keySet();
		for(String key : s) {
			System.out.println(key);
		}
	}
}
