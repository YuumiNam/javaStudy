package prob4;

import java.util.Scanner;

public class Prob4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("문자열을 입력하세요 : ");
		String text = sc.nextLine();
		
		
		for(int i = 0; i < text.length(); i++) {
			for(int j = 0 ; j <= i; j++) {
				char answer = text.charAt(j);
				System.out.print(answer);
			}
			System.out.println();
	   }
	   sc.close();
	}

}