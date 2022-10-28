package exception;

public class MyException extends Exception {
	private static final long serialVersionUID = 1L;

	// 생성자
	public MyException(String message) {
		super(message);
	}
	
	public MyException() {
		super("MyException thrown");
	}
}
