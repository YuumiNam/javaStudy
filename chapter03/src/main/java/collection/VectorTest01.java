package collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest01 {
	public static void main(String[] args) {
		// 옛날버전 메소드를 쓴 Vector. 요즘에는 List가 나와서 잘 안씀
		// List랑은 상관없는 클래스, 그렇다고 이 메소드를 List랑 섞어쓰는건 매우 좋지않음
		Vector<String> v = new Vector<>();
		
		v.addElement("둘리");
		v.addElement("마이콜");
		v.addElement("도우너");
		
		// 순회1
		for(int i = 0; i < v.size(); i++) {
			String s = v.elementAt(i);
			System.out.println(s);
		}
		
		
		// 삭제
		v.removeElementAt(2);
		System.out.println();
		
		
		// 순회2 
		Enumeration<String> e = v.elements();
		while(e.hasMoreElements()) {
			String s = e.nextElement();
			System.out.println(s);
		}
	}
}
