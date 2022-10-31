package chapter03;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
	public static void main(String[] args) {
		// Set은 중복을 허용하지않음
		// 중복을 걸러내는 과정에서 내용(동질성)이 중요한것이지 동일성이 중요하지는않음
		// 그래서 중복인지 아닌지 걸러내는 과정에서 hashCode()를 필요로하게됨
		// 해시코드값이 다르면 다른 객체로 판단하고, 해시 코드값이 같으면 그때 equals()메소드로 다시 비교해서 레퍼런스 값도 같다면 동등 객체로 판단함
		
		Set<Rect> set = new HashSet();
		
		Rect r1 = new Rect(10, 20);
		Rect r2 = new Rect(10, 20);
		
		set.add(r1);
		set.add(r2);
		
		for(Rect r : set) {
			System.out.println(r);
		}
	}
}
