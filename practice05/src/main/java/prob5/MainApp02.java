package prob5;

public class MainApp02 {
	public static void main(String[] args) {
		try {
			MyStack02 stack = new MyStack02(3);	
			
			stack.push("Hello");
			stack.push("World");
			stack.push("!!!");
			stack.push("java");
			stack.push("12");

			while(stack.isEmpty() == false) {
				// 위험하다 : 잘못된 TypeCasting할 우려
				// 1. 작성 시 에러가 발견되지않음
				// 2. 실행 시 ClassCastException이 발생할 우려
				String s = (String)stack.pop();
				System.out.println(s);
			}

			System.out.println("======================================");

			stack = new MyStack02(3);
			stack.push("Hello");

			System.out.println(stack.pop());
			System.out.println(stack.pop());
			
		} 
		catch(MyStackException ex) {
			System.out.println(ex);
		}

	}
}
