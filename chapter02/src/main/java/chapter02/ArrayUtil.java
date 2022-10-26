package chapter02;

public class ArrayUtil {
	public static double[] intToDouble(int[] a) {
		double[] result = null;
		
		if(a == null) {
			return result;
		}
		
		result = new double[a.length];
		for(int i = 0; i < a.length; i++) {
			result[i] = a[i];
		}
		return result;
	}

	
	public static int[] doubletoInt(double[] d) {
		int[] result = null;
		
		if(d == null) {
			return result;
		}
		
		result = new int[d.length];
		for(int i = 0 ; i < d.length ; i++) {
			result[i] = (int)d[i];
		}
		return result;
	}


	public static int[] concat(int[] a, int[] b) {
		int size = 0;
		if(a != null) {
			size += a.length;
		}
		if(b != null) {
			size += b.length;
		}
		
		
		int[] result = new int[size];
//		int[] result = new int[(a == null ? 0 : a.length) + (b == null ? 0 : b.length)]; // if문의 간결화
		
		
		// for each문 = 원래 for문은 우리가 직접 배열자리에 접근하여 값을 넣어주는방식이었다면 for each문은 배열에 있는 값을 가져와서 사용하는방식
		// 단, index값은 정해줘야함
		int index = 0;
		for(int v : a) {
			result[index++] = v;
		}
		for(int v : b) {
			result[index++] = v;
		}
		
		return result;
	}
	
}
