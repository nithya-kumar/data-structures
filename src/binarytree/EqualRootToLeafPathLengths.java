package binarytree;

import java.util.HashMap;

public class EqualRootToLeafPathLengths {
	public static void main (String args[]) {
		BinarySearchTreeImpl tree = new BinarySearchTreeImpl();
		pathCounter(tree.root);
	}

	private static void pathCounter(Node node) {
		HashMap<Integer, Integer> countMap = new HashMap<Integer, Integer>();
		countUtil (node, countMap, 1);
		for (Integer key : countMap.keySet()) {
			System.out.println("Paths having length " + key + ": " + countMap.get(key));
		}
	}

	private static void countUtil(Node node,
			HashMap<Integer, Integer> countMap, int pathLen) {
		if (node == null) {
			return;
		}
		if (node.left == null && node.right == null) {
			if (countMap.containsKey(pathLen)) {
				countMap.put(pathLen, countMap.get(pathLen) + 1);
			} else {
				countMap.put(pathLen, 1);
			}
			return;
		}
		countUtil (node.left, countMap, pathLen + 1);
		countUtil (node.right, countMap, pathLen + 1);
	}
}
