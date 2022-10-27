package chapter02;

public class StudentMain {
	public static void main(String[] args) {
		// 자식클래스의 인스턴스를 생성했을때 Student()의 부모인 Person()의 생성자도 반응하는지...!!
		// 자식생성자 = this, 부모생성자 = super()
		// 자식의 모든 생성자에서 부모의 특정 생성자를 명시하지않으면 부모의 기본생성자가 자식생성자 코드 앞에 호출된다.
		Student s1 = new Student();
		s1.setGrade(1);
		
		Person p1 = s1; 		  // up casting(자식클래스가 부모클래스로 변환되는것)(명시적으로 타입변환 할 필요가 없음)
		p1.setName("둘리");
		
		Student s2 = (Student)p1; // down casting(원래대로 되돌리는 것)(명시적으로 타입변환 할 필요가 있음)
		s2.setMagor("Computer Science");
	}
}
