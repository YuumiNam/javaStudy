package prob04;
public class Prob04 {

	public static void main(String[] args) {
		char[] c1 = reverse("Hello World");
		printCharArray(c1);
		System.out.println();
		
		char[] c2 = reverse("Java Programming!");
		printCharArray(c2);
	}
	
	public static char[] reverse(String str) {
		char[] cs = str.toCharArray();
		return cs;
	}

	public static void printCharArray(char[] array){
		for(int i = array.length - 1 ; i >= 0 ; i--) {
			System.out.print(array[i]);
		}
	}
}