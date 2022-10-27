package chapter02;

public class Student extends Person {
	// 핃드
	private String magor;
	private int grade;
	
	// 생성자
	public Student() {
		// 자식의 모든 생성자에서
		// 부모의 특정 생성자를 명시하지않으면
		// 자식의 모든 생성자에서 부모의 특정 생성자를 명시하지않으면 부모의 기본생성자가 자식생성자 코드 앞에 호출된다.
		
		// super();
		System.out.println("Student() called");
	}
	
	// getter setter
	public String getMagor() {
		return magor;
	}
	public void setMagor(String magor) {
		this.magor = magor;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
}
