package binarytree;

import java.util.Collections;
import java.util.HashMap;

public class MaxLevelSum {
	static int levelSum = 0;
	public static void main (String args[]) {
		BinarySearchTreeImpl tree = new BinarySearchTreeImpl();
		levelOrderTraversal(tree.root);
	}

	private static void levelOrderTraversal(Node root) {
		HashMap<Integer, Integer> sumMap = new HashMap<Integer, Integer>();
		int height = getHeight(root);
		for (int level = 1; level <= height; level++) {
			levelSum = 0;
			printLevel (root, level);
			sumMap.put(level, levelSum);
		}
		System.out.print("Maximum level sum:" + Collections.max(sumMap.values()));
	} 
	private static void printLevel(Node root, int level) {
		if (root == null) {
			return;
		}
		if (level == 1) {
			levelSum = levelSum + root.data;
		}
		else {
			printLevel (root.left, level - 1);
			printLevel (root.right, level - 1);
		}
		
	}

	private static int getHeight(Node root) {
		if (root == null) {
            return 0;
        }
        else {
	        int leftHeight = getHeight(root.left);
	        int rightHeight = getHeight(root.right);
            if (leftHeight > rightHeight) {
                return (leftHeight + 1);
            } else {
               return (rightHeight + 1);
            }
        }
	}
}
