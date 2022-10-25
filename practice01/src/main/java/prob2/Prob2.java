package prob2;

public class Prob2 {
	public static void main(String[] args) {
		int x = 0;
		for(int i = 1 ; i < 10  ; i++) {
//			int x = 0; // 안쪽에다가 설정하면 값이 다르게나옴... 생각해보자
			for(int j = (1 + x) ; j <= (10 + x) ; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
			x += 1; 
		}
	}
}
