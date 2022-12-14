package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("둘리");
		list.add("마이콜");
		list.add("도우너");
		
		
		// 순회1
		for(int i = 0 ; i < list.size() ; i++) {
			String s = list.get(i);
			System.out.println(s);
		}
		
		
		// 삭제
		list.remove(2);
		System.out.println();
		
		
		// 순회2
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
		
		
		// 순회3
		// 배열도 내부적으로 Iterator가 적용되어 for each문을 지원해줌
		for(String s:list) {
			System.out.println(s);
		}
	}
}
