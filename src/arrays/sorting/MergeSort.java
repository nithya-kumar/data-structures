package arrays.sorting;

public class MergeSort {
	static int A[] = new int[] {19, 24, 12, 9, 15, 26, 5, 21, 14, 32};
	static int n = A.length;
	public static void main(String args[]) {
		System.out.println("UNSORTED ARRAY");
		printArray();
		mergeSort(A, 0, n-1);
		System.out.println("\nSORTED ARRAY");
		printArray();
	}
	private static void mergeSort(int[] A, int p, int r) {
		if (p < r) {
			int q = (p + r)/2;
			mergeSort(A, p, q);
			mergeSort(A, q+1, r);
			merge(A, p, q, r);
		}
		
	}
	private static void merge(int[] A, int p, int q, int r) {
		int n1 = q - p + 1;
		int n2 = r - q;
		
		int left[] = new int [n1];
		int right[] = new int [n2];
		
		for (int i = 0; i < n1; i ++) {
			left[i] = A[p + i];
		}
		
		for (int i = 0; i < n2; i ++) {
			right[i] = A[q + 1 + i];
		}
		
		int k = p;
		int i = 0;
		int j = 0;
		
		while (i < n1 && j < n2) {
			if (left[i] <= right[j]) {
				A[k] = left[i];
				i ++;
			} else {
				A[k] = right[j];
				j ++;
			}
			k ++;
		}
		while (i < n1) {
			A[k] = left[i];
			i++;
			k++;
		}
		while (j < n2) {
			A[k] = right[j];
			j++;
			k++;
		}
		
	}
	private static void printArray() {
		for(int i = 0; i < n; i++) {
			System.out.print(A[i] + " ");
		}
		
	}
}
