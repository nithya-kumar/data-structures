package arrays.sorting;

public class ZigZagSort {
	static int A[] = new int[] {19, 24, 12, 9, 15, 26, 5, 21, 14, 32};
	static int n = A.length;
	public static void main(String args[]) {
		System.out.println("UNSORTED ARRAY");
		printArray();
		zigZagSort(A, n - 1);
		System.out.println("\nSORTED ARRAY");
		printArray();
	}
	private static void zigZagSort(int[] A, int n) {
		boolean flag = true;
		for (int i = 0; i < n - 1; i ++) {
			if (flag) {
				if (A[i] > A[i + 1]) {
					swap (i, i + 1);
				}
			} else {
				if (A[i] < A[i + 1]) {
					swap (i, i + 1);
				}
			}
			flag = !flag;
		}
		
	}
	private static void swap(int i, int j) {
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
		
	}
	private static void printArray() {
		for(int i = 0; i < n; i++) {
			System.out.print(A[i] + " ");
		}
		
	}
}
