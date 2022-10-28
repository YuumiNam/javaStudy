package exception;

public class MyClassMain {
	public static void main(String[] args) {
		try {
		MyClass myclass = new MyClass();
		myclass.danger();
		} catch(MyException e) {
			System.out.println("error:" + e);
		}
	}
}
