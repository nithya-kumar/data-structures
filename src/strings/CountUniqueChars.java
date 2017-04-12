package strings;

import java.util.HashMap;
import java.util.Map;

public class CountUniqueChars {

	public static void main (String args[]) {
		String str = "aabbcccddee";
		countUniqueChars(str);
	}

	private static void countUniqueChars(String str) {
		HashMap<Character, Integer> uniqueCharMap = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i ++) {
			if (!uniqueCharMap.containsKey(str.charAt(i))) {
				uniqueCharMap.put(str.charAt(i), 1);
			} else {
				uniqueCharMap.put(str.charAt(i), uniqueCharMap.get(str.charAt(i)) + 1);
			}
		}
		for (Map.Entry entry : uniqueCharMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
