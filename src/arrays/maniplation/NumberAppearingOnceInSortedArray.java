package arrays.maniplation;
public class NumberAppearingOnceInSortedArray {
	static int A[] = new int[] {1,1,2,2,3,3,4,4,5,6,6,7,7,8,8};
	static int n = A.length;
	public static void main(String args[]) {
		findMissing(A, 0, n - 1);
	}
	private static void findMissing(int[] A, int low, int high) {
		if (low > high)
			return;
		if (low == high) {
			System.out.println("Missing element: " + A[low]);
			return;
		}
		int mid = (low + high)/2;
		if (mid % 2 == 0) {
			if (A[mid] == A[mid + 1]) {
				findMissing (A, mid + 2, high);
			} else {
				findMissing (A, low, mid);
			}
		} else {
			if (A[mid] == A[mid - 1]) {
				findMissing (A, mid - 2, high);
			} else {
				findMissing (A, low, mid - 1);
			}
		}
	}
}
