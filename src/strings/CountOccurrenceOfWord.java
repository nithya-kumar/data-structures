package strings;

import java.util.HashMap;
import java.util.Map;

public class CountOccurrenceOfWord {
	public static void main(String args[]) {
		Map<String, Integer> wordCountMap = new HashMap<String, Integer>();
		String str = "nithya kumar nithya kumar nithya kumar";
		String[] strArray = str.split(" ");
		for (String string : strArray) {
			if (wordCountMap.containsKey(string)) {
				wordCountMap.put(string, wordCountMap.get(string) + 1);
			} else {
				wordCountMap.put(string, 1);
			}
		}
		System.out.println("MAP:: " + wordCountMap);
	}
}
