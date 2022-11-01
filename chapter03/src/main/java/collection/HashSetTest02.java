package collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest02 {
	public static void main(String[] args) {
		Set<GuGuDan> s = new HashSet<>();
		
		s.add(new GuGuDan(2,3));
		s.add(new GuGuDan(9,9));
		s.add(new GuGuDan(3,2)); // 2x3과 같은것으로 판단
		
		for(GuGuDan d : s) {
			System.out.println(d);
		}
	}
}
