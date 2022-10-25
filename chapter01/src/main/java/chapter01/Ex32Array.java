package chapter01;

public class Ex32Array {
	public static void main(String[] args) {
		// 배열생성 기본형!
		// 선언 시 크기를 지정할 수 없다. 
		
		// 강추!!!!!
		int[] a2 = new int[5];
		System.out.println(a2.length);
		
		// 비추
		int a3[] = new int[5];
		System.out.println(a3.length);
		
		// 초기화1
		int[] a4 = {0,1,2,3,4}; // int[] a4 = new int[5]; 이거를 컴파일러가 대신 해주는것일뿐임
		System.out.println(a4.length);
		
		// 초기화2***
		int[] a5 = new int[5];
		a5[0] = 0;
		a5[1] = 1;
		a5[2] = 2;
		a5[3] = 3;
		a5[4] = 4;
		System.out.println(a5.length);
		
		// 초기화3
		int[] a6 = new int[]{0,1,2,3,4};
		System.out.println(a6.length);
		
		// 사용1 : 랜덤 접근
		System.out.println();
		System.out.println(a6[4]);
		
		// 사용2 : 순회
		System.out.println();
		for(int i = 0 ; i < a6.length ; i++) {
			System.out.print(a6[i] + " ");
		}
	}
}
