package thread;

import java.util.List;

public class AlphabetThread extends Thread {
	// 필드
	private List<Object> list;
	
	// 생성자
	public AlphabetThread() {
	}
	
	public AlphabetThread(List<Object> list) {
		this.list = list;
	}
	
	// 메소드
	@Override
	public void run() {
		// 락을 거는방법
		// ArrayList에 여러개의 쓰레드가 실행될때 엉키는것을 방지 = 동기화
//		synchronized(list) {
//			list.add(null); // sleep도 동기화역할을 한다??
//		}
		
		for(char c = 'a'; c <= 'z' ; c++) {
			System.out.print(c + " ");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
