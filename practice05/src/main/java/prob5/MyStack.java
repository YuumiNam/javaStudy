package prob5;

public class MyStack {
	// 필드
	private String[] buffer;
	
	
	// 생성자
	public MyStack(int size) {
		String[] buffer = new String[size];
	}
	
	
	// 메소드
	public void showBuffer() {
		System.out.println(buffer);
	}
	
	
	public void push(String s) {
		for(int i = 0 ; i < buffer.length ; i++) {
			if(buffer[i] == null) {
				buffer[i] = s;
				break;
			}else {
				continue;
			}
		}
	}

	public boolean isEmpty() {
		if(buffer[buffer.length - 1] == null) {
			return true;
		}
		else {
			return false;
		}
	}

	public String pop() {
		String s = buffer[buffer.length-1];
		return s;
	}
}