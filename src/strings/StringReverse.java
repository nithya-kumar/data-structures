package strings;

import java.util.Arrays;

public class StringReverse {
	public static void main (String args[]) {
		String str = "nithya";
		char[] strArray = str.toCharArray();
		int first = 0;
		int last = strArray.length - 1;
		char temp;
		while (first <= last) {
			temp = strArray[first];
			strArray[first] = strArray[last];
			strArray[last] = temp;
			first ++;
			last --;
		}
		System.out.println("Reversed String: " + new String(strArray));
		Arrays.sort(strArray);
		System.out.println("Sorted String: " + new String(strArray));
	}
}
