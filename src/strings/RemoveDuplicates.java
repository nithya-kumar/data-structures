package strings;

import java.util.LinkedHashSet;

public class RemoveDuplicates {

public static void main(String args[]) {
	String str = "committment";
	System.out.println("String after removing the duplicate characters:");
	removeDuplicates(str);
}

private static void removeDuplicates(String str) {
	LinkedHashSet<Character> hashSet = new LinkedHashSet<Character>();
	for (int i = 0; i < str.length(); i ++) {
		hashSet.add(str.charAt(i));
	}
	for (Character ch : hashSet) {
		System.out.print(ch);
	}
}
}
