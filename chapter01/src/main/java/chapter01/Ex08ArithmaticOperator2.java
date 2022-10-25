package chapter01;

public class Ex08ArithmaticOperator2 {
	public static void main(String[] args) {
		final int TIME = 20000; // 20000초
		
		int hours = TIME / 3600; // TIME/60/60
		int minutes = (TIME % 3600) / 60; // TIME/60%60
		int seconds = (TIME % 3600) % 60; // TIME%60
		
		System.out.println(TIME + "초는 " + hours + "시간 " + minutes + "분 " + seconds + "초 입니다.");
	}
}
