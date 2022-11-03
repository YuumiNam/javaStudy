package prob5;

public class MyStack03<T> { // 제너릭 클래스 : 객체가 생성될 때 타입을 결정하겠다는 뜻
	// 필드
	private T[] buffer; // String뿐만 아니라 다른타입도 넣을수있음
	private int top;
			
			
	// 생성자
	@SuppressWarnings("unchecked")
	public MyStack03(int size) {
		top = -1;
		buffer = (T[])new Object[size];
	}
			
			
	// 메소드
	// push를 했을때 자리가 없으면 배열의 크기를 2배 늘려줘야함
	public void push(T o) {
		if(top == buffer.length -1) {
			resize();
		}
		buffer[++top] = o;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public T pop() throws MyStackException{
		if (isEmpty()) {
			throw new MyStackException("stack is empty");
		}

		T result = buffer[top];
		buffer[top--] = null;

		return result;
		}
			
	public void resize() {
		@SuppressWarnings("unchecked")
		T[] temp = (T[])new Object[buffer.length*2];
		for(int i = 0 ; i <= top ; i++) {
			temp[i] = buffer[i];
		}
		buffer = temp;
	}
}
