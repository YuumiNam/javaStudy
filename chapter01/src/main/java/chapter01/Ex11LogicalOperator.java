package chapter01;

public class Ex11LogicalOperator {
	public static void main(String[] args) {
		// ! (not)
		// ! true => false
		// ! false => true
		System.out.println(!(3 != 2));
		
		// && (and)
		// true && false => false
		// false && false => false
		//true && true => true
		System.out.println((3 > 2) && (3 > 4));
		
		
		// || (or)
		// true || false => true
		// false || false => false
		//true || true => true
		System.out.println((3 == 2) || (5 < 6));
		
		
		// ^ (xor) : 딱 한개만 참일경우만 true
		// true ^ false => true
		// false ^ false => false
		//true ^ true => false
		System.out.println((3 != 2) ^ (-1 > 0));
	}
}
