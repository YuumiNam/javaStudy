package collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>();
		
		q.offer("마이콜");
		q.offer("둘리");
		q.offer("도우너");
		
		while(!q.isEmpty()) {
			String s = q.poll();
			System.out.println(s); // 제일 먼저 넣었던 값 순서로 나옴
		}
		System.out.println();
		
		
		q.offer("마이콜");
		q.offer("둘리");
		q.offer("도우너");
		
		System.out.println(q.poll());
		System.out.println(q.peek());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll()); // 비어있으면 에러가 아닌 null이 뜸
	}
}
