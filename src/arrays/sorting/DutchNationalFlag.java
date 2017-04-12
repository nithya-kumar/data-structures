package arrays.sorting;

public class DutchNationalFlag {
	static int A[] = new int[] {0, 1, 2, 1, 1, 0, 2, 2, 0, 0, 1, 2, 1, 0};
	static int n = A.length;
	public static void main(String args[]) {
		System.out.println("UNSORTED ARRAY");
		printArray();
		dutchSort(A, 0, n-1);
		System.out.println("\nSORTED ARRAY");
		printArray();
	}
	
	private static void dutchSort(int[] A, int i, int j) {
		int low = i;
		int mid = i;
		int high = j;
		while (mid <= high) {
			switch(A[mid]) {
			case 0:
				swap (low ++, mid ++);
				break;
			case 1:
				mid ++;
				break;
			case 2:
				swap (mid, high --);
				break;
			}
		}
		
	}

	private static void printArray() {
		for(int i = 0; i < n; i++) {
			System.out.print(A[i] + " ");
		}
		
	}
	
	private static void swap(int i, int j) {
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
		
	}
}
