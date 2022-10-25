package chapter01;

public class Ex16Switch {
	public static void main(String[] args) {
		String grade = " " ;
		int score = 100;
		
		switch(score / 10) {
			case 10 : {	// score = 100
				grade = "A+";
				System.out.println("학점은 " + grade + "입니다");
				break;
			}
			case 9 : {	// 90 <= score < 100
				grade = "A";
				System.out.println("학점은 " + grade + "입니다");
				break;
			}
			case 8 : {	// 80 <= score < 90
				grade = "B";
				System.out.println("학점은 " + grade + "입니다");
				break;
			}
			case 7 : {	// 70 <= score < 80
				grade = "C";
				System.out.println("학점은 " + grade + "입니다");
				break;
			}
			case 6 : {	// 60 <= score < 70
				grade = "D";
				System.out.println("학점은 " + grade + "입니다");
				break;
			}
			default : {
				grade = "F";
				System.out.println("학점은 " + grade + "입니다");
				break;
			}
		}
	}
}
