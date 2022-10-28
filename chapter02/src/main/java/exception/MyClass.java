package exception;

public class MyClass {
	// 메소드
	public void danger() throws MyException {
		System.out.println("some code1");
		
		if (1 - 1 == 0) {
		throw new MyException();
		}
		
		System.out.println("some code2");
	}
}
