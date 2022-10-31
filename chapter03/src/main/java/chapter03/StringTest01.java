package chapter03;

public class StringTest01 {
	public static void main(String[] args) {
		// \t: tab
		// \r: carrige return
		// \n: new line "요즘에는 \n = \r\n"
		System.out.println("c:\temp");
		System.out.print("hello world\n");
		System.out.println("hello\tworld");
		System.out.println();
		
		
		// "\" <<< 이거를 화면상에 나타내고 싶을때에는??
		// 앞에 \써줌
		System.out.println("c:\\temp");
		System.out.println();
		
		// "" <<< 이거를 화면상에 나타내고 싶을때에는??
		// 앞에 \써줌
		System.out.println("\"hello\"");
	}
}
