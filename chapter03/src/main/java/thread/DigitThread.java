package thread;

import java.util.List;

public class DigitThread extends Thread {
	// 필드
	private List<Object> list;
	
	// 생성자
	public DigitThread() {
		
	}
	public DigitThread(List<Object> list) {
		this.list = list;
	}
	
	// 메소드
	@Override
	public void run() {
		for(int i = 1; i <= 10 ; i++) {
			System.out.print(i + " ");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
