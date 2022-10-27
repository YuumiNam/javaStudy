package prob04;

public class Employee {
	// 필드
	private String name;
	private int salary;
	
	
	// 생성자
	public Employee() {
	}

	Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	
	// getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	// 메소드
	public void getInformation() {
		System.out.println( "이름:" + name + "연봉:" + salary );
	}
}
