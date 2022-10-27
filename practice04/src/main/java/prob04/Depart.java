package prob04;

public class Depart extends Employee {
	// 필드
	private String depart;

	
	// 생성자
	public Depart(String name, int salary, String depart) {
		super(name, salary);
		this.depart = depart;
	}
	
	
	// 메소드
	@Override
	public void getInformation() {
		System.out.println( "이름:" + getName() + " 연봉:" + getSalary() + " 부서:" + depart);
	}
}
