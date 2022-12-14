package prob5;

public class MyStack {
	// 필드
	private String[] buffer; // String밖에 못담는다는게 아쉬움
	private int top;
	
	
	// 생성자
	public MyStack(int size) {
		top = -1;
		buffer = new String[size];
	}
	
	
	// 메소드
	// push를 했을때 자리가 없으면 배열의 크기를 2배 늘려줘야함
	public void push(String s) {
		if(top == buffer.length - 1) {
			resize();
		}
		buffer[++top] = s;
	}

	public boolean isEmpty() {
		return top == 0;
	}

	public String pop() throws MyStackException{
		if(isEmpty()) {
			throw new MyStackException("stack is empty");
		}

		String result = buffer[top];
		buffer[top--] = null;

		return result;
	}
	
	public void resize() {
		String[] temp = new String[buffer.length*2];
		for(int i = 0 ; i <= top ; i++) {
			temp[i] = buffer[i];
		}
		buffer = temp;
	}
}