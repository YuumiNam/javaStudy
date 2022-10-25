package prob05;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		int i = 1;
		int left = 0;
		int right = 100;
		
		while( true ) {
			// 정답 랜덤하게 만들기
			Random random = new Random();
			int correctNumber = random.nextInt(100) + 1;

			// 화면에 표시하기
			System.out.println("수를 결정 하였습니다... 맞추어보세요!!" + correctNumber);
			System.out.println(left + "-" + right);
			
			// 알고리즘 작성하기
			while(true){
				System.out.print(i + " >> ");
				int answer = scanner.nextInt();
				
				if(answer < correctNumber) {
					System.out.println("더 높게!!");
					System.out.println(answer + "-" + right);
					i++;
					left = answer;
				}else if(answer > correctNumber) {
					System.out.println("더 낮게..");
					System.out.println(left + "-" + answer);
					i++;
					right = answer;
				}
				else{
					System.out.println("정답입니다....!!");
					break;
				}
			}
			
			//새 게임 여부 확인하기
			System.out.print("다시 하겠습니까(y/n)>>");
			String answer = scanner.next();
			if( "y".equals( answer ) == false ) {
				break;
			}
		}
		scanner.close();
	}
}