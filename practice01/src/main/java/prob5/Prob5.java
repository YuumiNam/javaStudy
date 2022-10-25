package prob5;

public class Prob5 {
    // 100미만의 숫자에서 369게임 "짝"을 몇번쳐야하는가 출력하기
	public static void main(String[] args) {
		for(int i = 1 ; i < 100 ; i++) {
			System.out.print(i + " ");
			String number = String.valueOf(i);
			for(int j = 0 ; j < number.length() ; j++) {
				if(number.charAt(j) == '3') {
					System.out.print("짝");
				} else if(number.charAt(j) == '6') {
					System.out.print("짝");
				} else if(number.charAt(j) == '9') {
					System.out.print("짝");
				}
			}
			System.out.println();
		}
	}
}
