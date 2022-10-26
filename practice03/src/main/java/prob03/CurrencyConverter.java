package prob03;

public class CurrencyConverter {
	public static void setRate(double d) {
		System.out.println("환율은 1달러당 " + d + "원입니다");
	}

	public static double toDollar(int i) {
		double result = i / 1433;
		return result;
	}

	public static double toKRW(int i) {
		double result = i * 1433;
		return result;
	}
}
