package chapter02;

public class StudentMain {
	public static void main(String[] args) {
		// 자식클래스의 인스턴스를 생성했을때 Student()의 부모인 Person()의 생성자도 반응하는지...!!
		// 자식생성자 = this, 부모생성자 = super()
		// 자식의 모든 생성자에서 부모의 특정 생성자를 명시하지않으면 부모의 기본생성자가 자식생성자 코드 앞에 호출된다.
		Student s = new Student();
	}
}
