package thread;

import java.util.ArrayList;
import java.util.List;

public class ThreadMain {
	public static void main(String[] args) {
		List<Object> list = new ArrayList<>();
		
		Thread thread1 = new DigitThread(list);
		Thread thread2 = new AlphabetThread(list);
		
		thread1.start();
		thread2.start();
	}
}
