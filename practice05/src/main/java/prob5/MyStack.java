package prob5;

public class MyStack {
	// 필드
	private String[] buffer;
	private int top;
	
	
	// 생성자
	public MyStack(int size) {
		top = 0;
		buffer = new String[size];
	}
	
	
	// 메소드
	// push를 했을때 자리가 없으면 배열의 크기를 2배 늘려줘야함
	public void push(String s) {
		if(top == buffer.length) {
			resize();
		}
		buffer[top] = s;
		top++;
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
	
	public void resize() {
		String[] temp = new String[buffer.length*2];
		for(int i = 0 ; i <= top ; i++) {
			temp[i] = buffer[i];
		}
		buffer = temp;
	}
}