package prob04;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee pt = new Depart( "홍길동", 3000, "개발부" ); //upcasting
		pt.getInformation();
	}
}