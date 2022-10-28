package exception;

public class UncheckedExceptionTest {
	public static void main(String[] args) {
		// Unchecked Exception은 예외처리 없이 발생해야한다.
		// 예외를 보고 수정해야 하는 로직에대한 에러이기 때문(본인이 잘못짠 코드르 그냥 고치면 된다는 뜻)
		
		// ArrayIndexOutOfBoundException
		// ArithmeticException
		// NullPointException
		
//		try {
		  int[] a = {1, 2, 3, 4, 5}; 
	      for( int i = 0; i <= 5; i++ ) {
	          System.out.println(a[i]);
	      }
//		}
//	    catch(Exception e) {
			// 1. 사과
//			System.out.println("죄송합니다. 일시적인 오류가 있습니다");
//			
			// 2. 로깅
//			System.out.println("error : " + e);
//			
			// 3. 정상 종료
//			return;
//		}
	}
}
