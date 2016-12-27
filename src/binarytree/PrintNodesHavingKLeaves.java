package binarytree;

public class PrintNodesHavingKLeaves {
	public static void main (String args[]) {
		BinarySearchTreeImpl tree = new BinarySearchTreeImpl();
		int k = 2;
		printNodesHavingKLeaves(tree.root, k);
	}

	private static int printNodesHavingKLeaves(Node node, int k) {
		int sum = 0;
		if (node == null) {
			return 0;
		}
		if (node.left == null && node.right == null) {
			return 1;
		}
		sum = printNodesHavingKLeaves(node.left, k) + printNodesHavingKLeaves(node.right, k);
		if (sum == k) {
			System.out.println(node.data + " ");
		}
		return sum;
	}
}
