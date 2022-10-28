package exception;

public class ExceptionTest {
	public static void main(String[] args) {
		int a = 10;
		int b = 10 - a;
		
		System.out.println("some code1");
		
		// 예외처리를 위한 try - catch문
		try {
			System.out.println("some code2");
			
			int result = (1 + 2 + 3) / b;
			
			System.out.println("some code3");
			System.out.println("some code4");
			
		} catch(ArithmeticException ae) {   // 실무에서 예외처리 내용은 꼭!! 비워두지 말기 // 모든 예외처리의 상위클래스는 Exception이다
			/* 예외처리 */
			
			// 1. 사과
			System.out.println("죄송합니다. 일시적인 오류가 있습니다.");
			
			// 2. 로깅
			System.out.println("error : " + ae);
			
			// 3. 정상 종료
			// System.exit(0);
			 return;
		} finally {
			// 옵션임
			// 예외가 발생하거나 정상적으로 실행되어도 반드시 실행되는 블록
			System.out.println("자원 정리");
		}
		
		// 예외가 발생된 이후에 실행되는 코드는 비추!!!
		// System.out.println("some code4");
	}
}
