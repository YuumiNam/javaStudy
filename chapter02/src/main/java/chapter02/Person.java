package chapter02;

public class Person {
	// 필드
	private String name;
	
	// 생성자
	public Person() {
		System.out.println("Person() called");
	}
	
	// getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
