package prob05;

public class BaseMain {

	public static void main(String[] args) {
		Base base = new MyBase(); // upcasting

		base.service("낮");
		base.service("밤");
		base.service("오후"); 
	}
}
