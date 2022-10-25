package goods2;

public class Goods2 {
	public String name; // 접근제어자 public : 모든 접근이 가능하다
	protected int price; // 접근제어자 protected : 같은 패키지 내에서만(실효성x) + 자식접근!!
	int countStock; // 접근제어자 default(아무것도 설정을 안해준상태) : 같은 패키지 내에서만(실효성x) "접근제어자를 명시 안해주는것은 매우 안좋은 습관!!"	
}
