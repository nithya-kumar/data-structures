package strings;

public class StringPermutation {

	public static String str = "nithya";
	public static char[] strArray = str.toCharArray();
	public static int strLen = strArray.length;
	
	public static void main(String args[]) {
		permute(strArray, 0, strLen - 1);
	}

	private static void permute(char[] str, int l, int r) {
		if (l == r) {
			System.out.println(str);
		}
		else {
			for(int  i = l; i <= r; i++) {
				swap (l, i);
				permute (str, l + 1, r);
				swap (l, i);
			}
		}
	}

	private static void swap(int index1, int index2) {
		char temp = ' ';
		temp = strArray[index1];
		strArray[index1] = strArray[index2];
		strArray[index2] = temp;
	}
}
