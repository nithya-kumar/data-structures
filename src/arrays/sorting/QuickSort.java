package arrays.sorting;

public class QuickSort {
	static int A[] = new int[] {19, 24, 12, 9, 15, 26, 5, 21, 14, 32};
	static int n = A.length;
	public static void main(String args[]) {
		System.out.println("UNSORTED ARRAY");
		printArray();
		quickSort(A, 0, n-1);
		System.out.println("\nSORTED ARRAY");
		printArray();
	}
	private static void quickSort(int[] A, int p, int r) {
		if (p < r) {
			int q = partition(A, p, r);
			quickSort(A, p, q - 1);
			quickSort(A, q + 1, r);
		}
		
	}
	private static int partition(int[] A, int p, int r) {
		int pivot = A[r];
		int i = p - 1;
		for (int j = p; j < r; j++) {
			if (A[j] <= pivot) {
				i ++;
				swap (j, i);
			}
		}
		swap (i + 1, r);
		return i + 1;
		
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
