package chapter01;

public class Ex24GuGuDan {
	public static void main(String[] args) {
		// 구구단 1단 구하기
		for(int i = 1 ; i <= 9 ; i++) {
			System.out.println("1" + " x " + i + " = " + 1*i);
		}
		System.out.println();
		System.out.println("=================");
		System.out.println();
	
		// 구구단 전체 구하기	
		for(int i = 2 ; i <= 9 ; i++) {
			for(int j = 1 ; j <= 9 ; j++) {
				System.out.println(i + " x " + j + " = " + i*j);
			}
			System.out.println();
		}
	}
}
