package prob1;

public class SortMain {
	public static void main(String[] arg) {
		int[] array = {5, 9, 3, 8, 60, 20, 1};
		int count =  array.length;
		
		
		System.out.println("Before sort.");
		for(int i = 0; i < count; i++) {
			System.out.print(array[i] + " ");
		}
		
		
		// 정렬 알고리즘
		for(int i = 0 ; i < count ; i++) {	
			for(int j = 0 ; j < count ; j++) {
				if(j == count -1) {
					break;
				}
				if(array[j] < array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				  } 
				else {
					continue;
				}
			}
		}

		// 결과 출력
		System.out.println("\nAfter Sort.");
		for(int i = 0; i < count; i++) {
		    System.out.print(array[i] + " ");
		}		
	}
}