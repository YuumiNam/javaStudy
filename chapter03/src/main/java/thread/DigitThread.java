package thread;

import java.util.List;

public class DigitThread extends Thread {
	// 필드
	private List list;
	
	// 생성자
	public DigitThread() {
		
	}
	public DigitThread(List list) {
		this.list = list;
	}
	
	// 메소드
	@Override
	public void run() {
		for(int i = 1; i <= 10 ; i++) {
			System.out.print(i + " ");
		}
	}
}