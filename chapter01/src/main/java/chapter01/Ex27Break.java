package chapter01;

public class Ex27Break {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
//		while (sum < 5000) {
//			sum += i;
//			i++;
//		}
		
		while(true) {
			if(sum > 5000) {
				break;
			}
			sum += i;
			i++;
		}
		
		
		System.out.println("i :" + i);
		System.out.println("sum : " + sum);
	}
}
