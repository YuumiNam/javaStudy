package prob06;

import java.util.Scanner;

public class CalcMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while(true) {
			System.out.print(">> ");
			String expression = scanner.nextLine();
			
			if("quit".equals(expression)) {
				break;
			}
			
			String[] tokens = expression.split(" ");
			
			if(tokens.length != 3) {
				System.out.println(">> 알 수 없는 식입니다.");
				continue;
			}
			
			int lValue = Integer.parseInt(tokens[0]);
			int rValue = Integer.parseInt(tokens[2]);
			
			switch(tokens[1]) {
				case "+" : {
					Arith add = new Add();
					add.setValue(lValue, rValue); // setValue()도 재사용할수있을까?
					System.out.println(">> " + calculate(add));
					break;
				}
				case "-" : {
					Arith sub = new Sub();
					sub.setValue(lValue, rValue);
					System.out.println(">> " + calculate(sub));			
					break;
				}
				case "*" : {
					Arith mul = new Mul();
					mul.setValue(lValue, rValue);
					System.out.println(">> " + calculate(mul));				
					break;					
				}
				case "/" : {
					Arith div = new Div();
					div.setValue(lValue, rValue);
					System.out.println(">> " + calculate(div));				
					break;
				}
				default :  {
					System.out.println(">> 알 수 없는 연산입니다.");
				}
			}
		}
		scanner.close();
	}

	// 정적 메소드
	private static int calculate(Arith c) {
		return c.calculate();
	}
}
