package chapter01;

public class Ex30GuGuDan2 {
	// 구구단 가로열로 찍어보기
	public static void main(String[] args) {
		for(int j = 1; j < 10 ; j++) {
			for(int i = 1; i < 10 ; i++) {
				System.out.print(i + " X " + j + " = " + i*j);
				System.out.print("\t");
			} 
			System.out.println();
		}
	}
}
