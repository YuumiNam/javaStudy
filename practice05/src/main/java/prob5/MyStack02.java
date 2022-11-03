package prob5;

public class MyStack02 {
	// 필드
	private Object[] buffer; // String뿐만 아니라 다른타입도 넣을수있음
	private int top;
		
		
	// 생성자
	public MyStack02(int size) {
		top = -1;
		buffer = new String[size];
	}
		
		
	// 메소드
	// push를 했을때 자리가 없으면 배열의 크기를 2배 늘려줘야함
	public void push(Object o) {
		if(top == buffer.length - 1) {
			resize();
		}
		buffer[++top] = o;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public Object pop() throws MyStackException{
		if (isEmpty()) {
			throw new MyStackException("stack is empty");
		}

		Object result = buffer[top];
		buffer[top--] = null;

		return result;
	}
		
	public void resize() {
		Object[] temp = new Object[buffer.length*2];
		for(int i = 0 ; i <= top ; i++) {
			temp[i] = buffer[i];
		}
		buffer = temp;
	}
}
